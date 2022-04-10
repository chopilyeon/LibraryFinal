import java.text.SimpleDateFormat;
import java.util.*;

public class View {

	
	
	//책 빌리기 시스템 빌린 책. 빌린 날짜. 빌림으로 바꿔버림.
    public static void borrow(HashMap<Member, Member> loginlist, HashMap<Member,Book> booklist, ArrayList<Book> bookmanage) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ID를 입력하세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String password = sc.nextLine();

        if (loginlist.containsKey(new Member(id, password)) && booklist.get(new Member(id, password)).getBookhistory().equals("없음")) {
            System.out.println("빌리고 싶은 책을 입력하세요.");
            String bookname = sc.nextLine();
            System.out.println("빌리고 싶은 책의 작가를 입력하세요");
            String writer = sc.nextLine();
            for (int i = 0; i < bookmanage.size(); i++) {
                if (bookmanage.get(i).getBookname().equals(bookname) && bookmanage.get(i).getWriter().equals(writer))
                    sum++;
            }

            if (sum != 0) {
                Date today = new Date();
                String pattern = "yyyy-MM-dd hh:mm:ss(E)";
                SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                String date = sdf.format(today);
                String bookhistory = "빌림";
                System.out.println(bookname + "을 대여하였습니다.");
                System.out.println("대여날짜는" + date + "입니다." + "대여처리되었습니다.");
                bookmanage.remove(new Book(bookname,writer));
                booklist.put(new Member(id, password), new Book(bookname, writer, bookhistory, date));
            } else {
                System.out.println("도서 목록에 없습니다");
            }
        } else if (booklist.get(new Member(id, password)).getBookhistory().equals("빌림")) {
            System.out.println("대여 이력이 있습니다. 우선 반납해주세요");
        } else if (!loginlist.containsKey(new Member(id, password))) {
            System.out.println("회원이 아닙니다 회원가입을 해주세요");
        }
    }


    //책반납하기 시스템 // 반납하면 책정보 싹다 바꿔버림. 반납완료. 반납시간. 안빌림
    public static void turnin(HashMap<Member,Member> loginlist,HashMap<Member,Book> booklist,ArrayList<Book> bookmanage) {

    	  Scanner sc=new Scanner(System.in);
          System.out.println("ID를 입력하세요");
          String id=sc.nextLine();
          System.out.println("비밀번호를 입력하세요");
          String password=sc.nextLine();
          if(loginlist.containsKey(new Member(id,password))&&booklist.get(new Member(id,password)).getBookhistory().equals("빌림")) {
        	 System.out.println("반납하실 겁니까? Y or N");
        	 String answer=sc.nextLine();
        	 if(answer.equals("Y")) {
        		 String bookname="반납완료";
        		 Date today=new Date();
        		 String pattern = "yyyy-MM-dd hh:mm:ss(E)";
                 SimpleDateFormat sdf=new SimpleDateFormat(pattern);
                 String date=sdf.format(today);
                 System.out.println("반납시간은"+date+"입니다.반납처리되었습니다");
        		 String bookhistory="없음";
                 String bookname1=booklist.get(new Member(id,password)).getBookname();
                 String writer1=booklist.get(new Member(id,password)).getWriter();
        		 booklist.put(new Member(id,password),new Book(bookname1,writer1,bookhistory,date));
                 bookmanage.add(new Book(bookname1,writer1));
        	 }
          }else if(!loginlist.containsKey(new Member(id,password))){
               	  System.out.println("없는 정보입니다. 회원가입을 해주세요");
          }else if(booklist.get(new Member(id,password)).getBookhistory().equals("없음")){
                 System.out.println("대여 이력이 없습니다. 반납할것이 없습니다.");
          }


    }

     }
