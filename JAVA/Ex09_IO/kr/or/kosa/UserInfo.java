package kr.or.kosa;
/*
 ��ü ���
 ��ü (����ǰ(Car, Tv, Tankd etc)) ��Ʈ��ũ, **����(txt���� ��ü write, ��ü read ���� �� ��ü���� �ְ�޴� �� 
 ���μ���: ���� ����ǰ� �ִ� ���α׷�
 
 ����ȭ: ��ü�� �����ؼ� ���� ���� ������ ����
 ������ȭ: ��ü�� �ٽ� �����ϴ� ����
 
 �ǽ�) ����
 ��ü write(����) : ����ȭ
 ��ü read(����) : ������ȭ
 
 ��� �ڿ�(class) ����ȭ �Ұ���
 ����ȭ ���� ��ǰ�� ���� ���...
 implements Serializable(�����)
 */

import java.io.Serializable; //Serializable: �������̽�

public class UserInfo implements Serializable { // ����ȭ ����
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
