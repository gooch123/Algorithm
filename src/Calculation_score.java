//2-7.점수 계산
public class Calculation_score {

    public void solution(int num,int[] arr){

        int score = 0;
        int totalScore = 0;
        for (int i=0;i<num;i++){
            if(arr[i] == 1)
                totalScore += ++score;
            else
                score = 0;
        }
        System.out.print(totalScore + " ");

    }

}
