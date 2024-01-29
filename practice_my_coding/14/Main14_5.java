import java.util.*;
import java.nio.charset.*;

public class Main14_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("内容1:");
        String str1=sc.nextLine();
        StringBuilder stb=new StringBuilder(str1);
        System.out.print("内容2:");
        String str2=sc.nextLine();
        stb.append(str2);
        System.out.println(stb);
    }
}

