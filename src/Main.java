import java.util.*;

public class Main {

    public void solution(int n){
        int count = 0;
        int head =1, rear = 1;
        int sum = 0;
        while (head <= n/2){
            if(sum < n) sum += rear++;
            else if (sum > n) {
                sum -= head++;
            } else if (sum == n) {
                count++;
                sum -= head++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}