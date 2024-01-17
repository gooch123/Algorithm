//7-1.재귀함수
public class Recursive_1 {

    public void solution(int n){
        if(n == 0) return;
        else solution(n-1);
        System.out.print(n + " ");
    }

}
