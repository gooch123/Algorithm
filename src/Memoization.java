//7-4.피보나치 재귀
public class Memoization {

    static int[] memo;

    public int solution(int n){
        if(n == 1 || n==2) {
            return 1;
        }
        else {
            if(memo[n-1] == 0){
                memo[n-1] = solution(n-2) + solution(n-1);
            }
            return memo[n-1];
        }
    }

}
