package kr.or.kosa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.dto.Emp;
import kr.or.kosa.utils.SingletonHelper;

public class EmpDao {
	Connection conn;
	private List<Emp> emplist;
	PreparedStatement pstmt;
	ResultSet rs;
	Emp emp; //emp 주소가 바껴야 다음 행을 가르킬 수 있어서 필드로 빼야된다.
	
	//생성자(초기화)
	public EmpDao() {
		conn = SingletonHelper.getConnection("oracle");
		List<Emp> emplist = new ArrayList<Emp>();
		pstmt = null;
		rs = null;
		emp = null;
		
	}
	
	//전체조회
	public List<Emp> getEmpList() throws SQLException{
		
		PreparedStatement pstmt = null;
		String sql="select empno, ename , job, mgr, hiredate, sal, comm, deptno from emp";
		
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<Emp> emplist = new ArrayList<Emp>(); //POINT
		//[new memo()][new memo()][new memo()][new memo()]
		while(rs.next()) {
			Emp emp = new Emp();
			emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setHiredate(rs.getDate("hiredate"));
            emp.setSal(rs.getInt("sal"));
            emp.setComm(rs.getInt("comm"));
            emp.setDeptno(rs.getInt("deptno"));
			
			emplist.add(emp);
		}
		
		SingletonHelper.close(rs);
		SingletonHelper.close(pstmt);
		
		return emplist;
	}
	
	
	//조건조회 (where id=? : 데이터 1건 보장 : id컬럼 > unique , primary key)

		public Emp getEmpListByEmpNo(int empno){
			Connection conn = null;
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		      //POINT
		      Emp emp =null;

		      try {
		         conn = SingletonHelper.getConnection("oracle");
		         String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where empno=?";
		         /* System.out.println(conn); */
		         pstmt = conn.prepareStatement(sql);
		         pstmt.setInt(1, empno);
		         
		         rs = pstmt.executeQuery();

		         while (rs.next()) {
		            emp = new Emp(); 
		            emp.setEmpno(rs.getInt("empno"));
		               emp.setEname(rs.getString("ename"));
		               emp.setJob(rs.getString("job"));
		               emp.setMgr(rs.getInt("mgr"));
		               emp.setHiredate(rs.getDate("hiredate"));
		               emp.setSal(rs.getInt("sal"));
		               emp.setComm(rs.getInt("comm"));
		               emp.setDeptno(rs.getInt("deptno"));

		           
		         }
		      } catch (Exception e) {
		         System.out.println(e.getMessage());
		      } finally {
		         SingletonHelper.close(rs);
		         SingletonHelper.close(pstmt);
		      }

		      return emp;
		}
		
	
	//검색
	public Emp SearchByEmpno(int empno) {
		return emp;
	}
	
}
