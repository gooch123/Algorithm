//8-7.메모이제이션
public class DFS_12_Memoization {

    static int[][] arr = new int[35][35];

    public int solution(int n,int r) {
        if(arr[n][r] > 0) return arr[n][r];
        if(n == r || r == 0) return 1;
        else return arr[n][r] = solution(n-1,r-1) + solution(n-1,r);
    }

}
