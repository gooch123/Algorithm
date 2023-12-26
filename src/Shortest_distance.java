//10.가장 짧은 문자 거리

public class Shortest_distance {

    public void solution(String str, char c){
        int[] answer = new int[str.length()];
        int[] tmp = new int[str.length()];
        int count = 1000;
        for (int j =0;j<str.length();j++){
            if(str.charAt(j) != c) count++;
            else count = 0;
            answer[j] = count;
        }
        count = 1000;
        for (int i =str.length()-1;i >= 0; i--){
            if(str.charAt(i) != c) count++;
            else count = 0;
            tmp[i] = count;
        }
        for(int i=0;i<answer.length;i++){
            if(answer[i] > tmp[i]){
                answer[i] = tmp[i];
            }
        }
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }

}
