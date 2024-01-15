//6-3.삽입 정렬
public class Insertion_sort {

    public void solution(int n, int[] arr){
        int i,j;
        for (i = 0;i<n-1;i++){
            int temp = arr[i+1];
            for (j=i;j>=0 && arr[j]>temp ; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
