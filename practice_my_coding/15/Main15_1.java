import java.util.*;
import java.nio.charset.*;

class Exam{
    public double division(int x,int y){
        double result=-1;
        try {
            result=x/y;
        } catch (Exception e) {
            System.out.println("0による割り算です!!");
        }
        return result;
    }
}

public class Main15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("整数1=");
        int x=sc.nextInt();
        System.out.print("整数2=");
        int y=sc.nextInt();

        Exam ex=new Exam();
        double result=ex.division(x, y);
        if (result==-1){}
        else{
            System.out.println(x+" / "+y+" = "+result);
        }
        System.out.println("処理終了");
    }
}
