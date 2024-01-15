//6-2.버블 정렬
public class Bubble_Sort {

    /**
     * 버블 정렬로 정렬
     * @param n 배열의 길이
     * @param arr 정렬할 배열
     */
    public void solution(int n, int[] arr){
        for (int i = 0;i < n ;i++){
            for (int j = 0 ; j < n-i-1; j ++){
                if(arr[j] > arr[j+1])
                    swap(j,j+1,arr);
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int fir, int sec, int[] arr){
        int temp = arr[fir];
        arr[fir] = arr[sec];
        arr[sec] = temp;
    }

}
