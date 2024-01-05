import java.util.ArrayList;
import java.util.Collections;

//2-9.격자판 최대합
public class Maximum_sum {

    public void solution(int num,int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<num;i++){
            int sum = 0;
            //가로
            for (int j=0;j<num;j++){
                sum += arr[i][j];
            }
            list.add(sum);
            sum = 0;
            //세로
            for (int k=0;k<num;k++){
                sum += arr[k][i];
            }
            list.add(sum);
            //대각선 - 왼쪽에서 오른쪽으로
            sum = 0;
            sum += arr[i][i];
            list.add(sum);
            //대각선 - 오른쪽에서 왼쪽으로
            sum=0;
            sum += arr[num-1-i][num-1-i];
            list.add(sum);
        }

        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }

}
