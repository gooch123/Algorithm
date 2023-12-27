import java.util.Scanner;

public class Main {

    public void solution(int num,int[][] arr){

        for (int i=0;i<num;i++){
            if(arr[0][i] == 1){
                if(arr[1][i] == 1) System.out.println("D");
                if(arr[1][i] == 2) System.out.println("B");
                if(arr[1][i] == 3) System.out.println("A");
            }
            if(arr[0][i] == 2){
                if(arr[1][i] == 1) System.out.println("A");
                if(arr[1][i] == 2) System.out.println("D");
                if(arr[1][i] == 3) System.out.println("B");
            }
            if(arr[0][i] == 3){
                if(arr[1][i] == 1) System.out.println("B");
                if(arr[1][i] == 2) System.out.println("A");
                if(arr[1][i] == 3) System.out.println("D");
            }
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[2][num];
        for (int k=0;k<2;k++){
            for (int i=0;i<num;i++){
                arr[k][i] = sc.nextInt();
            }
        }

        T.solution(num,arr);
    }
}