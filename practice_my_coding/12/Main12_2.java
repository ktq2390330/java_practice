import java.util.ArrayList;
import java.util.Scanner;
import java.nio.charset.*;

abstract class Person{
    String name;
    String job;

    Person(String n,String j){
        this.name=n;
        this.job=j;
    }

    String getName(){return name;}
    String getJob(){return job;}

    abstract Person adds();

    abstract void introduce();
}

class Teacher extends Person{
    String subject;

    Teacher(String n,String j,String sub){
        super(n, j);
        this.subject=sub;
    }

    @Override
    String getName() {return super.getName();}

    @Override
    String getJob() {return super.getJob();}

    String getSubject(){return subject;}

    @Override
    void introduce() {
        System.out.println("氏名:"+this.name);
        System.out.println("職業:"+this.job);
        System.out.println("担当科目:"+this.subject);
    }
}

class Cook extends Person{
    String specialities;

    Cook(String n,String j,String sp){
        super(n, j);
        this.specialities=sp;
    }

    @Override
    String getName() {return super.getName();}

    @Override
    String getJob() {return super.getJob();}

    @Override
    void introduce() {
        System.out.println("氏名:"+this.name);
        System.out.println("職業:"+this.job);
        System.out.println("得意料理:"+this.specialities);
    }
}

public class Main12_2 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        ArrayList<BookInfo> teacherList=new ArrayList<>();
        Teacher tc=new Teacher(null, null, null);
        ArrayList<BookInfo> cookList=new ArrayList<>();
        while (true) {

            System.out.println("1:職員の追加");
            System.out.println("2:教員の一覧表示");
            System.out.println("3:コックの一覧表示");
            System.out.println("Others:終了");
            System.out.print("動作を選んでください:");
            String x=stdIn.nextLine();

            switch (x) {
                case "1":
                    System.out.print("氏名:");
                    String name=stdIn.nextLine();
                    System.out.print("職業:");
                    String job=stdIn.nextLine();
                    switch (job) {
                        case "教員":
                            System.out.print("担当科目:");
                            stdIn.nextLine();
                            break;
                        case "シェフ":
                            System.out.print("得意料理:");
                            stdIn.nextLine();
                            break;

                        default:
                            System.out.println("error:データのない職業です");
                            break;
                    }
                    break;
                
                case "2":

                case "3":
                    break;
            
                default:
                    System.out.println("終了します");
                    break;
            }
        }
    }
}
