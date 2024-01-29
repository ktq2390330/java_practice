import java.util.*;
import java.nio.charset.*;

public class Main7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("整数値:");
        int x=sc.nextInt();
        int result=0;
        while (x>0) {
            result=result*10+x%10;
            x/=10;
        }
        System.out.println(result);
    }
}
