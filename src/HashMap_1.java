import java.util.HashMap;

//4-1.학급회장 찾기
public class HashMap_1 {

    public void solution(int n, String str){
        char answer = ' ';
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        for (char c : arr) {
            map.put(c,map.getOrDefault(c,0) +1);
        }
        int max = Integer.MIN_VALUE;
        for (char c : map.keySet()){
            if(map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }
        System.out.println(answer);
    }

}
