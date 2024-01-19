import java.util.*;
import java.nio.charset.*;

class Print_XXtimes{
    static void print_XXtimes(String str,int num){
        for (int i=0; i<num; i++){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        System.out.print("文字列:");
        String x=stdIn.nextLine();
        System.out.print("回数:");
        int n=stdIn.nextInt();
        print_XXtimes(x,n);
    }
}