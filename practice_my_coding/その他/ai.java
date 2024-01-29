// // 11-7
// import java.util.Scanner; // Scannerクラスをインポート
// import java.util.List; // Listインターフェイスをインポート
// import java.util.ArrayList; // ArrayListクラスをインポート
// // Student クラスの定義
// class Student {
//     // フィールド
//     String name; // 名前
//     int number; // 学生番号
//     int japanese; // 国語の点数
//     int math; // 数学の点数
//     int english; // 英語の点数

//     // コンストラクタ
//     Student(String name, int number, int japanese, int math, int english) {
//     this.name = name; // 名前を代入
//     this.number = number; // 学生番号を代入
//     this.japanese = japanese; // 国語の点数を代入
//     this.math = math; // 数学の点数を代入
//     this.english = english; // 英語の点数を代入
//     }

//     // 平均点を算出するメソッド
//     double getAverage() {
//     // 3 教科の合計点を算出
//     int total = getSum();
//     // 3 で割って平均点を求める
//     double average = (double) total / 3;
//     // 小数点第 3 位以下を切り捨てて返す
//     return Math.floor(average * 100) / 100;
//     }

//     // 合計点を算出するメソッド
//     int getSum() {
//     // 3 教科のテスト結果の合計を返す
//     return japanese + math + english;
//     }


// // メインメソッド

//     public static void main(String[] args) {

        
//         // Studentクラスの定義は省略

//                 Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成
//                 List<Student> list = new ArrayList<>(); // Studentクラスのオブジェクトを格納するリストを作成
                
//                 while (true) { // 無限ループ
//                     System.out.print("名前を入力：");
//                     String name = sc.next(); // 名前を入力
//                     if (name.equals("end")) { // 名前が"end"ならループを抜ける
//                         break;
//                     }
//                     System.out.print("学生番号を入力：");
//                     int id = sc.nextInt(); // 学生番号を入力
//                     System.out.print("国語の点数を入力：");
//                     int japanese = sc.nextInt(); // 国語の点数を入力
//                     System.out.print("数学の点数を入力：");
//                     int math = sc.nextInt(); // 数学の点数を入力
//                     System.out.print("英語の点数を入力：");
//                     int english = sc.nextInt(); // 英語の点数を入力
                    
//                     Student student = new Student(name, id, japanese, math, english); // Studentクラスのオブジェクトを作成
//                     list.add(student); // リストに追加
//                 }
                
//                 // リストに格納された学生情報を表示する処理は省略
//             }
//         }
        

        // 配列の要素を for 文で回す
        // for (Student student : students) {
        // // 学生番号、名前、平均点を画面に表示
        // System.out.println(student.number + " 番 " + student.name + " 平均点 " + student.getAverage());
        // }
//     }
// }

// import java.util.Scanner;

// class InputValidationExample {
//     public static void main(String[] args) {
//         // Scannerオブジェクトを作成
//         Scanner scanner = new Scanner(System.in);
//         // 入力を促すメッセージを出力
//         System.out.print("入力してください: ");
//         // 入力された文字列を取得
//         String input = scanner.nextLine();
//         // 入力が数字かどうかを判定するメソッドを呼び出す
//         boolean isNumber = isNumeric(input);
//         // 判定結果に応じて処理を分岐
//         if (isNumber) {
//             // 入力が数字ならint型に変換して表示
//             int number = Integer.parseInt(input);
//             System.out.println(number);
//         } else {
//             // 入力が数字でなければエラーメッセージを出力
//             System.out.println("数字を入力してください");
//         }
//         // Scannerオブジェクトを閉じる
//         scanner.close();
//     }

//     // 入力が数字かどうかを判定するメソッド
//     public static boolean isNumeric(String input) {
//         // 入力がnullまたは空文字ならfalseを返す
//         if (input == null || input.isEmpty()) {
//             return false;
//         }
//         // 入力の各文字に対してループ
//         for (char c : input.toCharArray()) {
//             // 文字が数字でなければfalseを返す
//             if (!Character.isDigit(c)) {
//                 return false;
//             }
//         }
//         // 全ての文字が数字ならtrueを返す
//         return true;
//     }
// }

// import java.util.Scanner;

// public class ReverseDigits {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in); // 入力を受け取るためのScannerオブジェクトを作成
//     int input; // 入力された整数値を保存する変数
//     int reverse; // 入力された整数値の桁を反転した値を保存する変数
//     do {
//     System.out.print("整数値を入力してください（0で終了）: "); // 入力を促すメッセージを出力
//     input = sc.nextInt(); // 入力された整数値を変数inputに代入
//     reverse = 0; // 変数reverseを0に初期化
//     while (input > 0) { // 入力された整数値が0より大きい間繰り返す
//         reverse = reverse * 10 + input % 10; // reverseに10をかけてinputの一の位を加える
//         input = input / 10; // inputを10で割って一の位を切り捨てる
//     }
//     System.out.println(reverse); // reverseの値を画面に表示する
//     } while (reverse != 0); // reverseが0でない間繰り返す
//     sc.close(); // Scannerオブジェクトを閉じる
// }
// }
