//8.유효한 팰린드롬

public class Palindrome_with_regex {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        if(str.equals(new StringBuilder(str).reverse().toString())) answer = "YES";

        return answer;
    }

}
