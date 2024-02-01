package practice.practice_my_coding.その他;
// public class memo2 {
//     public static void main(String[] args) { 
// //         // コンストラクタによりインスタンスを生成 
// //         // 底辺を12.3、高さを45.5とする 
// //         double bottom = 12.3; 
// //         double height = 45.5; 
// //         Triangle triangle =new Triangle(bottom, height);
    
// //         // ゲッターを使用して底辺を表示 
// //         System.out.println("底辺 = " + triangle.getBottom()); 

// //         // ゲッターを使用して高さを表示 
// //         System.out.println("高さ = " + triangle.getHeight()); 

// //         // 面積を求めるメソッドを使用して面積を表示 
// //         System.out.println("面積 = " + triangle.calcArea()); 
    
// //         // セッターを使用して底辺を23.4、高さを56.7とする 
// //         triangle.setBottom(23.4);
// //         triangle.setHeight(56.7);
    
// //         // 底辺、高さを変更した後の三角形の面積を表示 
// //         System.out.println("変更後の面積 = " +triangle.calcArea()); 
// //     }
    
// // }

// // class Triangle {
// //     // フィールド定義
// //     private double bottom;  // 底辺
// //     private double height;  // 高さ

// //     // コンストラクタ定義
// //     public Triangle(double bottom, double height) {
// //     this.bottom = bottom;
// //     this.height = height;
// //     }

// //     // メソッド定義
// //     // 底辺を返すゲッター
// //     public double getBottom() {
// //     return bottom;
// //     }
// //     // 高さを返すゲッター
// //     public double getHeight() {
// //     return height;
// //     }
// //     //底辺をセットするセッター
// //     public void setBottom(double num){
// //         this.bottom = num;
// //     }
// //     //高さをセットするセッター
// //     public void setHeight(double num){
// //         this.height = num;
// //     }

// //     // 面積を求めるメソッドの定義
// //     // 引数なし
// //     public double calcArea() {
// //         // 三角形の面積を返す
// //         return this.bottom * this.height / 2;
// //     }

// //--------------------------------------------------------

//     // コンストラクタを呼び出しJapaneaseインスタンスを生成
//     Human suzuki = new Japanese("鈴木　一郎", 28);
//     // 


// }

// /**
// 人間クラス定義
// */
// class Human {
//     // フィールド定義
//     protected String name;    // 名前
//     protected int age;        // 年齢

//     // コンストラクタ定義
//     public Human(String name, int age) {
//     this.name = name;
//     this.age = age;
//     }

//     // メソッド定義
//     // 挨拶を表示するメソッド
//     public void greeting() {
//         System.out.println("Hello.");
//     }

//     // 自己紹介するメソッド
//     public void introduction() {
//         // 挨拶する
//         greeting();
//         // 名前と年齢を表示する
//         System.out.println("私は、" + this.name + "です。");
//         System.out.println("年齢は、" + this.age + "です。");
//     }
//     }

// /**
// 日本人クラスの定義
// */
// class Japanese extends Human {
//     // フィールド定義
//     protected String nation = "日本人"; //国籍

//     // コンストラクタ定義

//     public Japanese(String name, int age) {
//         // 親クラスのコンストラクタを呼び出して名前と年齢を設定する
//         super(name, age);
//         }

//         // メソッド定義
//         // 挨拶を表示するメソッド（オーバーライド）

//         @Override
//         public void greeting() {
//             super.greeting();
//         }
//         // 自己紹介するメソッド（オーバーライド）
//     @Override
//     public void introduction() {
//         super.introduction();
//         System.out.println(this.nation + "です。");
// }
// }}

// public class memo2 {
//     public static void main(String[] args) {
//         AbsShape triangle = new Triangle(10.5, 5.0);
//         triangle.displayData();
//     }
    
// }

//     /**
//     図形抽象クラスの定義
//     */
//     abstract class AbsShape {
//         // フィールド定義
//         // 図形の種類
//         private int shapeType;
//         private String[] shapeTypeStr = {"三角形","四角形","円"};

//         // この図形の種類の文字列を返却するメソッド
//         String getShapeTypeStr(){
//         return shapeTypeStr[shapeType];
//         };
//         // shapeTypeのセッター
//         void setShapeType(int num){
//             shapeType = num;
//         }
//         // shapeTypeのゲッター
//         int getShapeType(){
//             return shapeType;
//         };

//         // 抽象メソッド定義
//         // 面積を計算して返却する抽象メソッド
//         abstract double calcArea();
//         // 図形のデータを表示する抽象メソッド
//         abstract void displayData();
//     }

//     //三角形クラスの定義
//     class Triangle extends AbsShape {
//       // フィールド定義
//       private double bottom; //底辺
//       private double height; //高さ
//       // コンストラクタ定義
//         public Triangle(double bottom,double height) {
//         // 抽象クラスから継承されたshapeTypeに三角形を意味する0を代入する
//         this.setShapeType(0);
//         // 底辺を代入
//         this.bottom = bottom;
//         // 高さを代入
//         this.height = height;
//         }

//         //ゲッターとセッターを定義
//         public double getBottom() {
//         return bottom;
//         }
//         public double getHeight() {
//         return height;
//         }
//         public void setBottom(double bottom) {
//         this.bottom = bottom;
//         }
//         public void setHeight(double height) {
//         this.height = height;
//         }

//         // 抽象メソッドのオーバーライド
//         // 面積を計算して返却する
//         public double calcArea(){
//         //三角形の面積の求め方は、底辺×高さ÷2
//         //小数点第3位を四捨五入する
//         return Math.round((bottom * height / 2) * 100) / 100.0;
//         };

