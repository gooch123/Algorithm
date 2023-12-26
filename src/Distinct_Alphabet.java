//6.중복 문자 제거

public class Distinct_Alphabet {

    public String solution(String str){
        String answer = "";
        //Stream으로 풀기
//        answer = str.chars()
//                .distinct()
//                .mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.joining());
        char[] temp = {};
        for (int i =0; i< str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

}
