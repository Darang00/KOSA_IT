package kr.or.kosa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.dao.EmpDao;
import kr.or.kosa.dto.Emp;

@WebServlet("/EmpList")
public class EmpList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EmpList() {
        super();
    }
    
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("목록보기");
    	 RequestDispatcher dis;
    	String id = request.getParameter("empno");
    	EmpDao dao = new EmpDao();
    	List<Emp> emplist = null;
    	Emp emp = null;
    	try {
    		if(id!=null) {
    			emp = dao.getEmpListByEmpNo(Integer.parseInt(id));
    			request.setAttribute("emp", emp );
				  dis = request.getRequestDispatcher("/EmpSearch.jsp");
				  System.out.println(emp);
    		}
    		
			 else {
    		emplist = dao.getEmpList();
			 request.setAttribute("emplist", emplist);
    			dis = request.getRequestDispatcher("/EmpList.jsp");
			 System.out.println(emplist);
			 }
//    		System.out.println(emplist);
			 //데이터 저장
			 //view 지정

			 //forward
			 dis.forward(request, response);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
