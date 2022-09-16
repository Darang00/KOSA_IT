package kr.or.kosa;
/*
 객체 통신
 객체 (완제품(Car, Tv, Tankd etc)) 네트워크, **파일(txt파일 객체 write, 객체 read 간에 이 객체들을 주고받는 일 
 프로세스: 현재 실행되고 있는 프로그램
 
 직렬화: 객체를 분해해서 줄을 세워 보내는 과정
 역직렬화: 객체를 다시 조립하는 과정
 
 실습) 파일
 객체 write(파일) : 직렬화
 객체 read(파일) : 역직렬화
 
 모든 자원(class) 직렬화 불가능
 직렬화 가능 제품을 만들어서 사용...
 implements Serializable(레고블럭)
 */

import java.io.Serializable; //Serializable: 인터페이스

public class UserInfo implements Serializable { // 직렬화 가능
	private String name;
	private String pwd;
	private int age;

	public UserInfo() {}
	
	public UserInfo(String name, String pwd, int age) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public String getPwd() {
		return pwd;
	}
	public int getAge() {
		return age;
	}

}
