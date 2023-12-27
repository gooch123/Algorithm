//12.암호
public class Password {

    public void solution(int num,String str){

        String result = "";
        String radix = "";
        for(int i=0;i<num;i++){
            for (int k=i*7;k< i*7+7; k++){
                if(str.charAt(k)=='#') radix += "1";
                else radix += "0";
            }
            result += (char)Integer.parseInt(radix,2);
            radix = "";
        }
        System.out.println(result);

    }

}
