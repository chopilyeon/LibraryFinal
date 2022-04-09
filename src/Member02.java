
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Member02 {
	
	
	
	
	    private String name;
	    private String id;
	    private String identity;
	    private String phonenumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookhistory() {
		return bookhistory;
	}

	public void setBookhistory(String bookhistory) {
		this.bookhistory = bookhistory;
	}

	public String getHomeadress() {
		return homeadress;
	}

	public void setHomeadress(String homeadress) {
		this.homeadress = homeadress;
	}

	private String password;
	    private Date date;
	    private String bookname;
	    private String bookhistory;
	    private String homeadress;
	    
	    
	   
	    
		  Member02(){};
		  Member02(String name,String identity){
			  super();
			  this.name=name;
			  this.identity=identity;
		  }

		

		Member02(String name,String ID,String identity,String phonenumber,String password,Date date,String bookname,String bookhistory,String homeadress){
	            super();
	            this.id=ID;
	            this.name=name;
	            this.identity=identity;
	            this.phonenumber=phonenumber;
	            this.password=password;
	            this.date=date;
	            this.bookname=bookname;
	            this.bookhistory=bookhistory;
	            this.homeadress=homeadress;

	        }
			
			//회원가입용
	       Member02(String id,String identity,String phonenumber){
	         this.id=id;
	         this.identity=identity;
	         this.phonenumber=phonenumber;
	        }
	        
	        //번호확인용
	        Member02(String name){
	         this.name=name;
	        }



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Member02 member02 = (Member02) o;
		return Objects.equals(name, member02.name) && Objects.equals(id, member02.id) && Objects.equals(identity, member02.identity) && Objects.equals(phonenumber, member02.phonenumber) && Objects.equals(password, member02.password) && Objects.equals(date, member02.date) && Objects.equals(bookname, member02.bookname) && Objects.equals(bookhistory, member02.bookhistory) && Objects.equals(homeadress, member02.homeadress);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id, identity, phonenumber, password, date, bookname, bookhistory, homeadress);
	}

	@Override
			public String toString() {
				return "Member02 [name=" + name + ", id=" + id + ", identity=" + identity + ", phonenumber="
						+ phonenumber + ", password=" + password + ", date=" + date + ", bookname=" + bookname
						+ ", bookhistory=" + bookhistory + ", homeadress=" + homeadress + "]";
			}



		
	        //

	  
	  
	        
	        

}
