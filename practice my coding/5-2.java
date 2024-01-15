import java.util.Scanner;
import java.nio.charset.Charset;

class Rank_Switch{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        int x=stdIn.nextInt();

        switch (x) {
            case 1:
                System.out.println("ランクAは評価「優」です");
                break;
            case 2:
                System.out.println("ランクBは評価「良」です");
                break;
            case 3:
                System.out.println("ランクCは評価「可」です");
                break;
            default:
                System.out.println("不正な入力です");
        }
    }
}