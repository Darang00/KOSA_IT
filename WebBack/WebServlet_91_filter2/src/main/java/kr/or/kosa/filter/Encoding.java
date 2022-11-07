package kr.or.kosa.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/Encoding")
public class Encoding extends HttpFilter implements Filter {
       
	//member field 생성
	private String encoding;
	
    public Encoding() {
        super();
       
    }
    
    public void init(FilterConfig fConfig) throws ServletException { //public void init(FilterConfig filterConfig): 필터를 웹 콘테이너에 생성한 후 초기화할 때 호출한다.
		//최초 요청시 컴파일되고 한번만 실행
    	//web.xml 설정되어 있는 초기값을 read 해서 사용 FilterConfig 통해서
    	this.encoding = fConfig.getInitParameter("encoding"); //web.xml에 설정된 
    	System.out.println("filter init 함수 실행 : " + this.encoding);

    }

	public void destroy() { //필터가 웹 콘테이너에서 삭제될 때 호출된다.
		
	}

	// 함수를 통해서 요청 / 응답 필터링 제어  //체인을 따라 다음에 존재하는 필터로 이동한다. 체인의 가장 마지막에는 클라이언트가 요청한 최종 자원이 위치한다.
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//request  요청에 대한 필터 실행 코드 영역
		if(request.getCharacterEncoding() == null) {
			//request.setCharacterEncoding("utf-8"); //서블릿에서 POST 방식으로 정보를 서버에 전달해 줄때 .jsp 파일 or .html 파일에서 폼 태그에 입력한 값을 전송한다고 칩시다.
			//폼 태그에서 입력한 값을 전송할 때 GET 방식과 POST 방식으로 나뉘는데 POST 방식으로 보내는 값이 '한글'일 경우 깨지지 않게 전달하기 위해 사용
			System.out.println("before : " + request.getCharacterEncoding());
			//한줄 코드 (공통관심 , 보조관심 AOP)
			request.setCharacterEncoding(this.encoding);
			System.out.println("after : " + request.getCharacterEncoding());
		}
		chain.doFilter(request, response);
		
		//response 응답에 대한  필터 실행 코드 영역
		System.out.println("응답처리 실행");
	}

	

}
