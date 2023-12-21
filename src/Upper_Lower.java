public class Upper_Lower{

    public String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        return answer;
    }

}
