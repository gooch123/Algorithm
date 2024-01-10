import java.util.HashMap;

//4-4.모든 아나그램 찾기
public class All_Anagram {

    public void solution(String S, String T){
        int count = 0;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (char c : T.toCharArray()) {
            tmap.put(c,tmap.getOrDefault(c,0) + 1);
        }
        for (int i = 0;i<T.length()-1; i++)
            smap.put(S.toCharArray()[i],smap.getOrDefault(S.toCharArray()[i],0) + 1);
        int head = 0;
        for (int rear = T.length()-1; rear < S.length(); rear++){
            smap.put(S.toCharArray()[rear],smap.getOrDefault(S.toCharArray()[rear],0) + 1);
            if(smap.equals(tmap)) count++;
            smap.put(S.toCharArray()[head],smap.get(S.toCharArray()[head])-1);
            if(smap.get(S.toCharArray()[head]) == 0)
                smap.remove(S.toCharArray()[head]);
            head++;
        }
        System.out.println(count);
    }

}
