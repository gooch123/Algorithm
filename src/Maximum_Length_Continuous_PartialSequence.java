//3-6.최대길이연속부분수열
public class Maximum_Length_Continuous_PartialSequence {

    public void solution(int n,int k,int[] arr){
        int head=0,rear;
        int max = Integer.MIN_VALUE;
        int[] changeIndex = new int[k];
        int count  = 0;
        for (int i = 0; i<n; i++ ){
            if(arr[i] == 0) {
                changeIndex[count] = i;
                if(++count == k)
                    break;
            }
        }
        count = 0;
        rear = changeIndex[k-1] + 1;
        while (rear != n-1){
            if(max < (rear - head)) max = (rear - head);
            if (arr[rear] == 1) rear++;
            else {
                head = changeIndex[count % k] + 1;
                changeIndex[count % k] = rear;
                rear ++;
                count ++;
            }
        }
        System.out.println(max);
    }

}
