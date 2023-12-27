//2-3.가위바위보
public class Rock_Scissors_Paper {

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

}
