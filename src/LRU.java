//6-4.LRU
public class LRU {

    /**
     *
     * @param s 캐시 사이즈
     * @param n 작업 배열 사이즈
     * @param arr 작업 배열
     */
    public void solution(int s,int n, int[] arr){
        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i =0;i<s;i++) if(cache[i] == x) pos=i; //이미 존재하는 작업의 인덱스
            if(pos > 0){ //캐시에 있는 작업
                int temp = cache[pos];
                for (int i = pos;i>0;i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = temp;
            }else { //캐시에 없는 작업
                for (int i=s-1;i>0;i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }
        for (int i : cache) {
            System.out.print(i + " ");
        }
    }

}
