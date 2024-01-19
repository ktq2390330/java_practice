// 11-7

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
        // 3 人分の学生情報を元に Student クラスのオブジェクトを作成
        Student student1 = new Student("A さん", 001, 89, 65, 88);
        Student student2 = new Student("B さん", 002, 80, 95, 64);
        Student student3 = new Student("C さん", 003, 70, 80, 98);

        // Student クラスのオブジェクトを配列に格納
        Student[] students = {student1, student2, student3};

        // 配列の要素を for 文で回す
        for (Student student : students) {
        // 学生番号、名前、平均点を画面に表示
        System.out.println(student.number + " 番 " + student.name + " 平均点 " + student.getAverage());
        }
    }
}
