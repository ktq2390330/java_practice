// ArrayList,HashMap,Scannerのインポート
import java.util.ArrayList;
import java.util.Scanner;

class kouka1_5{
public static void main(String[] args) {
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    //教科数
    int num = 5;
    // arrayList型の変数listを宣言し、空のarrayListを代入する
    ArrayList<Integer> list = new ArrayList<>();

    // 教科数分の点数を入力してもらい、listに追加する
    for(int i = 0;i < num; i++){
        // 入力を促す文字列を表示する
        System.out.print((i+1)+"教科目の点数を入力して下さい：");
        // 代入
        Integer input_num=Integer.parseInt(stdIn.nextLine());
        // 点数の確認
        if (input_num<0 || input_num>100){
            input_num=0;
            System.out.println("不正な点数を検知しました。0点とします。");
        }
        // 入力してもらった点数をリストに格納する
        list.add(input_num);
    }
    // 点数の合計を管理する変数sumを宣言し、0で初期化する
    int sum = 0;
    //listに格納されている点数の平均を求める
    for(int i = 0;i < num; i++){
        // listの点数を取り出し、sumの中に足していく
        sum = sum + list.get(i);
    }
    //平均点数を管理する変数aveを宣言し、平均点数を計算し、代入する
    double ave = (double)sum / num;
    // 合計点の表示
    System.out.println("合計点 = "+sum);
    //平均点数を表示する
    System.out.println("平均点 = "+ave);
    }

}