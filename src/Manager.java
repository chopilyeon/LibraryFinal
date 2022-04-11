import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Manager extends Member{
	
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	Manager(String id){
		super(id);
	}
	Manager(String name,String id,String identity){
		super(name,id,identity);
	}
	
	//책 뭐 빌렸는지 보여줌. 
    public static void showAll(HashMap<Manager,String> managerlist, HashMap<Member,Book> booklist) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("매니저 id를 입력하세요");
    	String id=sc.nextLine();
    	System.out.println("매너지 비밀번호를 입력하세요");
    	String password=sc.nextLine();
    	if(managerlist.containsKey(new Manager(id))&&managerlist.get(new Manager(id)).equals(password)){
    		Set<Map.Entry<Member, Book>> set = booklist.entrySet();
    		for (Map.Entry<Member, Book> e : set) {
    			System.out.println("아이디:\t"+e.getKey().getId()+"\t 비밀번호:\t"+e.getKey().getPassword() + "\t책 이름\t" + e.getValue().getBookname()+"\t작가명\t"+e.getValue().getWriter()+"\t날짜\t"+e.getValue().getDate());
    		}
    	}else {
    		System.out.println("관리자가 아닙니다. 돌아가주세요");
    	}
    	
    }	




	@Override
	public String toString() {
		return "Manager []";
	}

    
}