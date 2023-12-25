import java.util.ArrayList;

//4. 단어 뒤집기
public class Reverse_Word {

    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //StringBuilder 사용
//        for (String s : str) {
//            String tmp = new StringBuilder(s).reverse().toString();
//            answer.add(tmp);
//        }

        //직접 뒤집기
        for (String x : str) {
            char[] s = x.toCharArray();
            swap(s);
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void swap(char[] ch){
        int i =0, j=ch.length-1;
        while (i<j){
            char tmp;
            tmp = ch[i];
            ch[i] = ch[j];
            ch[j] = tmp;
            i++;
            j--;
        }
    }
}
