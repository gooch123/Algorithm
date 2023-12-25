//2. 대소문자 변환
public class Upper_Lower{

    public String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);

            if(x >= 65 && x <= 90) answer += (char)(x+32);
            else if (x >= 97 && x <= 122) answer += (char)(x-32);
        }

        return answer;
    }

}
