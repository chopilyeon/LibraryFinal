import java.util.*;

public class ShowBookList {
    public static void showBooklist(HashMap<Member,Member> loginlist, ArrayList<Book> bookmanage){
        Scanner sc=new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String id=sc.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String password=sc.nextLine();
        if(loginlist.containsKey(new Member(id,password))){
            System.out.println("===================대출 가능한 도서 목록입니다.========================");
            for(int i=0;i<bookmanage.size();i++){
                System.out.println("책 이름: \t"+bookmanage.get(i).getBookname()+"\t 작가:\t"+bookmanage.get(i).getWriter());

            }
        }else{
            System.out.println("회원정보가 없습니다");
        }








    }


}
