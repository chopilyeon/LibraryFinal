import java.util.Map;
import java.util.Scanner;

public class Join2 {

    public static void join(Map<Member02,Member> joinlist,Map<Member,Member>loginlist, Map<Member,Book> booklist){

    	Scanner sc =new Scanner(System.in);
        System.out.println("\n이름을 입력하세요\n");
        String name=sc.nextLine();
        System.out.println("\n주민번호를 -없이 입력하세요\n");
        String identity=sc.nextLine();
        System.out.println("\n아이디를 입력하세요\n");
        String id=sc.nextLine();
        System.out.println("\n휴대폰번호를 -없이 입력하세요\n");
        String phonenumber=sc.nextLine();
        System.out.println("\n비밀번호를 입력하세요\n");
        String password=sc.nextLine();
        if(!joinlist.containsKey(new Member(name,identity))) {
            joinlist.put(new Member02(name, identity), new Member(id,password,phonenumber));
            loginlist.put(new Member(id,password),new Member(name,identity,phonenumber));
            booklist.put(new Member(id,password),new Book("없음","없음","없음","없음"));
            System.out.println("\n회원가입이 완료되었습니다");
        }else if(joinlist.containsKey(new Member(name,identity))){
            System.out.println("이미 회원입니다. 도서관을 이용해주세요");
        }

    }

}
