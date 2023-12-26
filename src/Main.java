import java.util.Scanner;

public class Main {

    public void solution(String str){
        String result = "";
        int count = 0;
        char c = 0;
        for (int i =0;i<str.length();i++){
            if(c != str.charAt(i)){
                if(count > 1) result += count;
                result += str.charAt(i);
                count = 1;
                c = str.charAt(i);
            }else {
                count++;
            }
        }
        if(count > 1) result+=count;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        T.solution(x);
    }
}