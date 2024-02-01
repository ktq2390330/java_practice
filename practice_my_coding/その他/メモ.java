package practice.practice_my_coding.その他;

// class Kouka1 {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//       // 整数型変数のnum1を宣言し、10を代入する
//     int num1 = 10;
//       // 整数型変数のnum2を宣言し、3を代入する
//     int num2 = 3;
//       // 計算結果を格納する浮動小数点型変数num3とnum4,num5を宣言する
//     double num3,num4,num5;
//       // num1をnum2で割り、計算結果をnum3に代入する。ただし、小数点以下についても計算させる。
//     num3 = num1 / num2;
//       // num4に円周率のリテラル(小数点第4位まで)を代入する
//     num4 = 3.1415;
//       // num5に、num3をnum4で割った数を代入する
//     num5 = num3 / num4;
//       // 表示用の整数型変数ansを宣言し、num5に小数点第1位で四捨五入した値を代入する
//     int ans = (int)Math.round(num5);
//       // ansの内容を表示する
//     System.out.println("(10/3)/3.1415の計算の結果は・・・"+ans);
//     }
// }


// // Scannerクラスのインポート
// import java.util.Scanner;

// class Kouka2 {
// public static void main(String[] args) {
//     // Scannerクラスのインスタンス化
//     Scanner stdIn = new Scanner(System.in);
//     // ユーザーが入力した文字列を格納する変数を宣言する。
//     String str = "";
//     //コマンドプロンプト上に"コマンドを入力してください。："と表示する
//     System.out.print("コマンドを入力してください。：");
//     //ユーザーにコマンド入力をしてもらう
//     str = stdIn.nextLine();

//     //ユーザーが入力したコマンドによって、表示する文字列を変える
//     switch (str){
//         case "up":
//         //コマンドプロンプトにupが入力された時の文字列を表示する
//         System.out.println("ジャンプしました！");
//         break;
//         case "down":
//         //コマンドプロンプトにdownが入力された時の文字列を表示する
//         System.out.println("しゃがんでいます！");
//         break;
//         case "right":
//         //コマンドプロンプトにrightが入力された時の文字列を表示する
//         System.out.println("右へ移動しました");
//         break;
//         case "left":
//         //コマンドプロンプトにleftが入力された時の文字列を表示する
//         System.out.println("左へ移動しました");
//         break;
//         case "A":
//         //コマンドプロンプトにAが入力された時の文字列を表示する
//         System.out.println("ファイアーボール！");
//         break;
//         default:

//         //存在しないコマンドが打ち込まれた場合には、無効なコマンドであることをメッセージで表示する
//         System.out.println("無効なコマンドが打ち込まれました。\n もう一度実行してください。");
//     }
// }
// }

// import java.util.Scanner;

// class Kouka3 {
// public static void main(String[] args) {
//     // Scannerクラスのインスタンス化
//     Scanner stdIn = new Scanner(System.in);
//     // カウント変数を定義、0を代入する。
//     int count = 0;
//     // 計算結果を管理する整数型変数を宣言する。初期値は1。
//     int num = 1;

//     // コマンドプロンプトに"整数を入力してください"と表示する
//     System.out.print("整数を入力してください：");
//     // ユーザーに数を入力してもらう。int型に変換して変数targetに代入する
//     int target = Integer.parseInt(stdIn.nextLine());

//     // ユーザーに入力された数よりもnumが小さい間は繰り返す
//     while (num<target){
//         //numに2をかける
//         num *= 2;
//         //2を掛けた回数をカウントに1を足す
//         ++count;
//     }
//     //ループを抜けた = numがユーザーに入力された数より大きくなったということ
//     //2を掛けた回数を表示する
//     System.out.println("入力された数以上になるために、1に2を掛けた回数は"+count+"回です");
//     }
// }

// ArrayList,HashMap,Scannerのインポート
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;

// class Kouka4 {
// public static void main(String[] args) {
//     // Scannerクラスのインスタンス化
//     Scanner stdIn = new Scanner(System.in);
//     // クラスの人数を入力してもらう
//     System.out.print("クラスの人数を入力して下さい:");
//     int num = Integer.parseInt(stdIn.nextLine());
//     // arrayList型の変数listを宣言し、空のarrayListを代入する
//     ArrayList<Integer> list = new ArrayList<>();

//     // クラスの人数分の年齢を入力してもらい、listに追加する
//     for(int i = 0;i < num; i++){
//         // 入力を促す文字列を表示する
//         System.out.print((i+1)+"人目の年齢を入力して下さい：");
//         // 入力してもらった年齢をリストに格納する
//         list.add(Integer.parseInt(stdIn.nextLine()));
//     }
//     // 年齢の合計を管理する変数sumを宣言し、0で初期化する
//     int sum = 0;
//     //listに格納されている年齢の平均を求める
//     for(int i = 0;i < num; i++){
//         // listの年齢を取り出し、sumの中に足していく
//         sum = sum + list.get(i);
//     }
//     //平均年齢を管理する変数aveを宣言し、平均年齢を計算し、代入する
//     double ave = (double)sum / num;
//     //平均年齢を表示する
//     System.out.println("クラスの平均年齢は、"+ave+"歳です。");
// //---------------------------------------------------------------------//
//     // HashMap型の変数mapを宣言し、空のHashMapを代入する。
//     HashMap<String,Integer> map = new HashMap<>();
//     // キーとして先生の名前を、値としてその人の年齢をmapを格納する
//     map.put("江藤",34);

