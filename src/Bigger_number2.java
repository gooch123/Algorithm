//2-2.보이는 학생
public class Bigger_number2 {

    public void solution(int num,int[] arr){

        int max = 0;
        int count = 0;
        for(int i=0; i<num; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }

}
