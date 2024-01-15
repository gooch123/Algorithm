import java.util.Arrays;

//6-5.중복 체크
public class Duplicate_Check {

    public void solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for (int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1])
                answer = "D";
        }
        System.out.println(answer);
    }

}
