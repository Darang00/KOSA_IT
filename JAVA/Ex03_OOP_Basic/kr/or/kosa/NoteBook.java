package kr.or.kosa;

public class NoteBook {
	
	//��Ʈ���� ���콺�� ������ �ִ�
	//���콺>> ��, ��ư 2��, ��ǥ�� ....
	//��ǰ������ ���� �͵�... (����, Ÿ�̾� ��)
	//���콺�� ���赵(class)
	
	
	//��Ʈ���ϰ� ���콺�� ������ ��ǰ�ε�
	//public Mouse mouse = new Mouse(); //Mouse��� �ϴ� Ÿ���� class >> mouse�� �������� >> �ּҰ� ������ ��
	
	
	
	
	public String color;
	
	//��ü ���� ��� (ĸ��ȭ, ����ȭ: ���������� ���� �����ϰų� ���� ���� ����)
	//year ������ ���̳ʽ� �� ������ ��Ź...
	//������ >> �� ���� �����ž� >> ���Ұ� >> ���������� ��밡�� .... >> �������� ���ؼ� read, write
	//���� >> �����ڰ� ���� ���ؼ� ���� �ϰڴ� ...
	//public int year;
	private int year; 
	
	//��� ĸ��ȭ(read, write �Լ�) >> ǥ��ȭ >> getYear.., setYeat >> setter, getter
	public void setYear(int data) { //�����Ҵ��� ���� (���� ���ϴ� ���) ������ �� �ִ�
		if(data<0) {
			year = 1999;
		} else {
			year = data;
		}
	}
	
	public int getYear() { //���������� year member field ���� return
		return year;
	
	/*
	//year write �Լ�
	public void writeYear(int data) { //�����Ҵ��� ���� (���� ���ϴ� ���) ������ �� �ִ�
		if(data<0) {
			year = 1999;
		} else {
			year = data;
		}
		
	}
	//year read �Լ�
	public int readYear() { //���������� year member field ���� return
		return year;
	}	*/
	
	//public int number;
	
	//��Ʈ�� �ʿ信 ���� ���콺�� ���� �� �ִ�
	//�������� �ǹ�: ������ ��ü�� �ּҸ� ������.
	
		//
		
	
		
	}
	
	public void handle(Mouse m) {
		
		m.x = 100;
		m.y = 200;
		
	}
	
	}

