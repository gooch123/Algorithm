import java.util.LinkedList;
import java.util.Queue;

//5-6.공주 구하기
public class Queue_1 {

    public void solution(int n, int k){
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i<=n; i++){
            q.add(i);
        }
        int answer = 0;
        while (!q.isEmpty()){
            for (int i =1; i<k;i++) q.add(q.poll());
            answer = q.poll();
        }
        System.out.println(answer);
    }

}
