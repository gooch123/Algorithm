//3-4.연속 부분수열
public class Continuous_Subsequence {

    public void solution(int n,int k,int[] list){
        int count = 0;
        int head =0, rear = 0;
        int sum = 0;
        while (true){
            if(sum < k){
                if(rear == n)
                    break;
                sum += list[rear++];
            } else if (sum > k) {
                sum -= list[head++];
            } else if (sum == k) {
                count ++;
                if(rear == n)
                    break;
                sum += (list[rear++] - list[head++]);
            }
        }
        System.out.println(count);
    }

}
