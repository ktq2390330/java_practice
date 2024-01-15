import java.util.Scanner;

import java.nio.charset.Charset;

class Input_to_Print{
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.print("お名前を入力してください>");
        String str=stdIn.nextLine();
        System.out.println("こんにちは"+str+"さん");
    }
}