//7-3.재귀함수를 이용한 팩토리얼
public class Recursive_3_Factorial {

    public int solution(int n){
        if(n == 1) return n;
        else return n * solution(n-1);
    }

}
