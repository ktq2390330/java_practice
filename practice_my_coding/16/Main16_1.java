// ファイル入出力に必要なクラスをインポート
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main16_1 {
    public static void main(String[] args) {
        String filePath = "practice\\practice_my_coding\\read\\16-1 read.txt";
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
