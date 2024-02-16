import java.util.Scanner;

//8-4.중복순열
public class DFS_9_DuplicatePermutation {

    static int n;
    static int m;

    public void solution(int L, int[] arr) {
        if(L == m){
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else{
            for (int i =1;i<=n;i++){
                arr[L] = i;
                solution(L+1,arr);
            }
        }

    }

//    Main main = new Main();
//    Scanner sc = new Scanner(System.in);
//    n = sc.nextInt();
//    m = sc.nextInt();
//    int[] arr = new int[m];
//        main.solution(0,arr);

}
