import java.util.*;



public class Main {

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

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++)
            arr[i] = sc.nextInt();
        main.solution(n,m,arr);
    }
}