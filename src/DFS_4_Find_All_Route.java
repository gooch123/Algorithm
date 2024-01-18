import java.util.Arrays;

public class DFS_4_Find_All_Route {

    static int[][] route;
    static int fin;
    static int count = 0;

    public void solution(int start,boolean[] visit){
        boolean[] visited = Arrays.copyOf(visit,visit.length); //이 경로가 지났던 정점들
        if(start == fin){
            count++;
            return;
        }
        for (int i = 0; i< route.length; i++){
            if(route[i][0] == start) {
                int now = route[i][0];
                int dest = route[i][1];
                visited[now] = true;
                if(!visited[dest]){
                    solution(dest,visited);
                }
            }
        }
    }

//    int n = sc.nextInt();
//    int m = sc.nextInt();
//    fin = n;
//    route = new int[m][2];
//        for (int i = 0; i<m; i++){
//        for (int j = 0; j<2; j++)
//            route[i][j] = sc.nextInt();
//    }
//        main.solution(1, new boolean[n+1]);
//        System.out.println("경로의 수 = " + count);

}
