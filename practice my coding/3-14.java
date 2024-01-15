import java.util.Scanner;
import java.nio.charset.Charset;

class Exam_S{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.println("長方形の長さを求めます");

        System.out.print("縦の長さ:");
        int vertical=stdIn.nextInt();

        System.out.print("横の長さ:");
        int horizontal=stdIn.nextInt();

        int area=vertical*horizontal;

        System.out.println("長方形の面積="+area);
    }
}