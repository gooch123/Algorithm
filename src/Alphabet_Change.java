//5.특정 문자 뒤집기

public class Alphabet_Change {

    public String solution(String str){
        String answer = "";
        char[] temp = str.toCharArray();
        int head =0,rear = temp.length-1;
        char t;
        while (head < rear){
            if(Character.isAlphabetic(temp[head])){}
            else {
                head++;
                continue;
            }
            if(Character.isAlphabetic(temp[rear])){}
            else {
                rear--;
                continue;
            }
            t = temp[head];
            temp[head] = temp[rear];
            temp[rear] = t;
            head++;
            rear--;
        }

        answer = String.valueOf(temp);
        return answer;
    }

}
