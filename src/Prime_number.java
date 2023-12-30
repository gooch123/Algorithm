//2-5.소수 구하기
public class Prime_number {

    public void solution(int num){

        int count = 0;
        for (int i=2;i<=num;i++){
            if(isPrime(i))
                count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num){
        for(int j=2; j*j<=num; j++){
            if(num % j == 0) return false;
        }
        return true;
    }

}
