import kr.or.kosa.Pclass;

/*
 상속관계에서... 접근자 : protected
 
 public
 private
 default > 같은 폴더 
 protected
 
 protected: 양면성 (박쥐) >> default, public
 >> 상속이 없는 클래스 안에서 protected >> default 동일
 >> 결국 상속관계에서만 의미를 가진다. (상속관계에서 public이다)
 
 Protected: 상속관계 > public
            같은 class내 > default
            설계도 디자인 할 때 상속관계에서 내가 만든 함수를 다른 사람들이 강제로 재정의 하도록 강제하는 방법

 */

class Dclass{
	public int i; // 클래스가 default라서 변수 앞에 public 의미가 없다
	private int p;
	int s; // default
	protected int k;  // default (일반 적으로는 어차피 default 로 쓰면 되니까 쓸 필요 없다.. why 그럼 왜쓰냐)
}


class Child2 extends Pclass{// 상속관계
	void method() {
		this.k = 100; // 상속관계 >> 자식은 부모의 protected 자원을 public 처럼 사용 
		System.out.println(this.k);
	}
	
}
public class Ex08_Inherit_Protected {
	
	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.i
		//p.k >> 객체 생성 사용 (default)
		Child2 ch = new Child2();
		ch.method();

	}

}
