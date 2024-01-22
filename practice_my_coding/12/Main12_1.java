import java.util.Scanner;
import java.nio.charset.*;
class Calculator{
    public int calcSum(int x,int y){
        return x+y;
    }

    public double calcAve(int x,int y){
        return x+y/2;
    }
}

class MoreCalc extends Calculator{

    @Override
    public int calcSum(int x, int y) {
        return super.calcSum(x, y);
    }

    @Override
    public double calcAve(int x, int y) {
        return super.calcAve(x, y);
    }
    public int calcPow(int x,int y){
        int result=1;
        for (int i=1; i<=y; i++){
            result=result*x;
        }
        return result;
    }
} 

public class Main12_1 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.print("整数を入力してください:");
        int x=stdIn.nextInt();

        System.out.print("整数を入力してください:");
        int y=stdIn.nextInt();

        MoreCalc mc=new MoreCalc();

        int sum=mc.calcSum(x, y);
        System.out.println("Sum "+x+" and "+y+" = "+sum);

        double ave=mc.calcAve(x, y);
        System.out.println("Average "+x+" and "+y+" = "+ave);

        int pow=mc.calcPow(x, y);
        System.out.println("Power "+x+" and "+y+" = "+pow);
    }
}
