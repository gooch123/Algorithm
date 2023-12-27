//02-01.큰 수 출력하기
public class Bigger_number {

    public void solution(int num,int[] arr){

        for(int i=0; i<num; i++){
            if(i==0) System.out.print(arr[i] + " ");
            else {
                if(arr[i] > arr[i-1]) System.out.print(arr[i]+" ");
            }
        }
    }

}
