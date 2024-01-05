//2-10.봉우리
public class Mountain {

//    int num = sc.nextInt();
//    int[][] arr = new int[num+2][num+2];
//        for (int i =1;i<num+1;i++){
//        for (int j=1;j<num+1;j++){
//            arr[i][j] = sc.nextInt();
//        }
//    }

    public void solution(int num,int[][] arr){
        int count =0;
        for (int i=1;i<num+1;i++){
            for (int k=1;k<num+1;k++){
                int me = arr[i][k];
                if(me > arr[i-1][k] && me > arr[i+1][k] && me > arr[i][k-1] && me > arr[i][k+1]) count++;
            }
        }
        System.out.println(count);
    }

}
