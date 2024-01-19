import java.util.ArrayList;
import java.util.Arrays;

//7-11.경로탐색(인접행렬)
public class DFS_5_Find_All_Route_ArrayList {

    static ArrayList<ArrayList<Integer>> graph;
    static int dest;
    static int answer = 0;
    static boolean[] check;

    public void solution(int start){
        if(start == dest){
            answer++;
            Arrays.fill(check, false);
            return;
        }
        check[start] = true;
        for (int i = 0; i<graph.get(start).size(); i++){
            int next = graph.get(start).get(i);
            if(!check[next])
                solution(next);
        }
    }

//    int n = sc.nextInt();
//    int m = sc.nextInt();
//    dest = n;
//    check = new boolean[n+1];
//    graph = new ArrayList<>();
//        for (int i = 0; i<= n ; i++){
//        graph.add(new ArrayList<>());
//    }
//        for (int i = 0 ; i<m; i++){
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        graph.get(a).add(b);
//    }
//        main.solution(1);
//        System.out.println(answer);

}
