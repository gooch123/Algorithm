//7.회문 문자열 판독
public class Palindrome {

    public String solution(String str){
        str = str.toUpperCase();
        char[] charArray = str.toCharArray();
        int head=0,rear= charArray.length-1;
        while (head<rear){
            if(charArray[head] == charArray[rear]){
                head++;
                rear--;
            }else{
                return "NO";
            }
        }
        return "YES";
    }

}
