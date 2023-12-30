//2-5.피보나치 수열
public class Fibo {

    public void solution(int num){

        int[] arr = new int[num];
        arr[0] = arr[1] = 1;
        for (int i=2; i<num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
