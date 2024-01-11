import java.util.*;

public class Main {

    public void solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1) == '('){
                    answer += stack.size();
                }else {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        main.solution(str);
    }
}