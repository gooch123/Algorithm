import java.util.LinkedList;
import java.util.Queue;

//5-7.교육과정 설계
public class Queue_2 {

    public void solution(String str1, String str2){
        Queue<Character> q = new LinkedList<>();
        String answer = "YES";
        for (Character x : str1.toCharArray()) {
            q.add(x);
        }
        for (char x : str2.toCharArray()) {
            if(q.contains(x)){
                if(x != q.poll()) answer = "NO";
            }
        }
        if(!q.isEmpty()) answer = "NO";
        System.out.println(answer);
    }

}
