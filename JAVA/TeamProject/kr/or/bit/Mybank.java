package kr.or.bit;

import java.util.ArrayList; //�ڹٿ��� ArrayList�� ����ϱ� ����
import java.util.Collections; //Collection: ��ü�� ����, �׷�
import java.util.List;
import java.util.Calendar;

class Bank {
	//Composition�� Ŭ���� ���� ����(composite) ���踦 �ξ��ִ� ��,
	//��, �� Ŭ������ ��������� �ٸ� Ŭ���� Ÿ���� ���� ������ �����ϴ� ���� �ǹ��Ѵ�.
	
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
		accounts.add(new Account(accountNo, name)); // ArrayList �� account ������ �߰�
		totalAccount++;
	}
	
	Account getAccount(String accountNo) {  //getter
		// accountNo�� �Ķ���ͷ� �޾Ƽ� �ش� �Ķ������ ���� ������ ���¸� ã�� ��ȯ
        // Account value = new Account(accountNo, accountNo); //�Ķ���͸� �̷��� �ؾߵǳ�????
		for(Account value1 : accounts) {
			if(value1.getAccountNo().equals(accountNo))
			{
				return value1;
			}
		}
		return null;
	}
	
	List<Account> findAccounts(String name){ //�̸��� ���¸� ã�� �޼ҵ�
		List<Account> nameList = new ArrayList();
		for(Account value : accounts) {
			if(value.getName().equals(name)) {
				//���� �̸�
				nameList.add(value);
			}
		}
		return nameList;
		
	}
	
	List<Account> getAccounts(){ // ��ü���¸�� ��ȯ
		return accounts;
		
	}
	
	int getTotalAccount() {
		//�� ���� ���� ����
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
		//�Ա�
		balance += amount;
	};
	void withdraw(long amount) {
		//���
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
	    System.out.print("�� ���� ���� ");
	    System.out.println(bank.getTotalAccount());
	    
	    System.out.print("\n3333�� ���¹�ȣ�� ���� ���� ");
	    System.out.println(bank.getAccount("3333"));
	    System.out.println("\n***�̸��� hong�� ����� ���� ��ȸ***");
        List<Account> findAccount = bank.findAccounts("hong");
        for(Account a : findAccount) {
            System.out.println(a);
        }
		System.out.println("\n***��ü ���� ��ȸ***");
		System.out.println(bank.getAccounts().toString());
	}
}