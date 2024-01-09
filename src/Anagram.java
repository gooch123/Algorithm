import java.util.HashMap;

//4-2.아나그램
public class Anagram {

    public void solution(String str1, String str2){
        String answer = "YES";
        if(str1.length() != str2.length()) {
            answer = "NO";
            System.out.println(answer);
            return;
        }
        HashMap<Character,Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (char c : str1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }
        for (char c : str2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0) + 1);
        }
        for (Character c : map1.keySet()) {
            if(!map2.containsKey(c)){
                answer = "NO";
                System.out.println(answer);
                return;
            }
            if(!map1.get(c).equals(map2.get(c)))
                answer = "NO";
        }
        System.out.println(answer);
    }

}
