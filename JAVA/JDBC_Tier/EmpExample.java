import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import DAO.EmpDao;
import DTO.Dept;
import DTO.Emp;
import UTILS.SingletonHelper;
import oracle.sql.DATE;

public class EmpExample {

	public static void main(String[] args) {

	      EmpDao dao = new EmpDao();
	      
	   
	      System.out.println("[��ü��ȸ]*******");
	      List<Emp> emplist = dao.EmpgetAllList();
	      //ȭ�鱸��
	      if(emplist != null) {
	         empPrint(emplist);
	      }
	      
	    //������ȸ
			System.out.println("[������ȸ]*******");
			Emp emp =dao.getEmpListByEmpNo(7934);
			if(emp != null) {
				empPrint(emp);
			}else {
				//.....
			}
			
		    //����
			System.out.println("[������ ����]*******");
			Emp insertempt = new Emp();
			insertempt.setEmpno(100);
			insertempt.setEname("DAYEONG");
			insertempt.setJob("Engineer");
			insertempt.setMgr(9999);
			insertempt.setHiredate(new Date());
			insertempt.setSal(5000);
			insertempt.setComm(50);
			insertempt.setDeptno(20);			
			
			int row = dao.insertEmp(insertempt);
			if(row > 0) {
				System.out.println("insert rowcount : " + row);
			}
			
			
			System.out.println("[����� insert ������ ��ü��ȸ]*******");
			emplist =dao.EmpgetAllList();
			//ȭ�鱸��
			if(emplist != null) {
				empPrint(emplist);
			}
			
			System.out.println("[����� insert ������ �����ϱ�]*******");
			//String sql="update emp set ename=? , job=? , sal=? , hiredate=?  where empno=?";
			Emp updateEmp = new Emp();
			updateEmp.setEmpno(100);
			updateEmp.setEname("DAYEONG_up");
			updateEmp.setJob("IT_up");
			updateEmp.setMgr(9999);
			updateEmp.setHiredate(new Date());
			updateEmp.setSal(7500);
			updateEmp.setComm(50);
			updateEmp.setDeptno(20);
			
			row = dao.updateEmp(updateEmp);
			if(row > 0) {
				System.out.println("update rowcount : " + row);
			}
			
			//������ ����
			System.out.println("[����� update ������ �����ϱ�]*******");
			row = dao.deleteEmp(7788);
			if(row > 0) {
				System.out.println("delete rowcount : " + row);
			}
			
			System.out.println("[����� delete ������ ��ü��ȸ]*******");
			emplist =dao.EmpgetAllList();
			//ȭ�鱸��
			if(emplist != null) {
				empPrint(emplist);
			}
			
			//�̸� �˻� (like)
			Emp searchEmp = new Emp();
			System.out.println("�˻��� �̸��� �Է��ϼ��� >> ");
			Scanner scan = new Scanner(System.in);
			
			String empName = scan.nextLine(); //next() ���� ���� nextLine() ����

			emplist = dao.getEmpAllListByEname(empName);
			
			if(empName != null) {
				empPrint(emplist);
			}else {
			}	
	}
			
			public static void empPrint(Emp emp) {
			      System.out.println(emp.toString());
			   }
			   public static void empPrint(List<Emp> list) {
			      for(Emp data : list) {
			         System.out.println(data.toString());
			      }
			   }		
	}
