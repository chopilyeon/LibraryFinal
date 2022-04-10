import java.util.*;

public class LibraryMain {
    public static void main(String[] args){
       	HashMap<Member02,Member02> joinlist=new HashMap<>();
        HashMap<Member,Member> loginlist=new HashMap<>();
        HashMap<Member, Book> booklist=new HashMap<>();
		HashMap<Manager,String> managerlist=new HashMap<>();
		ArrayList<Book> bookmanage=new ArrayList<>();//책 이름, 지은이
        Scanner sc =new Scanner(System.in);

		//--------------------------------------------------------------

		joinlist.put(new Member02("조재희","9503051411711"),new Member02("jaehee3679","4a5s6d1f2g","01029523679"));
		loginlist.put(new Member("jaehee3679","4a5s6d1f2g"),new Member("조재희","9503051411711","01029523679"));
		booklist.put(new Member("jaehee3679","4a5s6d1f2g"), new Book("없음","없음","없음","없음"));
		joinlist.put(new Member02("조필연","9503050000000"),new Member02("wogml3679","4a5s6d1f2g","01022222222"));
		loginlist.put(new Member("wogml3679","4a5s6d1f2g"),new Member("조필연","9503050000000","01022222222"));
		booklist.put(new Member("wogml3679","4a5s6d1f2g"), new Book("없음","없음","없음","없음"));
		System.out.println(loginlist.get(new Member("jaehee3679","4a5s6d1f2g")));
		System.out.println(joinlist.get(new Member02("조재희","9503051411711")));
		managerlist.put(new Manager("jaehee"),"1234");
		bookmanage.add(new Book("동백꽃","김유정"));
		bookmanage.add(new Book("동백꽃","김유정"));
		bookmanage.add(new Book("죄와벌","도스토예프스키"));
		bookmanage.add(new Book("죄와벌","도스토예프스키"));
		bookmanage.add(new Book("오발탄","이범선"));


        System.out.println("======================================================================================================================================================================================================");
        System.out.println("===================================================================== 재희네도서관 ======================================================================================================================");
        System.out.println("1.회원가입");
        System.out.println("2.책 빌리기");
        System.out.println("3.책 반납");
		System.out.println("4.대출가능한 도서 목록");
	    System.out.println("4.대출가능한 도서 목록");
        System.out.println("5.비밀번호 확인");
        System.out.println("6.비밀번호 수정");
        System.out.println("7.(회원만)회원정보 보기");
        System.out.println("8.(매니저만)회원정보 보기");
        System.out.println("9.회원정보 탈퇴");
        System.out.println("10.(매니저만)책 입고");
        System.out.println("11.프로그램 종료");
        System.out.println("======================================================================================================================================================================================================");
        System.out.println("======================================================================================================================================================================================================");
        
        start : while(true) {
        System.out.println("원하시는 항목을 클릭해주세요.");
        switch(sc.nextInt()){
            case 1:
				System.out.println("===================================회원가입===================================");
            	Join2.join(joinlist,loginlist,booklist);
            	//이거 자체도 명시적형변환 중. 위에서 이미 지정해놨으므로.
           
            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();

            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
            	
            case 2:
				System.out.println("===================================책 대여===================================");
            	View.borrow(loginlist,booklist,bookmanage);

            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
            	
            case 3:
				System.out.println("===================================책 반납===================================");
            	View.turnin(loginlist,booklist,bookmanage);

            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();  
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
            case 4:
				System.out.println("===================================대출가능한 책 목록 보기===================================");
            	ShowBookList.showBooklist(loginlist,bookmanage);
            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
			case 5:
				System.out.println("===================================비밀번호 확인===================================");
				Modification.checkout(joinlist);
				System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
				sc.nextLine();
				if(sc.nextLine().equalsIgnoreCase("Y")) {
					continue;
				}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
					break start;
				}
            case 6:
				System.out.println("===================================비밀번호 수정===================================");
            	Modification.modify(joinlist,loginlist,booklist);
            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
            case 7:
				System.out.println("===================================내 정보 보기===================================");
            	Information.show(loginlist,booklist);
            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();   
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
            case 8:
				System.out.println("===================================(매니저) 회원정보 보기==================================");
            	Manager.showAll(managerlist,booklist);
            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
            	sc.nextLine();
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            		break start;
            	}
			case 9:

				System.out.println("===================================회원 탈퇴===================================");
				Rm.removeInformation(joinlist,loginlist,booklist);
				System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
				sc.nextLine();
				if(sc.nextLine().equalsIgnoreCase("Y")) {
					continue;
				}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
					break start;
				}

			case 10:
				System.out.println("===================================(매니저) 책 관리하기===================================");
				Book.bookcare(managerlist,bookmanage);

				System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
				sc.nextLine();
				if(sc.nextLine().equalsIgnoreCase("Y")) {
					continue;
				}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
					break start;
				}


			case 11:
				System.out.println("===================================시스템 종료===================================");
            	System.out.println("시스템을 종료합니다");
            	break start;
            	
            default:
            	System.out.println("잘못눌렀습니다");
            	System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
				sc.nextLine();
            	if(sc.nextLine().equalsIgnoreCase("Y")) {
            		continue start;
            	}else if(!sc.nextLine().equalsIgnoreCase("Y")) {
            	break start;
            	}
      
        }

    }
	System.out.println("도서시스템을 종료합니다");

    }
}










   



