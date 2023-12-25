import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(T.solution(x));
    }
}