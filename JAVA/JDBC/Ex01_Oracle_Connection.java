import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 JDBC
 1. Java 언어 (APP)를 통해서 Oracle(소프트웨어)를 연결해서 CRUD 작업 할거다
 2. Java App: Oracle, My-sql, Ms-sql 등등 모든 데이터 베이스에 연결할 수 있고 작업할 수 있다 (CRUD)
 2.1 각각의 제품에 맞는 드라이버를 가지고 있어야 한다. 
 CASE 1: 삼성 노트북 >> HP 프린터 연결 >> HP 프린터 사이트에서 드라이버를 다운 받아서 >> 삼성 노트북에 설치 >> HP 프린터
 CASE 2: HP 프린터 제조 회사는 ... 삼성, LG 회사 마다 적용할 수 있는 드라이버를 별도로 제작
 각 언어에 맞는 드라이버를 다운로드 해서 제품의 맞게 설치하고 접속...
 Oracle (C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib)
 Mysql (놓쳤음.. 확인)
 
 강사PC: (확인...)
 
 3. 드라이버를 참조 (현재 프로젝트에서 사용) >> Java Project -> 속성 -> build path ->
 (놓쳤음.. 확인...)
 
 3.1 드라이버 사용 준비 완료 >> 메모리에 load 사용...
 3.2 Class.forName("oracle.jdbc.OracleDriver"); ... new해서 객체 생성
  
4. JAVA CODE (CRUD) >> JDBC API 제공 받는다
4.1 import.java.sql.* >> interface, class 제공
4.2 개발자는 interface 를 통해서 표준화된 DB 작업 수행
POINT) why interface 형태로 제공? >> JDBC API >> Oracle, Mysql, ....)
	// 놓쳤다..(확인)
	//
	//

>>다형성을 구현 (인터페이스 활용)
import java.sql.Connection
import java.sql.ResultSet
import.java.sql.Statement 등등

5. 작업 순서 (*외우기*)
5.1 DB 연결 >> 명령 생성 >> 명령 실행 >> 처리 >> 자원 해제
5.1 명령: DDL (create, alter, drop)
         CRUD (insert, select, update, delete)
    실행: 쿼리문을 DB 서버에게 전달
    처리: 결과를 받아서 화면에 출력, 또는 다른 프로그램에 전달 등등
    자원 해제: 연결 해제
 
 */



public class Ex01_Oracle_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// DB 연결 -> 명령생성 -> 실생 -> 처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("오라클 드라이버 로딩....");
	
		//loading 된 드라이버를 통해서 oracle  연결
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KOSA", "1004");
		System.out.println(conn.isClosed() +" 정상 false");
		
		Statement stmt = conn.createStatement(); //명령객체 얻어오기
		
		//CRUD
		String sql = "select empno, ename, sal from emp";
		
		ResultSet rs = stmt.executeQuery(sql); //명령 실행
		
		//rs를 통해서 DB서버 memory에 생성된 정보를 조회
		//처리(화면조회)
		//만약에 중간에 DB 연결 close() ... 연결기반 프로그램
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "/" 
							+ rs.getString("ename") 
							+ rs.getInt("sal"));
		}
		
		stmt.close();
		rs.close();
		conn.close();
		System.out.println("DB 연결: " + conn.isClosed());

	}	
}
