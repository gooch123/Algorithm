import java.util.Stack;

//5-2.괄호 안의 문자 제거
public class Stack_2 {

    public void solution(String str){
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x != ')') stack.push(x);
            else {
                while (stack.pop() != '('){}
            }
        }
        for (Character x : stack) {
            System.out.print(x);
        }
    }

}
