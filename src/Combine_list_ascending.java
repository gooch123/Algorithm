import java.util.ArrayList;
import java.util.List;

//3-1.두 배열 합치기
public class Combine_list_ascending {

    public void solution(int[] first, int[] second){
        int i=0,k=0;
        List<Integer> sum = new ArrayList<>();
        while (i < first.length && k < second.length){
            if(first[i] < second[k]){
                sum.add(first[i++]);
            }else
                sum.add(second[k++]);
        }
        if(i == first.length)
            for (; k<second.length; k++)
                sum.add(second[k]);
        else if(k == second.length)
            for (; i<first.length; i++)
                sum.add(first[i]);

        for (int j=0; j<sum.size();j++)
            System.out.print(sum.get(j) + " ");
    }

}
