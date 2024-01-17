//7-6.부분집합 구하기
public class DFS_1 {

    static int[] check;
    static int k;

    public void solution(int n){
        if(k+1 == n){
            for (int i =1;i<=k;i++){
                if(check[i] == 1)
                    System.out.print(i + " ");
            }
            System.out.println();
        }else {
            check[n] = 1;
            solution(n+1);
            check[n] = 0;
            solution(n+1);
        }
    }

}
