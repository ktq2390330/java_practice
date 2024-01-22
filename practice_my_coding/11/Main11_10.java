import java.util.*;
import java.nio.charset.*;

class BookInfo{
    private int No=0;
    private String book_name;
    private String writer_name;
    private int  year;
    private int id;

    BookInfo(String bn,String wn,int y){
        this.book_name=bn;
        this.id=++No;
        this.writer_name=wn;
        this.year=y;
    }

    String getBook_name() {return book_name;}
    String getWriter_name() {return writer_name;}
    int getYear() {return year;}
    int getNo() {return id;}

    void setBook_name(String book_name){this.book_name=book_name;}
    void setWriter_name(String writer_name){this.writer_name=writer_name;}
    void setYear(int year){this.year=year;}
    void setId(int id){this.id=id;}

    public static void print_all(List<BookInfo> list){
        for (BookInfo id:list){
            System.out.println("書名:"+id.book_name);
            System.out.println("著者名:"+id.writer_name);
            System.out.println("出版年"+id.year);
            System.out.println("書籍番号:"+id.id);
        }
    }
    public static BookInfo add_book(){
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));
        System.out.print("書名:");
        String book_name=stdIn.nextLine();
        System.out.print("著者名:");
        String writer_name=stdIn.nextLine();
        System.out.print("出版年:");
        int year=stdIn.nextInt();
        stdIn.nextLine();

        BookInfo book=new BookInfo(book_name,writer_name,year);
        return book;
    }
}
class Main11_10{
    public static void main(String[] args) {
        ArrayList<BookInfo> BookList=new ArrayList<>();
        Scanner stdIn=new Scanner(System.in,Charset.forName("Shift-JIS"));

        while (true) {

            System.out.println("1:書籍の追加");
            System.out.println("2:書籍の一覧表示");
            System.out.println("Others:終了");
            System.out.print("動作を選んでください:");
            String x=stdIn.nextLine();

            switch (x) {
                case "1":
                    BookInfo book=BookInfo.add_book();
                    BookList.add(book);
                    break;
                
                case "2":
                    BookInfo.print_all(BookList);
                    break;
            
                default:
                    System.out.println("終了します");
                    break;
            }
        }
    }
}