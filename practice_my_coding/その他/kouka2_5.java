package practice.practice_my_coding.その他;
//インポート
import java.nio.charset.*;
import java.util.*;
//Passwordクラスの定義
class Password{
    //要素
    String password;

    //コンストラクタ
    Password(String pass){
        this.password=pass;
    }

    //反転させるメソッド
    String reverse(){
        StringBuilder stb=new StringBuilder(this.password);
        stb.reverse();

        return stb.toString();
    }
}

public class kouka2_5 {
    public static void main(String[] args) {
        //実行
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("現在のパスワードを入力してください:");
        String np=stdIn.nextLine();
        Password ps=new Password(np);
        System.out.println("セキュリティ上の問題を発見しました\nセキュリティを強化したパスワードを作成しました\nこちらをお使いください");
        System.out.println("新しいパスワードは"+ps.reverse()+"です");
        stdIn.close();
    }
}
