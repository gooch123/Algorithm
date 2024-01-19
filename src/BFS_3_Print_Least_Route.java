import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//7-12.그래프 최단거리(BFS)
public class BFS_3_Print_Least_Route {

    static Queue<Integer> queue = new LinkedList<>();
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;
    static int[] dest;

    public void solution(int start){
        queue.add(start);
        int answer = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i =0; i<len; i++){
                Integer poll = queue.poll();
                dest[poll] = Math.min(dest[poll],answer);
                for (Integer x : graph.get(poll)) {
                    if(!check[x]) {
                        queue.add(x);
                        check[x] = true;
                    }
                }
            }
            answer++;
        }
        for (int i=2;i<dest.length;i++){
            System.out.println(i + " : " + dest[i]);
        }
    }

//    int n = sc.nextInt();
//    int m = sc.nextInt();
//    dest = new int[n+1];
//        Arrays.fill(dest,Integer.MAX_VALUE);
//    graph = new ArrayList<>();
//    check = new boolean[n+1];
//        for (int i = 0; i<=n; i++){
//        graph.add(new ArrayList<>());
//    }
//        for (int i = 0 ;i<m;i++){
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        graph.get(a).add(b);
//    }
//        main.solution(1);

}
