import java.util.Arrays;

//6-6.장난꾸러기
public class Sort_Compare {

    public void solution(int n, int[] arr){
        int[] dup = new int[n];
        for (int i = 0;i<n;i++){
            dup[i] = arr[i];
        }
        Arrays.sort(dup);
        int cnt = 0;
        int fir = 0, sec = 0;
        for (int i = 0;i<n && cnt <2 ; i++){
            if (dup[i] != arr[i]){
                if(cnt == 0)
                    fir = i+1;
                else
                    sec = i+1;
                cnt++;
            }
        }
        System.out.println(fir + " " + sec);
    }

}
