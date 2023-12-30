import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public void solution(int num,int[] arr){



    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        T.solution(num,arr);
    }
}