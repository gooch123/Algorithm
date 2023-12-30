//2-8.등수 구하기
public class Rank {

    public void solution(int num,int[] arr){

        for (int i= 0;i<num;i++){
            int rank = 1;
            for (int k=0;k<num;k++){
                if(arr[i] < arr[k]) rank++;
            }
            System.out.print(rank + " ");
        }
    }

}
