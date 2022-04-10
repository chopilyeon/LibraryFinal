import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login2 {
    public static void login(HashMap<Member, String> loginlist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String password = sc.nextLine();
        if (loginlist.containsKey(new Member(id,password))){
            System.out.println("로그인이 완료되었습니다");
        }else{
            while (true) {
                System.out.println("로그인에 실패하였습니다");
                System.out.println("아이디를 입력하세요");
                String id1 = sc.nextLine();
                System.out.println("비밀번호를 입력하세요");
                String password1 = sc.nextLine();
                if (loginlist.containsKey(new Member(id1,password1))){
                    System.out.println("로그인이 완료되었습니다");
                    break;

                }


            }

        }

    }


}