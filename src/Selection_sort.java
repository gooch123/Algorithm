//6-1.선택 정렬
public class Selection_sort {

    /**
     * 선택 정렬로 정렬
     * @param n 배열의 길이
     * @param arr 정렬할 배열
     */
    public void solution(int n, int[] arr){
        for (int i =0 ; i<n; i++){
            int least = Integer.MAX_VALUE, least_index = Integer.MIN_VALUE;
            for (int j = i; j<n; j++){
                if(arr[j] < least) {
                    least = arr[j];
                    least_index = j;
                }
            }
            swap(i,least_index,arr);
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
