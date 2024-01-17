import java.util.*;

public class Main {

    static int answer = 0;
    static int[] dis = {1,-1,5};
    static boolean[] check = new boolean[10001];
    static Queue<Integer> queue = new LinkedList<>();

    public void solution(int start, int dest){
        queue.add(start);
        check[start] = true;
        while (!queue.isEmpty()){
            for (int i = 0; i< queue.size(); i++){
                int poll = queue.poll();
                if (poll == dest)
                    System.out.println(answer+1);
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

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int des = sc.nextInt();
        main.solution(start,des);
    }
}