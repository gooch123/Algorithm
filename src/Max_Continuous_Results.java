//3-3.최대 매출
public class Max_Continuous_Results {

    public void solution(int n,int k,int[] list){

        int max;
        int sum = 0;
        for (int i=0;i<k;i++) sum += list[i];
        max = sum;
        for (int i=k;i<n;i++){
            sum += (list[i]-list[i-k]);
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }

}
