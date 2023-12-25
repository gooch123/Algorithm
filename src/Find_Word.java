// 3. 문장 속 단어
public class Find_Word {

    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if(x.length() > max){
//                max = len;
//                answer = x;
//            }
//        }
        while ((pos = str.indexOf(' '))!=-1){ // 띄어쓰기를 발견하지 못하면 -1 리턴, 발견하면 발견한 띄어쓰기의 인덱스 반환
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len > max){
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > max) answer = str;

        return answer;
    }

}
