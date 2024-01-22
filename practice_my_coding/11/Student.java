import java.util.*;

class Student{
    static String name;
    static private String No;
    static private int  japanese;
    static private int math;
    static private int english;

    Student(String na,String n,int jp,int mt,int en){
        name=na;
        No=n;
        japanese=jp;
        math=mt;
        english=en;
    }

    static double avg(int j,int m,int e){
        return (j+m+e)/3;
    } 

    public  String get_name(){
        return name;
    }

    public String  get_No(){
        return No;
    }

    public int get_japanese(){
        return japanese;
    }

    int get_mt(){
        return math;
    }

    int get_en(){
        return english;
    }



    public static void main(String[] args) {
        Student A=new Student("A","001", 89, 65, 88);
        Student B=new Student("B","002",80,95,88);
        Student C=new Student("C","003", 70, 80, 98);
        List<String>list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(" 名前  学生番号  国語  数学  英語");
        System.out.println(A.get_name()+"さん   "+A.get_No()+"      "+A.get_japanese()+"    "+A.get_mt()+"    "+A.get_en());
        System.out.println(B.get_name()+"さん   "+B.get_No()+"      "+B.get_japanese()+"    "+B.get_mt()+"    "+B.get_en());
        System.out.println(C.get_name()+"さん   "+C.get_No()+"      "+C.get_japanese()+"    "+C.get_mt()+"    "+C.get_en());
        }
}
