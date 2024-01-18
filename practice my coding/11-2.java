import java.util.*;
import java.nio.charset.*;

class X_to_Y_Sum{

    static int  Exam_Sum(int x,int y){
        int result=0;
        while (x<=y){
            result=x+result;
            ++x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("1つ目の整数を入力してください");
        int x=stdIn.nextInt();

        System.out.print("2つ目の整数を入力してください");
        int y=stdIn.nextInt();

        if (x>y){
            int i=x;
            x=y;
            y=i;
        }

        int result=Exam_Sum(x, y);

        System.out.println(x+"から"+y+"までの合計値は"+result+"です");

    }
}