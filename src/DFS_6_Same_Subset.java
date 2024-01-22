import java.util.Arrays;

//8-1. 합이 같은 부분집합
public class DFS_6_Same_Subset {

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

//    int n = sc.nextInt();
//    arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//        arr[i] = sc.nextInt();
//    }
//    dest = Arrays.stream(arr).sum();
//        main.solution(0,0);
//        System.out.println(answer);

}
