// 11-7
import java.util.Scanner; // Scannerクラスをインポート
import java.util.List; // Listインターフェイスをインポート
import java.util.ArrayList; // ArrayListクラスをインポート
// Student クラスの定義
class Student {
    // フィールド
    String name; // 名前
    int number; // 学生番号
    int japanese; // 国語の点数
    int math; // 数学の点数
    int english; // 英語の点数

    // コンストラクタ
    Student(String name, int number, int japanese, int math, int english) {
    this.name = name; // 名前を代入
    this.number = number; // 学生番号を代入
    this.japanese = japanese; // 国語の点数を代入
    this.math = math; // 数学の点数を代入
    this.english = english; // 英語の点数を代入
    }

    // 平均点を算出するメソッド
    double getAverage() {
    // 3 教科の合計点を算出
    int total = getSum();
    // 3 で割って平均点を求める
    double average = (double) total / 3;
    // 小数点第 3 位以下を切り捨てて返す
    return Math.floor(average * 100) / 100;
    }

    // 合計点を算出するメソッド
    int getSum() {
    // 3 教科のテスト結果の合計を返す
    return japanese + math + english;
    }


// メインメソッド

    public static void main(String[] args) {

        
        // Studentクラスの定義は省略

                Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成
                List<Student> list = new ArrayList<>(); // Studentクラスのオブジェクトを格納するリストを作成
                
                while (true) { // 無限ループ
                    System.out.print("名前を入力：");
                    String name = sc.next(); // 名前を入力
                    if (name.equals("end")) { // 名前が"end"ならループを抜ける
                        break;
                    }
                    System.out.print("学生番号を入力：");
                    int id = sc.nextInt(); // 学生番号を入力
                    System.out.print("国語の点数を入力：");
                    int japanese = sc.nextInt(); // 国語の点数を入力
                    System.out.print("数学の点数を入力：");
                    int math = sc.nextInt(); // 数学の点数を入力
                    System.out.print("英語の点数を入力：");
                    int english = sc.nextInt(); // 英語の点数を入力
                    
                    Student student = new Student(name, id, japanese, math, english); // Studentクラスのオブジェクトを作成
                    list.add(student); // リストに追加
                }
                
                // リストに格納された学生情報を表示する処理は省略
            }
        }
        

        // 配列の要素を for 文で回す
        // for (Student student : students) {
        // // 学生番号、名前、平均点を画面に表示
        // System.out.println(student.number + " 番 " + student.name + " 平均点 " + student.getAverage());
        // }
//     }
// }
