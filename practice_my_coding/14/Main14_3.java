import java.util.*;
import java.nio.charset.*;

class StringBuilder{
    public String delete10(String x){
        if (x.length()>10){
            x=x.substring(0, 10);
        }
        return x;
    }
}
public class Main14_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("文字列を入力:");
        String x=sc.nextLine();
        StringBuilder stb=new StringBuilder();
        String result=stb.delete10(x);
        System.out.println("結果文字列:"+result);
    }
}
