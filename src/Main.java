import java.util.*;

public class Main {

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

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        dest = new int[n+1];
        Arrays.fill(dest,Integer.MAX_VALUE);
        graph = new ArrayList<>();
        check = new boolean[n+1];
        for (int i = 0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for (int i = 0 ;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        main.solution(1);
    }
}