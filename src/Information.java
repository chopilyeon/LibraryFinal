import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Information {

    @Override
    public String toString() {
        return "Information{}";
    }

    public static void show(HashMap<Member,Member> loginlist, HashMap<Member,Book> booklist){
        Scanner sc=new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String id=sc.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String password=sc.nextLine();
        if(loginlist.containsKey(new Member(id,password))){
            System.out.println("빌린 책"+booklist.get(new Member(id,password)).getBookname());
            System.out.println("내역"+booklist.get(new Member(id,password)).getBookhistory());
            System.out.println("빌린 날짜"+booklist.get(new Member(id,password)).getDate());
            System.out.println("빌린 책의 작가"+booklist.get(new Member(id,password)).getWriter());

        }else {
        	System.out.println("정보를 다시 입력하세요. 일치하는 정보가 없습니다.");
        }






    }




}