//         // 図形のデータを表示するメソッド
//         public void displayData() {
//         System.out.println("この図形は" + this.getShapeTypeStr() + "です。");
//         System.out.println("この図形の底辺は" + this.getBottom() + "です。");
//         System.out.println("この図形の高さは" + this.getHeight() + "です。");
//         System.out.println("この図形の面積は" + this.calcArea() + "です。");
//         }
// }

//----------------------------------------------------------------------------

import java.util.Scanner;

public class memo2 {
    public static void main(String[] args) {
                //このmainメソッドがスマホ本体の制御をしているイメージ
        //入力されたコマンドによって、起動するアプリを選択する
        Scanner stdIn = new Scanner(System.in);
        // アプリのインスタンスを管理する変数appを宣言する
        IFApp app;
        //ユーザーに起動するアプリを選択してもらう
        System.out.print("起動したいアプリを選択してください:");
        switch(stdIn.nextLine()){
        case "memo":
            //メモアプリのインスタンスを生成する
            app = new memoApp();
            //メモアプリを起動する
            app.startUp();
            break;
        case "calc":
            //電卓アプリのインスタンスを生成する
            app = new calcApp();
            //電卓アプリを起動する
            app.startUp();
            break;
        default:
            System.out.println("そんなアプリは存在しません。");
        }
        stdIn.close();
    }
}


interface IFApp {
    // 抽象メソッドstartUpの定義
    // アプリの起動
    public abstract void startUp();
    // 抽象メソッドendの定義
    public abstract void end();
}



// メモアプリ
class memoApp implements IFApp {
    private StringBuilder memo;
    Scanner stdIn = new Scanner(System.in);

    // コンストラクタ定義
    public memoApp() {
        this.memo = new StringBuilder();
    }

      // メソッド定義 抽象メソッドのオーバーライド
    
    // アプリの起動 startUpメソッド
    public void startUp() {
        System.out.println("メモアプリを起動します！");
        //アプリの本機能である、memoメソッドを呼び出す
        memo();
    }
    // アプリの起動 endメソッド
    public void end() {
        System.out.println("メモアプリを終了します。");
        //memoの中身を初期化する
        memo = new StringBuilder();
    }

    // メソッド定義
    // メモ機能の実装　ココから下は実際にメモをする処理が書いてあるだけです。
    //問題を解くうえでは必要ありませんので、読まなくて大丈夫です。
    public void memo(){
        //実際アプリを作るときには、このメソッドの中に機能を実装する
        //今回は簡易的な実装とする
        System.out.println("メモの内容を書いて、エンターキー \n 終了する場合はendと入力して下さい:");
        String str = stdIn.nextLine();
        if(str.equals("end")){
        this.end();
        return;
        }
        memo.append(str);
    
        System.out.println("現在のメモの中身は・・・");
        System.out.println(memo.toString());
        this.memo();
    }
    }


// 電卓アプリ
class calcApp implements IFApp {
    Scanner stdIn = new Scanner(System.in);

    // メソッド定義 抽象メソッドのオーバーライド
    // アプリの起動 startUpメソッド
    public void startUp() {
        System.out.println("電卓アプリを起動します！");
        //アプリの本機能である、calcメソッドを呼び出す
        calc();
    }
      // アプリの起動 endメソッド
    public void end() {
        System.out.println("電卓アプリを終了します。");
    }
    // メソッド定義
    // 電卓機能の実装　ココから下は実際に計算する処理が書いてあるだけです。
    //問題を解くうえでは必要ありませんので、読まなくて大丈夫です。
    //早く終わった人は計算の処理を短くできないかチャレンジしてください。
    public void calc(){
        //実際アプリを作るときには、このメソッドの中に機能を実装する
        //今回は簡易的な実装とする
        System.out.print(" 足し算モード:+ \n 引き算モード:- \n 掛け算モード:* \n 割り算モード:/ \n 終了:endと入力して下さい:");
        switch(stdIn.nextLine()){
        case "+":
            plus();
            break;
        case "-":
            minus();
            break;
        case "*":
            multi();
            break;
        case "/":
            div();
            break;
        case "end":
        end();
        return;
        default:
            System.out.println("不明なコマンドです。");
        }
        System.out.println("----------------------------------------------------------------------");
        this.calc();
    }

    //各計算メソッド
    public void plus(){
        System.out.println("足し算モード");
        System.out.print("数字を入力してください：");
        double num1 = Double.parseDouble(stdIn.nextLine());
        System.out.print("数字を入力してください：");
        double num2 = Double.parseDouble(stdIn.nextLine());
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }

    public void minus(){
        System.out.println("引き算モード");
        System.out.print("数字を入力してください：");
        double num1 = Double.parseDouble(stdIn.nextLine());
        System.out.print("数字を入力してください：");
        double num2 = Double.parseDouble(stdIn.nextLine());
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }

    public void multi(){
        System.out.println("掛け算モード");
        System.out.print("数字を入力してください：");
        double num1 = Double.parseDouble(stdIn.nextLine());
        System.out.print("数字を入力してください：");
        double num2 = Double.parseDouble(stdIn.nextLine());
        System.out.println(num1+"*"+num2+"="+(num1*num2));
    }
    
    public void div(){
        System.out.println("割り算モード");
        System.out.print("数字を入力してください：");
        double num1 = Double.parseDouble(stdIn.nextLine());
        System.out.print("数字を入力してください：");
        double num2 = Double.parseDouble(stdIn.nextLine());
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
    }
    
    

