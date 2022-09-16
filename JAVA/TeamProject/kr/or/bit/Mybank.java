package kr.or.bit;

import java.util.ArrayList; //자바에서 ArrayList를 사용하기 위해
import java.util.Collections; //Collection: 객체의 모음, 그룹
import java.util.List;
import java.util.Calendar;

class Bank {
	//Composition은 클래스 간에 포함(composite) 관계를 맺어주는 것,
	//즉, 한 클래스의 멤버변수로 다른 클래스 타입의 참조 변수를 선언하는 것을 의미한다.
	
	//Field
	private int totalAccount;
	private List<Account> accounts;
	
	
	//Constructor
	public Bank() {
		totalAccount = 0;
		accounts =	new ArrayList<Account>();
	}
	
	//Method
	void addAccount(String accountNo, String name) {
		//Account account = new Account(accountNo, name);
		accounts.add(new Account(accountNo, name)); // ArrayList 에 account 데이터 추가
		totalAccount++;
	}
	
	Account getAccount(String accountNo) {  //getter
		// accountNo를 파라미터로 받아서 해당 파라미터의 값을 가지는 계좌를 찾아 반환
        // Account value = new Account(accountNo, accountNo); //파라미터를 이렇게 해야되나????
		for(Account value1 : accounts) {
			if(value1.getAccountNo().equals(accountNo))
			{
				return value1;
			}
		}
		return null;
	}
	
	List<Account> findAccounts(String name){ //이름의 계좌를 찾는 메소드
		List<Account> nameList = new ArrayList();
		for(Account value : accounts) {
			if(value.getName().equals(name)) {
				//같은 이름
				nameList.add(value);
			}
		}
		return nameList;
		
	}
	
	List<Account> getAccounts(){ // 전체계좌목록 반환
		return accounts;
		
	}
	
	int getTotalAccount() {
		//총 계좌 개수 리턴
		return totalAccount;
	}	
}

class Account{
	
	private String accountNo;
	private String name;
	private long balance = 0;
	
	public Account(String accountNo, String name){
		this.accountNo = accountNo;
		this.name = name;
	}
	
	List<Transaction> t = new ArrayList<Transaction>();
	
	void deposit(long amount) {
		//입금
		balance += amount;
	};
	void withdraw(long amount) {
		//출금
		balance -= amount;
	}
	long getBalance() {
		return balance;
	}

	List<Transaction> getTransactions(){
		return t;
	}
	
	//getter setter?
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]\n";
	}

	
}

class Transaction{
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
}

public class Mybank{
	public static void main(String[] args) {
		
		
		Bank bank = new Bank();			
		bank.addAccount("1111", "kim");
	    bank.addAccount("2222", "lee");
	    bank.addAccount("3333", "park");
	    bank.addAccount("4444", "hong");
	    bank.addAccount("5555", "hong");
	    bank.addAccount("6666", "kim");
	    bank.addAccount("7777", "lee");
	    System.out.print("총 계좌 개수 ");
	    System.out.println(bank.getTotalAccount());
	    
	    System.out.print("\n3333이 계좌번호인 계좌 정보 ");
	    System.out.println(bank.getAccount("3333"));
	    System.out.println("\n***이름이 hong인 사람의 계좌 조회***");
        List<Account> findAccount = bank.findAccounts("hong");
        for(Account a : findAccount) {
            System.out.println(a);
        }
		System.out.println("\n***전체 계좌 조회***");
		System.out.println(bank.getAccounts().toString());
	}
}