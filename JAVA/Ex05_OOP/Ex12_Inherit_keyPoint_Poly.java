
/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� �����
 A��� ������ǰ ������ ���µǸ� 
 [Ŭ���̾�Ʈ �䱸����]
 ������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ ������ ��� ��ǰ�� ������ �ִ�.
 ������ ������ǰ�� ��ǰ�� ������ �̸� ������ ������ �ִ�.
 ex) 
 ������ ������ǰ�� �̸��� ������ �ִ�. (ex) Tv. Audio, Computer
 ������ ������ǰ�� �ٸ� ���� ������ ������ �ִ�.(Tv: 5000, Audio: 6000)
 ��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
 �ùķ��̼� �ó�����
 ������: ��ǰ�� �����ϱ� ���ؼ� �ݾ�����, ����Ʈ ������ ������ �ִ�.
 ex) 10����, ����Ʈ 0
  �����ڴ� ��ǰ�� ������ �� �ִ�. ���������� �ϰԵǸ� ���� �ִ� ���� �����ǰ� ����Ʈ�� �����Ѵ�.
  �����ڴ� �ʿ信 ���� ó�� �ʱ� �ݾ��� ���� �� �ִ�.
  
  1�� ���� ....
  �Ͽ��� �ް�...
  
  ���� ����
  ���忡 ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰�(���콺, �佺Ʈ��) ��ǰ ��� POS (�ڵ����� ���)
  ���忡 1000���� ��ǰ�� ���õǾ���(Product�� ����ϴ� ��ǰ��)
  1. ���忡�� 3�� ��ǰ�� ���� ������... ������ 997��ǰ�� ������ �� �ִ� ����� ����.
  >> PC�� >> ���� ����� >> ���� ���� ���� >> 997 ���� �Լ� �߰�...
  
  >> ��ȭ�� �����ϴ� �ڵ带 ®��� �Ѵ�.. (������)
  >> ��ſ� �ް��� ������ ���� ��� ���� (��ǰ�� 10000�� �߰��Ǵ��� )
  1. �Լ��� parameter�� �θ�Ÿ��(Product)�� �Ѵ�
  
  
 */

class Product{
	int price;
	int bonuspoint;
	//Product(){}
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(500);
	}
	//KtTv(int price){
	//	super(price);
	//}
	
	//�̸�
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}


class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	//�̸�
	@Override
	public String toString() {
		return "NoteBook";
	}
}

//������
class Buyer{
	int money = 5000;
	int bonuspoint;
	
	/*
	
	//������ �������� (��� : method)
	//�������� (�������� �ܾ׿��� - ��ǰ�� ���� , ����Ʈ ���� ���� +)
	//**�����ڴ� ���忡 �ִ� ��� ������ǰ�� ������ �� �ִ� ** 3�� ���Ű���
	void kttvBuy(KtTv n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void AudioBuy(Audio n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	void NoteBookBuy(NoteBook n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	*/
	//1�� ���� 
	//�ϳ��� �̸����� �������� ���(method overloading)
	/*
	void Buy(KtTv n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void Buy(Audio n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	
	void Buy(NoteBook n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	*/
	
	//2������
	//��ǰ�� �߰� �Ǵ��� ���������� ��� �Ǿ�� �Ѵ�
	//�ϳ��� �̸� , �ߺ��Ǵ� �ڵ� (�ߺ��ڵ� ����)
	//��� ��ǰ�� Product��� >> �θ�Ÿ���� ���������� �ڽİ�ü�� �ּҸ� ���� �� �ִ�
	void Buy(Product n) { //�Լ��� parameter ��ǰ��ü�� �ּҸ� �޾Ƽ� ..(����,����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //kttvBuy �Լ� ����
		}
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
}

public class Ex12_Inherit_keyPoint_Poly {

	public static void main(String[] args) {
		//�����̶�� �����ϰ�
		//KtTv kt = new KtTv();
		//System.out.println(kt.price);
		//System.out.println(kt.bonuspoint);
		//System.out.println(kt);
		
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		/*
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.NoteBookBuy(notebook);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		buyer.kttvBuy(kt);
		*/
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(notebook);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
		buyer.Buy(kt);
	}

}