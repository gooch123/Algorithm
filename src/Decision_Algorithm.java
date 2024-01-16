import java.util.Arrays;

//6-9. 결정 알고리즘
public class Decision_Algorithm {

    public void solution(int n,int m, int[] arr){
        int left = Arrays.stream(arr).max().getAsInt(); // 곡이 한개씩만 들어가는 경우 중 가장 작은 수
        int right = Arrays.stream(arr).sum(); // DVD를 한개만 쓰는 경우 중 가장 작은 수
        int mid = 0, answer = 0;
        while (left <= right){
            mid = (left+right) /2;
            if(count(arr,mid) <= m){
                answer = mid;
                right = mid -1;
            }
            else {
                left = mid+1;
            }
        }
        System.out.println(answer);
    }

    public int count(int[] arr, int m){
        int count = 1;
        int sum = 0;
        for (int i : arr) {
            if(sum+i > m){ //합계가 DVD의 용량을 넘어가면
                count++; //DVD 한개 추가
                sum = i; //이번 노래를 새 DVD에 넣음
            }else //아직 용량이 충분하다면
                sum +=i; //DVD에 노래 추가
        }
        return count;
    }

}
