package kr.or.kosa.dto;

/*
 create table mvcregister(
    id number constraint pk_mvcregister_id primary key,
    pwd varchar2(20) not null,
    email varchar2(50) not null
);

desc mvcregister;
 */

public class RegisterDto {
	private int id;
	private String pwd;
	private String email;
	
	
	public RegisterDto() {}
	
	

	public RegisterDto(int id, String pwd, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", pwd=" + pwd + ", email=" + email + "]";
	}
	
	


}
