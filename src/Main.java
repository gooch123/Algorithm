import java.util.*;
import java.util.HashMap;

public class Main {

    public void solution(int n,int k,int[] list){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0 ; i< k-1 ; i++){
            map.put(list[i],map.getOrDefault(list[i],0) + 1);
        }
        int head = 0;
        for (int rear = k - 1 ; rear < n ; rear++){
            map.put(list[rear],map.getOrDefault(list[rear],0) + 1);
            answer.add(map.size());
            map.put(list[head],map.get(list[head])-1);
            if(map.get(list[head]) == 0)
                map.remove(list[head]);
            head++;
        }
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];
        for (int i =0;i<n;i++){
            list[i] = sc.nextInt();
        }
        T.solution(n,k,list);
    }
}