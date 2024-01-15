import java.util.*;
import java.nio.charset.*;

class Members{

    static List<String[]>list=new ArrayList<>();
    static void add_data(String school_name,String name){
        String[] x=new String[2];
        x[0]=school_name;
        x[1]=name;
        list.add(x);
    }

    static void print_list(){
        for (String[] data:list){
            System.out.println("学校名:"+data[0]+" "+"名前:"+data[1]);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("学校名:");
        String school_name=stdIn.nextLine();
        
        System.out.println("名前:");
        String name=stdIn.nextLine();

        add_data(school_name, name);

        
    }
}