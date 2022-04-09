import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Member {
	@Override
	public String toString() {
		return "Member{" +
				"name='" + name + '\'' +
				", identity='" + identity + '\'' +
				", phonenumber='" + phonenumber + '\'' +
				", id='" + id + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Member)) return false;
		Member member = (Member) o;
		return Objects.equals(name, member.name) && Objects.equals(identity, member.identity) && Objects.equals(phonenumber, member.phonenumber) && Objects.equals(id, member.id) && Objects.equals(password, member.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, identity, phonenumber, id, password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String name;
	private String identity;
	private String phonenumber;
	private String id;
	private String password;


	Member() {
	}

	;


	Member(String name, String identity, String ID, String password, String phonenumber) {
		super();
		this.id = ID;
		this.name = name;
		this.identity = identity;
		this.phonenumber = phonenumber;
		this.password = password;
	}

	//회원가입용 정보확인
	Member(String ID, String password) {
		super();
		this.id = ID;
		this.password = password;
	}


	//회원정보 저장용
	Member(String ID, String password, String phonenumber) {
		super();
		this.id = ID;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	Member(String id){
		super();
		this.id=id;
	}
	//로그인용


}

