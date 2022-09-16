import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
	static int totalfiles = 0;    //���ϰ���
	static int totaldirs = 0;   //��������
	
	static void printFileList(File dir) {
		System.out.println("Full Path: " + dir.getAbsolutePath());
		
		//�ڵ� .. ����
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles(); //���� �ڿ� ������ ��... �ϳ� �ϳ��� file ��ü
		//[0] > a.txt  >> �� ���� Ÿ���� File Ÿ��
		//[1] > aaa ����
		//[2] > bbb ����
		//[3] > java.jpg
		for(int i = 0; i<files.length; i++) {
			String filename = files[i].getName(); // ������ or ���ϸ�
			if(files[i].isDirectory()) { //����
				filename = "[ DIR ]" + filename;
				//* POINT *
				subdir.add(i); //WHY  >> ������ �༮�� index ���� (i) > arrayList
				//subdir[0] > 1
				//subdir[2] > 2
				
			} else { //����
				filename = filename + " / " + files[i].length() + "byte";
			}
		}
		//���� ���� Ȯ�� 
		int dirnum = subdir.size(); //���� �־��� ������ ���� ���� ����
		int filenum = files.length - dirnum;  //���� ����
		
		//�������� (���� ���� �ȿ� �ڿ����� ����)
		totaldirs += dirnum; //�� ������ ������ ���� (������ �������� ������)
		totalfiles += filenum; //�� ���� ���� ���� (������ ��������)
		
		System.out.println("[Current DirNum] : " + dirnum);
		System.out.println("[Current FileNum] : " + filenum);
		System.out.println("*********************************************************");
		
		//Point (���� ������ �ٽ� ���� ���� ����.....)
		//[0] > a.txt  >> �� ���� Ÿ���� File Ÿ��
		//[1] > aaa ���� > a-1����, a-2 ����
		//[2] > bbb ���� > b-1 ����, b.txt, b-1.jpg
		//[3] > java.jpg
		for(int i = 0; i<subdir.size(); i++) { //C:\\Temp ���� >> �ȿ� ���� ���� ����
			int index = subdir.get(i);  //������ �� ��ġ��
			//�� ���� �ڵ�
			printFileList(files[index]); //���ȣ�� (���� �� �ڽ��� �� ȣ��)
			//C:\\Temp\\aaa
			
		}
		
	}
	

	public static void main(String[] args) {
		if(args.length !=1) { //main �Լ��� ���� �迭�� ���̰� 1�� ���� �ʴٸ� (�ƹ��͵� �ȵ���ִٸ�)
			System.out.println("����: java [�������ϸ�] [��θ�]");
			System.out.println("����: java Ex10_File_Sublist C:\\Temp");
			System.exit(0);
		}
		File f = new File(args[0]); //File f = new File("C:\\Temp");
		//��ȿ�� ���� 1. �� �����ϴ�? 2. �� ��¥ ���丮��?
		if(!f.exists() || !f.isDirectory()) {
			//�������� �ʰų� �Ǵ� ���丮�� �ƴ϶��
			System.out.println("��ȿ���� ���� ���丮");
			System.exit(0);
		}
		// �������� ���, �׸��� ��������..
		printFileList(f); //ȣ�� (�ݺ�)
		//���� ���� �ȱ����� ���� ����, ���� ���� ����
		System.out.println("������ �� ���� ��: " + totalfiles);
		System.out.println("������ �� ���� ��: " + totaldirs);
	}

}
