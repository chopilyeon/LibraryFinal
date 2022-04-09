import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Modification {

	
	
	//비밀번호 찾아주기 시스템 비밀번호 뿌려줌. 
	public static void checkout(HashMap<Member02,Member> joinlist) {
		Scanner sc =new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name=sc.nextLine();
		System.out.println("주민번호를 -없이 입력해주세요");
		String identity=sc.nextLine();
		if(joinlist.containsKey(new Member02(name,identity))){
			System.out.println(joinlist.get(new Member02(name,identity)).getPassword());
		}else {
			System.out.println("입력하신 정보가 올바르지 않습니다. 다시 확인해주세요");
		}
	
	}
	
	
	//비밀번호 변경해주기 시스템
	public static void modify(HashMap<Member02,Member> joinlist,HashMap<Member,Member> loginlist,HashMap<Member,Book> booklist) {

		Scanner sc=new Scanner(System.in);
		System.out.println("\n아이디를 입력해주세요\n");
		String id=sc.nextLine();
		System.out.println("\n비밀번호를 입력해주세요\n");
		String password=sc.nextLine();
		if(loginlist.containsKey(new Member(id,password))){
			String name=loginlist.get(new Member(id,password)).getName();
			String identity=loginlist.get(new Member(id,password)).getIdentity();
			String phonenumber=loginlist.get(new Member(id,password)).getPhonenumber();
			String bookname=booklist.get(new Member(id,password)).getBookname();
			String writer=booklist.get(new Member(id,password)).getWriter();
			String bookhistory=booklist.get(new Member(id,password)).getBookhistory();
			String date=booklist.get(new Member(id,password)).getDate();
			System.out.println("새 비밀번호를 입력해주세요");
			String newPassword=sc.nextLine();
			joinlist.put(new Member02(name,identity),new Member(id,newPassword,phonenumber));
			loginlist.put(new Member(id,newPassword),new Member(name,identity,phonenumber));
			booklist.put(new Member(id,newPassword),new Book(bookname,writer,bookhistory,date));

			joinlist.remove(new Member02(name,identity));
			loginlist.remove(new Member(id,password));
			booklist.remove(new Member(id,password));
		}else {
			System.out.println("\n입력하신 정보가 올바르지 않습니다. 다시확인해주세요.\n");
		}

	}
}
	

		
		
	

		
		
		
		
		
		

	
	

