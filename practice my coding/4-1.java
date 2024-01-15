import java.util.Scanner;
import java.nio.charset.Charset;

class Pass_If{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        int x=stdIn.nextInt();

        if (x>=80)
            System.out.println("合格です");
        else
            System.out.println("不合格です");
    }
}