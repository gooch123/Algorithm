import java.util.Stack;

//5-4. 후위식 연산
public class Stack_4_Postfix {

    public void solution(String str){
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            switch (x){
                case '+':
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '/':
                    stack.push(stack.pop() / stack.pop());
                    break;
                case '*':
                    stack.push(stack.pop() * stack.pop());
                    break;
                case '-':
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second - first);
                    break;
                default:
                    stack.push(Character.getNumericValue(x));
            }
        }
        System.out.println(stack.pop());
    }

}
