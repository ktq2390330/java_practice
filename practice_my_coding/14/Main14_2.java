import java.util.*;
import java.nio.charset.*;


public class Main14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("文字列を入力:");
        String x=sc.nextLine();
        int len=x.length();
        System.out.println("入力された文字数は"+len+"です");
    }
}
