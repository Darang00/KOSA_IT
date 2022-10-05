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
	      
	   
	      System.out.println("[전체조회]*******");
	      List<Emp> emplist = dao.EmpgetAllList();
	      //화면구성
	      if(emplist != null) {
	         empPrint(emplist);
	      }
	      
	    //조건조회
			System.out.println("[조건조회]*******");
			Emp emp =dao.getEmpListByEmpNo(7934);
			if(emp != null) {
				empPrint(emp);
			}else {
				//.....
			}
			
		    //삽입
			System.out.println("[데이터 삽입]*******");
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
			
			
			System.out.println("[방금전 insert 데이터 전체조회]*******");
			emplist =dao.EmpgetAllList();
			//화면구성
			if(emplist != null) {
				empPrint(emplist);
			}
			
			System.out.println("[방금전 insert 데이터 수정하기]*******");
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
			
			//데이터 삭제
			System.out.println("[방금전 update 데이터 삭제하기]*******");
			row = dao.deleteEmp(7788);
			if(row > 0) {
				System.out.println("delete rowcount : " + row);
			}
			
			System.out.println("[방금전 delete 데이터 전체조회]*******");
			emplist =dao.EmpgetAllList();
			//화면구성
			if(emplist != null) {
				empPrint(emplist);
			}
			
			//이름 검색 (like)
			Emp searchEmp = new Emp();
			System.out.println("검색할 이름을 입력하세요 >> ");
			Scanner scan = new Scanner(System.in);
			
			String empName = scan.nextLine(); //next() 쓰지 말고 nextLine() 쓰기

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
