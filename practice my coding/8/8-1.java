import java.util.*;

class Print_List{
    static List<Integer[]>list=new ArrayList<>();
    static void print_list(List<Integer> list){
        for (int i=0; i<10; i++){
            System.out.println("list["+i+"]="+list.get(i));
        }
    }
    static void add_data(){
        for (int i=1; i<11; i++)
        list.add(i);
    }
    public static void main(String[] args) {
        add_data();
        print_list(list);
    }
}