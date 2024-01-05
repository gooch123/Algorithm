import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//3-2.공통원소 구하기
public class Common_Elements {

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

}
