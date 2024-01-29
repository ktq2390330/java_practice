import java.util.*;
import java.nio.charset.*;

public class Main15_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("整数を入力:");
        try {
            int x=sc.nextInt();
            if (x%2==0) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        } catch (Exception e) {
            System.out.println("整数と認識できません");
        }
    }
}
