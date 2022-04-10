
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Member02 {
	    private String name;
		private String password;
	    private String id;
	    private String identity;
	    private String phonenumber;

		  Member02(){};
		  Member02(String name,String identity){
			  this.name=name;
			  this.identity=identity;
		  }

			
			//회원가입용
	       Member02(String id,String password,String phonenumber){
	         this.id=id;
	         this.password=password;
	         this.phonenumber=phonenumber;
	        }

	@Override
	public String toString() {
		return "Member02{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", id='" + id + '\'' +
				", identity='" + identity + '\'' +
				", phonenumber='" + phonenumber + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Member02)) return false;
		Member02 member02 = (Member02) o;
		return Objects.equals(name, member02.name) && Objects.equals(password, member02.password) && Objects.equals(id, member02.id) && Objects.equals(identity, member02.identity) && Objects.equals(phonenumber, member02.phonenumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, password, id, identity, phonenumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	//번호확인용
	        Member02(String name){
	         this.name=name;
	        }



}
