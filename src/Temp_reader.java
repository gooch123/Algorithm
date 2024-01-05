//2-11. 임시 반장 정하기
public class Temp_reader {

    public void solution(int num,int[][] arr){
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int me=1;me<=num;me++){
            int count = 0;
            for (int other=1;other<=num;other++){ //학년
                for (int grade = 1; grade<=5; grade++ ){
                    if (me == other) continue;
                    if(arr[me][grade] == arr[other][grade]) {
                        count++;
                        break;
                    }
                }
            }
            if(count > max){
                max = count;
                result  = me;
            }
        }
        System.out.println(result);
    }

}
