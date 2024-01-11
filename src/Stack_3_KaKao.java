import java.util.Stack;

//5-3.크레인 인형뽑기
public class Stack_3_KaKao {

    public void solution(int n, int[][] board, int m, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int k,select,count = 0;

        for (int i =0 ;i<m; i++){
            for (k = 0; board[k][moves[i]-1] == 0 && k<n-1 ; k++){
            }
            select = board[k][moves[i]-1];
            if(select == 0) continue;
            board[k][moves[i]-1] = 0;
            if(stack.empty()) {
                stack.push(select);
            } else if (stack.peek() == select) {
                stack.pop();
                count += 2;
            }else
                stack.push(select);
        }
        System.out.print(count);
    }

}
