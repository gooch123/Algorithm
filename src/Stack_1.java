import java.util.Stack;

//5-1.올바른 괄호 판별
public class Stack_1 {

    public void solution(String str){
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (int i =0;i<str.length(); i++){
            if(str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else {
                if(stack.empty()){
                    System.out.println("NO");
                    return;
                }else
                    stack.pop();
            }
        }
        if(!stack.empty())
            answer = "NO";
        System.out.println(answer);
    }

}
