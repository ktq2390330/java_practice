import java.util.*;
import java.nio.charset.*;

// Personインターフェースの定義
interface Person {
    // introduceメソッドの宣言
    void introduce();
}

// Teacherクラスの定義
class Teacher implements Person {
    // フィールド変数
    private String name; // 氏名
    private String job; // 職種
    private String subject; // 担当科目

    // コンストラクタ
    public Teacher(String name, String job, String subject) {
    this.name = name;
    this.job = job;
    this.subject = subject;
    }

    // introduceメソッドの実装
    @Override
    public void introduce() {
    // 氏名、職種、担当科目を表示
    System.out.println("氏名：" + name);
    System.out.println("職種：" + job);
    System.out.println("担当科目：" + subject);
    }
}

// Cookクラスの定義
class Cook implements Person {
    // フィールド変数
    private String name; // 氏名
    private String job; // 職種
    private String specialty; // 得意料理

    // コンストラクタ
    public Cook(String name, String job, String specialty) {
    this.name = name;
    this.job = job;
    this.specialty = specialty;
    }

    // introduceメソッドの実装
    @Override
    public void introduce() {
    // 氏名、職種、得意料理を表示
    System.out.println("氏名：" + name);
    System.out.println("職種：" + job);
    System.out.println("得意料理：" + specialty);
    }
}

// メインクラス

public class Main13_3 {
    public static void main(String[] args) {
        // Teacherクラスのインスタンスを生成
        Teacher t1 = new Teacher("竹井一馬", "教員", "情報処理");
        // Cookクラスのインスタンスを生成
        Cook c1 = new Cook("大原太郎", "シェフ", "オムライス");
        // introduceメソッドを呼び出す
        t1.introduce();
        c1.introduce();
        }
}
