//9.숫자만 추출
public class Find_digit {

    public int solution(String str){
        String tmp = "";
        for (int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                tmp += str.charAt(i);
        }

        return Integer.parseInt(tmp);
    }

}
