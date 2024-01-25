

interface Person {
    void introduce();
}

class Teacher implements Person {
    private String name; 
    private String job; 
    private String subject;

    public Teacher(String name, String job, String subject) {
    this.name = name;
    this.job = job;
    this.subject = subject;
    }

    @Override
    public void introduce() {
    System.out.println("氏名：" + name);
    System.out.println("職種：" + job);
    System.out.println("担当科目：" + subject);
    }
}

class Cook implements Person {
    private String name; 
    private String job; 
    private String specialty; 

    // コンストラクタ
    public Cook(String name, String job, String specialty) {
    this.name = name;
    this.job = job;
    this.specialty = specialty;
    }

    @Override
    public void introduce() {
    System.out.println("氏名：" + name);
    System.out.println("職種：" + job);
    System.out.println("得意料理：" + specialty);
    }
}


public class Main13_3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("竹井一馬", "教員", "情報処理");
        Cook c1 = new Cook("大原太郎", "シェフ", "オムライス");
        t1.introduce();
        c1.introduce();
        }
}
