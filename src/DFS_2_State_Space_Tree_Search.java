import java.util.LinkedList;
import java.util.Queue;

//7.8-송아지 찾기
public class DFS_2_State_Space_Tree_Search {

    static int answer = 0;
    static int[] dis = {1,-1,5};
    static boolean[] check = new boolean[10001];
    static Queue<Integer> queue = new LinkedList<>();

    public void solution(int start, int dest){
        queue.add(start);
        check[start] = true;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i<len; i++){
                int poll = queue.poll();
                if (poll == dest) {
                    System.out.println(answer);
                    return;
                }
                for (int di : dis) {
                    int sum = poll + di;
                    if(sum >= 1 && sum <= 10000 && !check[sum]) {
                        queue.add(sum);
                        check[sum] = true;
                    }
                }
            }
            answer++;
        }
    }

}
