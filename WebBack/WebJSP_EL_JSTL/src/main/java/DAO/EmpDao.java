package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.Dept;
import DTO.Emp;
import UTILS.SingletonHelper;

public class EmpDao {
	Connection conn;
	private List<Emp> emplist;
	PreparedStatement pstmt;
	ResultSet rs;
	Emp emp; //emp �ּҰ� �ٲ��� ���� ���� ����ų �� �־ �ʵ�� ���ߵȴ�.
	
	//������(�ʱ�ȭ)
	public EmpDao() {
		conn = SingletonHelper.getConnection("oracle");
		List<Emp> emplist = new ArrayList<Emp>();
		pstmt = null;
		rs = null;
		emp = null;
		
	}
	
	//1. ��ü��ȸ
	public List<Emp> EmpgetAllList(){
	      //POINT
	      List<Emp> emplist = new ArrayList<Emp>();
		try {
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Emp emp = new Emp(); // �ϳ��� row ��� ���� ��ü
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(88);
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));				


				emplist.add(emp); // �迭�� ��ü ��� ��
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}
		
		return emplist;
	}
	
	//2. ������ȸ
	public Emp getEmpListByEmpNo(int empno){

	      try {

	         String sql = "select empno, ename, job from emp where empno=?";
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, empno);
	         
	         rs = pstmt.executeQuery();

	         while (rs.next()) {
	            emp = new Emp(); // �ϳ��� row ��� ���� ��ü
	            emp.setEmpno(rs.getInt("empno"));
	            emp.setEname(rs.getString("ename"));
	            emp.setJob(rs.getString("job"));
	         }
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      } finally {
	         SingletonHelper.close(rs);
	         SingletonHelper.close(pstmt);
	      }

	      return emp;
	}
	
	//3. ����
	public int insertEmp(Emp emp) {
		 //Connection conn = null;
		 PreparedStatement pstmt=null;
		 int rowcount = 0;
		 
		 try {
			 //conn = SingletonHelper.getConnection("oracle");
			 String sql="insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values(?,?,?,?,?,?,?,?)";
			 pstmt = conn.prepareStatement(sql);
			 
			 pstmt.setInt(1, emp.getEmpno());
			 pstmt.setString(2, emp.getEname());
			 pstmt.setString(3, emp.getJob());
			 pstmt.setInt(4, emp.getMgr());
			 pstmt.setDate(5, new java.sql.Date(emp.getHiredate().getTime()));
			 pstmt.setInt(6, emp.getSal());
			 pstmt.setInt(7, emp.getComm());
			 pstmt.setInt(8, emp.getDeptno());
			 rowcount = pstmt.executeUpdate(); 
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	
	//4. ����
	public int deleteEmp(int empno) {
		 PreparedStatement pstmt=null;
		 int rowcount = 0;
		 
		 try {
			 String sql="delete from emp where empno=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, empno);
			 rowcount = pstmt.executeUpdate();
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	
	//5. ����
	public int updateEmp(Emp emp) {
		 int rowcount = 0;
		 
		 try {
			 String sql="update emp set ename=? , job=? , sal=? , hiredate=?  where empno=?";
			 pstmt = conn.prepareStatement(sql);
			 
			 pstmt.setString(1, emp.getEname());
			 pstmt.setString(2, emp.getJob());
			 pstmt.setInt(3, emp.getSal());
			 pstmt.setDate(4, new java.sql.Date(emp.getHiredate().getTime()));
			 pstmt.setInt(5, emp.getEmpno());
			 rowcount = pstmt.executeUpdate(); 
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	
	//6. LIKE �̸� �˻�
	public List<Emp> getEmpAllListByEname(String ename){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//POINT
		List<Emp> emplist = new ArrayList<Emp>();

		try {
			String sql = "select empno, ename, deptno from emp where ename like ?"; //error ��ģ��: missing expression
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + ename + "%"); //like '%DAYEONG%'
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Emp emp = new Emp(); // �ϳ��� row ��� ���� ��ü
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setEmpno(rs.getInt("empno"));
				emplist.add(emp); // �迭�� ��ü ��� ��
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}

		return emplist;
	}
}
