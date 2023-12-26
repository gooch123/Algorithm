//11.문자열 압축

public class Continuous_char {

    public void solution(String str){
        String result = "";
        int count = 0;
        char c = 0;
        for (int i =0;i<str.length();i++){
            if(c != str.charAt(i)){
                if(count > 1) result += count;
                result += str.charAt(i);
                count = 1;
                c = str.charAt(i);
            }else {
                count++;
            }
        }
        if(count > 1) result+=count;
        System.out.println(result);
    }

}
