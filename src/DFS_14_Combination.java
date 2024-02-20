//8-9. 조합 구하기
public class DFS_14_Combination {

    static int n;
    static int depth;

    public void solution(int L,int[] arr,int k) {
        if (L == depth) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = k; i < n; i++) {
            arr[L] = i+1;
            solution(L+1,arr,i+1);
        }
    }

//    n = sc.nextInt();
//    depth = sc.nextInt();
//        main.solution(0,new int[depth],0);

}
