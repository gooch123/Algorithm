import java.util.ArrayList;

//2-6.뒤집은 소수
public class Reverse_Prime_number {

    public void solution(int num, ArrayList<Integer> arr){

        int[] result = new int[num];
        for (int i =0;i<num;i++){
            char[] temp = String.valueOf(arr.get(i)).toCharArray();
            int head= 0, rear = temp.length-1;
            while (head < rear){
                char tmp = temp[head];
                temp[head] = temp[rear];
                temp[rear] = tmp;
                head++;
                rear--;
            }
            result[i] = Integer.parseInt(String.valueOf(temp));
            if(isPrime(result[i])) System.out.print(result[i] + " ");
        }

    }

    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int j=2; j*j<=num; j++){
            if(num % j == 0) return false;
        }
        return true;
    }

}
