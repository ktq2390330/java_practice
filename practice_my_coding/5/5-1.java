import java.util.Scanner;
import java.nio.charset.Charset;

class Rank_Switch{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        String x=stdIn.nextLine();

        switch (x) {
            case "A":
                System.out.println("ランクAは評価「優」です");
                break;
            case "B":
                System.out.println("ランクBは評価「良」です");
                break;
            case "C":
                System.out.println("ランクCは評価「可」です");
                break;
            case "D":
                System.out.println("ランクDは評価「不可」です");
                break;
        }
    }
}