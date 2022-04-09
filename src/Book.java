import java.util.*;

public class Book {
    private String bookname;
    private String writer;
    private String bookhistory;
    private String date;
    private String specialCode;

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", writer='" + writer + '\'' +
                ", bookhistory='" + bookhistory + '\'' +
                ", date='" + date + '\'' +
                ", specialCode='" + specialCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(bookname, book.bookname) && Objects.equals(writer, book.writer) && Objects.equals(bookhistory, book.bookhistory) && Objects.equals(date, book.date) && Objects.equals(specialCode, book.specialCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookname, writer, bookhistory, date, specialCode);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBookhistory() {
        return bookhistory;
    }

    public void setBookhistory(String bookhistory) {
        this.bookhistory = bookhistory;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public Book(String bookname, String writer, String bookhistory, String date) {
        super();
        this.bookname = bookname;
        this.writer = writer;
        this.bookhistory = bookhistory;
        this.date=date;
    }
    public Book(String bookname, String writer) {
        super();
        this.bookname = bookname;
        this.writer = writer;
    }





    public static void bookcare(HashMap<Manager, String> managerlist, ArrayList<Book> bookmanage) {
        Scanner sc = new Scanner(System.in);
        System.out.println("매니저 id를 입력하세요");
        String id = sc.nextLine();
        System.out.println("매너지 비밀번호를 입력하세요");
        String password = sc.nextLine();
        if (managerlist.containsKey(new Manager(id)) && managerlist.get(new Manager(id)).equals(password)) {
            System.out.println("1번을 누르면 새로 들어온 책을 새로 입고시킬 수 있습니다. 2번을 명단에서 책을 제거할 수 있습니다");
            int selection = sc.nextInt();
            if (selection == 1) {
                sc.nextLine();
                System.out.println("입고시킬 책을 입력하세요");
                String bookname = sc.nextLine();
                System.out.println("입고시킬 책의 작가를 입력하세요");
                String writer = sc.nextLine();
                bookmanage.add(new Book(bookname,writer));
            } else if (selection == 2) {
                sc.nextLine();
                System.out.println("도서명단에서 제외할 책을 입력하세요");
                String bookname1 = sc.nextLine();
                System.out.println("도서명단에서 제외할 책을 입력하세요");
                String writer1 = sc.nextLine();
                System.out.println("도서명단에서 제외할 책을 입력하세요");
                String specialCode1 = sc.nextLine();
                bookmanage.remove(new Book(bookname1,writer1));
            }


        }

    }

}





