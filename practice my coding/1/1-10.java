import java.util.Scanner;
import java.nio.charset.Charset;

class Various_Input{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.print("文字の入力:");
        String str=stdIn.nextLine();

        System.out.print("整数の入力:");
        String str2=stdIn.nextLine();


        System.out.print("小数の入力:");
        String str3=stdIn.nextLine();


        System.out.println("入力された文字="+str);
        System.out.println("入力された整数="+str2);
        System.out.println("入力された小数="+str3);
    }
}