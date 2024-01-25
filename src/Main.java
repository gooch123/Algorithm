import java.util.*;

public class Main {

    static int limit;
    static int[][] arr;
    static int answer = Integer.MIN_VALUE;

    public void solution(int score,int time, int index) {
        if (time <= limit)
            answer = Math.max(answer, score);
        if (time > limit || index >= arr.length) return;
        solution(score + arr[index][0], time + arr[index][1], index + 1);
        solution(score, time, index + 1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        limit = sc.nextInt();
        arr = new int[n][2];
        for(int i = 0 ; i<n; i++){
            for (int j=0;j<2;j++)
                arr[i][j] = sc.nextInt();
        }
        main.solution(0,0,0);
        System.out.println(answer);
    }
}