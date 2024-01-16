import java.util.*;

public class Main {

    public void solution(int n,int m, int[] arr){
        Arrays.sort(arr);
        int answer = 0;
        int left = 1;
        int right = Arrays.stream(arr).max().getAsInt();
        while (left <= right){
            int mid = (left+right)/2;
            if (count(arr,mid) >= m){
                answer = mid;
                left = mid +1;
            } else {
                right = mid-1;
            }
        }
        System.out.println(answer);
    }

    public int count(int[] arr, int distance){
        int ep = 0;
        int count = 1;
        for (int i = 1;i<arr.length;i++){
            if(arr[i] - arr[ep] >= distance){
                count ++;
                ep = i;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        main.solution(n,m,arr);
    }
}