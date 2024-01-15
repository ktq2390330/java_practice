import java.util.Scanner;
import java.nio.charset.Charset;

class Various_If{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.println("0~100までの得点(整数値)を2つ入力してください");
        System.out.print("得点:");
        int x=stdIn.nextInt();

        if (x<0 || x>100)
            System.out.println("入力値が不正です");
        else if (x==100)
            System.out.println("満点合格です");
        else if (x>=80)
            System.out.println("合格です");
        else
            System.out.println("不合格です");
    }
}