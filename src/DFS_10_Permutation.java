import java.util.Arrays;
import java.util.Scanner;

//8-5. 동전교환
public class DFS_10_Permutation {

    static int n;
    static int[] arr;
    static int cost;
    static int answer = Integer.MAX_VALUE;

    public void solution(int L, int sum) {
        if(sum > cost || L>=answer){
            return;
        }
        if(sum == cost){
            answer = Math.min(answer,L);
        }else {
            for (int i = arr.length-1; i>= 0;i--){
                solution(L+1,sum+arr[i]);
            }
        }
    }

//    Main main = new Main();
//    Scanner sc = new Scanner(System.in);
//    n = sc.nextInt();
//    arr = new int[n];
//        for (int i =0; i < n; i++)
//    arr[i] = sc.nextInt();
//        Arrays.sort(arr);
//    cost = sc.nextInt();
//        main.solution(0,0);
//        System.out.println(answer);

}
