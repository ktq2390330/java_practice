import java.util.Scanner;
import java.nio.charset.Charset;

class Pass_If{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.println("0~100までの得点(整数値)を2つ入力してください");
        System.out.print("国語の得点:");
        int x=stdIn.nextInt();

        System.out.print("英語の得点:");
        int y=stdIn.nextInt();

        if (x==100 && y==100)
            System.out.println("満点です");
    }
}