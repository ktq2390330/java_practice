import java.util.*;
import java.nio.charset.*;

public class Main14_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("文字列を入力:");
        String x=sc.nextLine();
        System.out.print("文字列を入力:");
        String y=sc.nextLine();

        if (x.equals(y)){
            System.out.println("同じ文字列です");
        }
        else{
            System.out.println("違う文字列です");
        }
    }
}
