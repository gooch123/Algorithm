import java.util.*;

public class Main {

    static ArrayList<Integer>[] arr_list;

    public void solution(int start,boolean[] visit){

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr_list = new ArrayList[n+1];
        for (ArrayList<Integer> list : arr_list) {
            list = new ArrayList<>();
        }
        int[][] arr = new int[m][2];
        for (int i =0 ; i<m; i++){
            for (int j = 0;j<2; j++)
                arr[i][j] = sc.nextInt();
        }
        for (int i = 0; i<m ; i++){
            for (int j=0;j<2;j++)
                arr_list[arr[i][0]].add(arr[i][1]);
        }
        main.solution(1, new boolean[n+1]);
    }
}