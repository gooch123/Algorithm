//7-2.재귀함수를 이용한 이진수
public class Recursive_2 {

    public void solution(int n){
        if(n == 0) return;
        else solution(n/2);
        System.out.print(n%2);
    }

}
