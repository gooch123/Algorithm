//3-5.연속된 자연수의 합
public class Sum_Consecutive_Number {

    public void solution(int n){
        int count = 0;
        int head =1, rear = 1;
        int sum = 0;
        while (head <= n/2){
            if(sum < n) sum += rear++;
            else if (sum > n) {
                sum -= head++;
            } else if (sum == n) {
                count++;
                sum -= head++;
            }
        }
        System.out.println(count);
    }

}
