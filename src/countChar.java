public class countChar{

    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

//        for (int i =0; i<str.length(); i++){
//            if(str.charAt(i) == c){
//                answer++;
//            }
//        }

        for (char x : str.toCharArray()) {
            if(x == c){
                answer++;
            }
        }

        return answer;
    }

}
