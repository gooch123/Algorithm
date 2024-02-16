//8-8.수열 추측하기
public class DFS_13_Pascal {

    static int n;
    static int[] arr,perm;
    static int r;
    static boolean[] ch;
    static boolean flag = false;

    public void solution(int L,int sum) {
        if(flag) return;
        if (L == n) {
            if (sum == r) {
                for (int i : perm) {
                    System.out.print(i + " ");
                }
                flag = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if(!ch[i]){
                ch[i] =true;
                perm[L] = i;
                solution(L+1,sum + (arr[L]*perm[L]));
                ch[i] = false;
            }
        }
    }

    static int factorial(int n){
        int result = 1;
        for (int i=n; i >= 1 ;result = result * i--){}
        return result;
    }

//    n = sc.nextInt();
//    r = sc.nextInt();
//    arr = new int[n];
//    perm = new int[n];
//    ch = new boolean[n+1];
//        for (int i = 0; i < n; i++) {
//        arr[i] = factorial(n-1)/(factorial(n-1-i)*factorial(i));
//    }
//        main.solution(0,0);

}
