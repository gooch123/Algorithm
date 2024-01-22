import java.util.*;

public class Main {

    static int dest;
    static int[] arr;
    static String answer = "NO";

    public void solution(int sum, int index){
        if(sum == dest/2 && dest%2 == 0){
            answer = "YES";
        }
        if (sum > dest/2 || index >= arr.length) {
            return;
        }
        solution(sum+arr[index], index+1);
        solution(sum, index+1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        dest = Arrays.stream(arr).sum();
        main.solution(0,0);
        System.out.println(answer);
    }
}