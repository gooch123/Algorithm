import java.util.Collections;
import java.util.TreeSet;

//4-5.k번째 큰 수
public class Treeset_1 {

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

}
