import java.util.*;
import java.nio.charset.*;

interface CalcAddSub {
    void dispAdd(int x, int y);
    void dispSub(int x, int y);
}

interface CalcMultiDiv {
    void dispMulti(int x, int y);
    void dispDiv(int x, int y);
}


class CalcExecuter implements CalcAddSub, CalcMultiDiv {
    @Override
    public void dispAdd(int x, int y) {

    System.out.println("足し算結果：" + (x + y));
    }

    @Override
    public void dispSub(int x, int y) {
    System.out.println("引き算結果：" + (x - y));
    }

    @Override
    public void dispMulti(int x, int y) {
    System.out.println("掛け算結果：" + (x * y));
    }

    @Override
    public void dispDiv(int x, int y) {
    System.out.println("割り算結果：" + (x / y));
    }
}

// メインクラス
public class Main13_4 {
    public static void main(String[] args) {
    CalcExecuter ce = new CalcExecuter();
    Scanner sc = new Scanner(System.in,Charset.forName("Shift-JIS"));
    System.out.print("1回目の整数を入力してください:");
    int x = sc.nextInt();
    System.out.print("2回目の整数を入力してください:");
    int y = sc.nextInt();
    ce.dispAdd(x, y);
    ce.dispSub(x, y);
    ce.dispMulti(x, y);
    ce.dispDiv(x, y);
    }
}
