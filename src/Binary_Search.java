import java.util.Arrays;

//6-8.이분검색
public class Binary_Search {

    public void solution(int n,int m, int[] arr){
        Arrays.sort(arr);
        int left = 0, right = n-1, mid = 0;
        while (true){
            mid = (left+right)/2;
            if(arr[mid] == m){
                System.out.println(mid + 1);
                return;
            } else if (m > arr[mid]) {
                left = mid + 1;
            } else if (m < arr[mid]) {
                right = mid -1;
            }
        }
    }

}
