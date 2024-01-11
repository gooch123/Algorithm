import java.util.Stack;

//5-5.쇠막대기
public class Stack_5_Laser {

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

}
