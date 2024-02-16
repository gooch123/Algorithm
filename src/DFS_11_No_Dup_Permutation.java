import java.util.Scanner;

//8-6. 순열 구하기
public class DFS_11_No_Dup_Permutation {

    static int n;
    static int m;
    static int[] arr;

    public void solution(int L,int[] list,boolean[] check) {
        if(L==m){
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else {
            for (int i = 0;i<n;i++){
                if(check[i])
                    continue;
                list[L] = arr[i];
                check[i] = true;
                solution(L+1,list,check);
                check[i] = false;
            }
        }
    }

//    Main main = new Main();
//    Scanner sc = new Scanner(System.in);
//    n = sc.nextInt();
//    m= sc.nextInt();
//    arr = new int[n];
//        for (int i=0;i<n;i++)
//    arr[i] = sc.nextInt();
//        main.solution(0,new int[m],new boolean[n]);

}
