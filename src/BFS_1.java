import java.util.LinkedList;
import java.util.Queue;

//7-7.이진트리 BFS 순회
public class BFS_1 {

    static Queue<Integer> queue = new LinkedList<>();
    static boolean[] check = new boolean[8];
    static int[][] tree = {{},{2,3},{1,4,5},{1,6,7},{2},{2},{6},{7}};

    public void solution(int n){
        queue.add(n);
        while (!queue.isEmpty()){
            int now = queue.poll();
            check[now] = true;
            System.out.print(now + " ");
            for (int i = 0; i < tree[now].length; i++)
                if(!check[tree[now][i]])
                    queue.add(tree[now][i]);
        }
    }

}
