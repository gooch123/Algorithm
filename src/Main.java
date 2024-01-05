import java.util.*;

public class Main {

    public void solution(int[] first, int[] second){
        List<Integer> sum = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j=0;j<second.length;j++){
            hashSet.add(second[j]);
        }

        for (int i=0;i<first.length;i++){
            if(hashSet.contains(first[i]))
                sum.add(first[i]);
        }

        Collections.sort(sum);
        for (int j=0; j<sum.size();j++)
            System.out.print(sum.get(j) + " ");
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int first_length = sc.nextInt();
        int[] first = new int[first_length];
        for (int i=0; i<first_length; i++){
            first[i] = sc.nextInt();
        }
        int second_length = sc.nextInt();
        int[] second = new int[second_length];
        for (int i=0; i<second_length; i++){
            second[i] = sc.nextInt();
        }
        T.solution(first,second);
    }
}