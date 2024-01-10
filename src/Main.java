import java.util.*;
import java.util.HashMap;

public class Main {

    public void solution(int n,int k,int[] arr){
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i<n; i++){
            for (int j = i+1 ; j<n; j++){
                for (int l = j+1; l<n; l++){
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int count = 1;
        for (Integer integer : treeSet) {
            if (count == k) {
                System.out.println(integer);
                return;
            }
            count++;
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }
        main.solution(n,k,arr);
    }
}