class Student{
    private int No;
    private int  japanese;
    private int math;
    private int english;

    Student(int N,int jp,int mt,int en){
        No=N;
        japanese=jp;
        math=mt;
        english=en;
    }

    static double avg(int j,int m,int e){
        return (j+m+e)/3;
    } 
}

class Main11_7{
    public static void main(String[] args) {
        Student Aさん=new Student(001, 89, 65, 88);
        Student Bさん=new Student(002,80,95,88);
        Student Cさん=new Student(003, 70, 80, 98);
    }
}