//     map.put("加藤",27);
//     map.put("佐藤",29);
//     map.put("伊藤",42);
//     map.put("後藤",38);
//     // 先生の平均年齢を計算するので、合計する為の変数sum2を宣言し、0で初期化する
//     int sum2 = 0;
//     // 拡張for文を用いて、各先生の名前と年齢を表示する
//     for(String name: map.keySet()){
//         // 合計に年齢を足し込む
//         sum2 += map.get(name);
//         // 先生の名前と年齢を表示する
//         System.out.println("名前：" + name + "先生 年齢：" + map.get(name));
//     }
//     //平均年齢を管理する変数aveを宣言し、平均年齢を計算し、代入する
//     double ave2 = (double)sum2 / map.size();
//     // 最後に平均年齢を計算し、表示する
//     System.out.println("先生の平均年齢は、"+ ave2 +"歳です。");
//     }
// }

// Scannerクラス,Randomクラス,HashMapのインポート
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

class Kouka6 {
public static void main(String[] args){
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    // Randomクラスのインスタンス化
    Random rand = new Random();
    //----------------------------------------------------------------------------------------------------//
    //国名と首都がセットで格納されているHashMapを作成する。
    HashMap<String,String> map = new HashMap<>();
    // キーとして国名を、値として首都をmapを格納する
    map.put("日本","東京");
    map.put("中国","北京");
    map.put("インド","ニューデリー");
    map.put("イギリス","ロンドン");
    map.put("アメリカ","ワシントンD.C.");

    //拡張for文を使って、Mapの要素数分繰り返す
    for(String str:map.keySet()){
        //Mapの値に設定されている首都を表示する
        //3回目の処理で表示される値は"ニューデリー"
        System.out.println(map.get(str));
    }
    System.out.println("//----------------------------------------------------------------------------------------------------//");
    //九九の表を出力する
    //1~9の段の分繰り返す
    Dan:
    for(int i = 1;i <= 9; i++){
        //～の段と表示
        System.out.println(i+"の段");
        //段の中で1～9までの式を表示する
        Inner:
        for(int j = 1;j <= 9;j++){
        //4の段は苦手で覚えていません
        //4の段だった場合は___(3)___から抜ける
        if(i == 4) break Inner;
        //8の段から先はまだ覚えていないので、九九の表が書けません
        //8の段まで来たら、メッセージを表示して___(4)___の表示をやめる
        if(i == 8){
            System.out.println("8の段より先は覚えていません・・・");

            break Dan;
        }
        //式の表示
        System.out.print(i+"×"+j+"="+(i*j)+":");
    }
    //段の表示が終わったら改行
    System.out.println();
    }
    System.out.println("//----------------------------------------------------------------------------------------------------//");
    //int型の変数numを宣言する
    int num;
    //long型の変数longNumを宣言する
    long longNum;
    //long型の最大値をlongNumに代入する
    longNum = Long.MAX_VALUE;
    //longNumをint型にキャストしてnumに代入する
    num = (int)longNum;
    //numを表示する。ここで表示される数値は___(5)___。
    System.out.println(num);

    //数値が___(5)___となる理由は、すべてのビットが___(6)___で埋まったint型の値になるため

    System.out.println("//----------------------------------------------------------------------------------------------------//");
    //Randomクラスで0~99までの乱数を生成し、int型の変数randomNumに代入する
    // int randomNum = rand.nextInt(100);
    int randomNum=1;

    int num2 = 1;
    //While文は終了することなく___(7)___する
    while(num2 < 100){
    //0~99までの数を入力してくださいと表示する
    System.out.print("0~99までの数を入力してください:");
    //入力された数が___(8)___ と一致した時だけループを抜ける
    if(randomNum == Integer.parseInt(stdIn.nextLine())) break;
    }

    System.out.println("//----------------------------------------------------------------------------------------------------//");

    //int型の変数num3に3を代入する
    int num3 = 3;
    //int型の変数num4に4を代入する
    int num4 = 4;
    //int型の変数num5に5を代入する
    int num5 = 5;
    //変数num6にnum3、num4、num5の中で___(9)___ 数値を代入する
    int num6 = num3 < num4 ? (num3 < num5 ? num3 : num5 ) : (num4 < num5 ? num4 : num5);

    //num6を表示する。ここで表示される数値は___(10)_ __。
    
    System.out.println("num6の中身は"+ num6 +"です！");
}
}
