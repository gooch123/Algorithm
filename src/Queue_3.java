import java.util.LinkedList;
import java.util.Queue;

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Queue_3 {

    public void solution(int n, int m, int[] arr){
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i<n; i++){
            q.add(new Person(i,arr[i]));
        }
        int count = 0;
        while (!q.isEmpty()){
            Person first = q.poll();
            for (Person person : q) {
                if (first.priority < person.priority){
                    q.add(first);
                    first = null;
                    break;
                }
            }
            if(first != null){
                count++;
                if(first.id == m){
                    System.out.println(count);
                    return;
                }
            }
        }
    }

}
