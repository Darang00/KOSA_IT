/*
 �ǹ� (����) ȯ��
 �� ���� Ŭ������ �����ؼ� ����ϴ� ���� ����
 
 ���赵 1�忡 ��� ������ �����ϴ� ���� ���������� �Ұ���
 ���赵�� �������� ������ ... ���� �߻�... (���� �ʿ�, ���赵 ���� ����)
 
 ���ι�: ���� ����, ��۰���, �Ǹ�ó, ȸ������, ������ ����, ��ǰ���� >> ������ ������ ���ؼ� > ������ ���赵
 **** ���� ****
 
 �������� ���赵�� '����'��� ���� ���ؼ� �̾��ִ� ����
 1. ��� (is ~ a : ���): ' �� ~�̴� (�θ� �ڿ�)' ��� ������ �����Ѵٸ� ��� ���� ��� ����
 2. * ���� * (has a : ����): ��(��) ~�� ������ �ִ�.
 
 ��)
 ���� �����̴�
 �� extends ����
 �ﰢ���� �����̴�
 �ﰢ�� extends ����
 
 �� �� �� ����
 ���� ���̴� (X)
 ���� ���� ������ �ִ� (O)
 has ~ a (��ǰ����)
 >> class ��{���̶�� ��ǰ�� member field}
 
 ���� ����
 ������ �����̴� (X)
 ������ ������ ������ �ִ� (O)
 >> class ���� {}
 >> class ���� {���� member field}
 
 ���� �����̴�
 �ﰢ���� �����̴�
 �簢���� �����̴�
 
 ������ �и� (������) �����ڿ� : �߻�ȭ, �Ϲ�ȭ (�׸���, ������ ������ �ִ�)
 ���� ��üȭ, Ư��ȭ �� ������ ������ �־�� �Ѵ�.(���θ� ������ Ư¡) (������, �� ��)

 ��: ��ǥ�� (x, y) 
 ���� ���� ������ �ִ�
 �ﰢ���� ���� ������ �ִ�
 �簢���� ���� ������ �ִ�
 
 
 class Shape{�׸���, ����} >> ��Ӱ��迡�� �θ�� �ΰڴ� (��, �ﰢ��, �簢���� �θ� �ȴ�)
 class Point{��ǥ��} >> ���԰���
 
 ����üȸ, Ư��ȭ ��: Circle, Triangle
 
 */

// �߻�ȭ, �Ϲ�ȭ, ����
class Shape{
	String color="gold"; //����Ӽ�
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		//this.x = 1;
		//this.y = 1;
		this(1,1);  //�����ڸ� ȣ���ϴ� this
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
}
//���� ���弼�� (���� ���� : ���� ������ �������� ������ �ִ�)
//1. ���� �����̴� (is ~ a) : shape 
//2. ���� ���� ������ �ִ�(has ~a) : point >> member field
//3. ���� �������� ������ �ִ�(Ư�� ,��ü) : r

//���� �������� �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ (10,15) ������
//�ʱⰪ�� �������� ������ �������� ���� ���� �Է��� ���� �� �ִ� (���� ����� ����  new )
//�����ڸ� ...Ȱ�� (hint)

//����2)
/*
�ﰢ�� Ŭ������ ���弼��
�ﰢ���� 3���� ���� ����� �׸��� �׸��� ����� ������ �ִ�
hint) Shape , Point ���� �޾Ƽ� ���赵 �ۼ� �ϼ���
hint) (x,y) , (x,y) , (x,y)
default �ﰢ���� ���� �� �ְ�  3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ� 
*/

//70�� + 10��
class Triangle extends Shape {
	Point x;
	Point y;
	Point z;
	
	public Triangle() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60));
	}
	
	public Triangle(Point x , Point y , Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//��üȭ ,Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
	}
	
}

//100��
class Triangle2 extends Shape {
	Point[] pointarray;
	
	
	public Triangle2() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		//this(new Point(10,20),new Point(30,40),new Point(50,60));
		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
	}
	
	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	//��üȭ ,Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("x :(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}
	
}


class Circle extends Shape{ //���
	Point point; //����(��ǰ)
	int r; //Ư����
	
	public Circle() {
		//this.r = 10;
		//this.point = new Point(10,15);
		this(10,new Point(10,15));
	}
	public Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.r);
		System.out.println(c.color); //���
		System.out.println(c.point.x);  //���� ...
		System.out.println(c.point.y);  //���� ...
		c.draw(); //���
		
		//������ , ������ ���� �Է�
		//Point point = new Point(100, 200);
		//Circle c2 = new Circle(50, point);
		Circle c2 = new Circle(50, new Point(100,200));
		
		Triangle tri = new Triangle();
		tri.trianglePoint();
		
		Triangle tri2 = new Triangle(new Point(1,2), new Point(3,4),new Point(5,6));
		tri2.trianglePoint();
		
		Point[] parray = new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)};
		Triangle2 tri3 = new Triangle2(parray);
		tri3.trianglePoint();
		
	}

}