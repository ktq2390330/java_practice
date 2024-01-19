import java.util.*;
import java.nio.charset.*;

class Circle{
    static double PI=3.1415;

    static double Exam_C(Integer x){
        return x*2*PI;
    }

    static double Exam_S(Integer x){
        return x*x*PI;
    }

}

public class Main11_1{

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("半径を整数値で入力:");
        int x=stdIn.nextInt();

        double c=Circle.Exam_C(x);
        double s=Circle.Exam_S(x);

        System.out.println("円周の長さは"+c+"です");
        System.out.println("円の面積は"+s+"です");
        stdIn.close();
    }
}