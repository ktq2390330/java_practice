package examinations.third_exam;

import javax.script.ScriptException;

// GUIを作成するために必要なクラスをインポートする
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Js_Evalクラスのインスタンスを作る
        Js_Eval js_eval = new Js_Eval();

        // GUIのコンポーネントを作る
        JFrame frame = new JFrame("数式の評価");
        JTextField textField = new JTextField(20);
        JLabel label = new JLabel("結果：");

        // テキストフィールドに数式を入力したら、evaluateメソッドを呼び出して結果をラベルに表示するようにイベントリスナーを設定する
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // evaluateメソッドの引数にテキストフィールドの値を渡して、数式を評価する
                    Object result = js_eval.evaluate(textField.getText());

                    // 結果をラベルに表示する
                    label.setText("結果：" + result);
                } catch (ScriptException ex) {
                    // エラーが発生した場合はメッセージを出力する
                    label.setText("エラーが発生しました: " + ex.getMessage());
                }
            }
        });

        // GUIのレイアウトを設定する
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(label);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

