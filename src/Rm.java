import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rm {

    public static void removeInformation(HashMap<Member02,Member> joinlist,HashMap<Member,Member> loginlist,HashMap<Member, Book> booklist){
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String id=sc.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String password=sc.nextLine();

        if(loginlist.containsKey(new Member(id,password))){
            String name=loginlist.get(new Member(id,password)).getName();
            String identity=loginlist.get(new Member(id,password)).getIdentity();
            joinlist.remove(new Member02(name,identity));
            loginlist.remove(new Member(id,password));
            booklist.remove(new Member(id,password));
            System.out.println("회원정보를 모두 삭제하였습니다");
        }else{
            System.out.println("회원정보가 일치하지 않습니다. 다시 확인해주세요");
        }

    }

}
