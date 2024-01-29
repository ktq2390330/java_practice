import java.util.*;
import java.nio.charset.*;


public class Main14_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("文字列を入力:");
        String x=sc.nextLine();
        StringBuilder stb=new StringBuilder(x);
        if (stb.length()>10){
        stb=stb.delete(10,x.length());
        }
        System.out.println("結果文字列:"+stb);
    }
}
