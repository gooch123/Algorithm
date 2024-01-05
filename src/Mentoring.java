import java.util.Arrays;

//2-12. 멘토링
public class Mentoring {

    public void solution(int num,int test,Integer[][] arr){
        int count = 0;
        boolean[][] possible = new boolean[num][num];
        for (int my = 0; my< num; my++){
            int me = arr[0][my];
            possible[me-1][me-1] = true;
            for (int i=0 ; i< test;i++){
                int myIndex = Arrays.asList(arr[i]).indexOf(me);
                for (int k = 0; k < num; k++){
                    int other = arr[0][k];
                    int otherIndex = Arrays.asList(arr[i]).indexOf(other);
                    if(otherIndex < myIndex) possible[me-1][other-1] = true;
                }
            }
        }
        for (int i=0;i<num;i++){
            for (int k=0;k<num;k++){
                if (possible[i][k] == false) count++;
            }
        }
        System.out.println(count);
    }

}
