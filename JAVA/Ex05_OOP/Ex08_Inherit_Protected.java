import kr.or.kosa.Pclass;

/*
 ��Ӱ��迡��... ������ : protected
 
 public
 private
 default > ���� ���� 
 protected
 
 protected: ��鼺 (����) >> default, public
 >> ����� ���� Ŭ���� �ȿ��� protected >> default ����
 >> �ᱹ ��Ӱ��迡���� �ǹ̸� ������. (��Ӱ��迡�� public�̴�)
 
 Protected: ��Ӱ��� > public
            ���� class�� > default
            ���赵 ������ �� �� ��Ӱ��迡�� ���� ���� �Լ��� �ٸ� ������� ������ ������ �ϵ��� �����ϴ� ���

 */

class Dclass{
	public int i; // Ŭ������ default�� ���� �տ� public �ǹ̰� ����
	private int p;
	int s; // default
	protected int k;  // default (�Ϲ� �����δ� ������ default �� ���� �Ǵϱ� �� �ʿ� ����.. why �׷� �־���)
}


class Child2 extends Pclass{// ��Ӱ���
	void method() {
		this.k = 100; // ��Ӱ��� >> �ڽ��� �θ��� protected �ڿ��� public ó�� ��� 
		System.out.println(this.k);
	}
	
}
public class Ex08_Inherit_Protected {
	
	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.i
		//p.k >> ��ü ���� ��� (default)
		Child2 ch = new Child2();
		ch.method();

	}

}
