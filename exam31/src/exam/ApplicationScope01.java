package exam;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * Servlet implementation class ApplicationScope01
 */
@WebServlet("/ApplicationScope01")
public class ApplicationScope01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationScope01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답을 만들어내고 싶으니깐 response한테 setContentType을 지정했구요
		//그 다음에 응답을 내보낼 통로를 getWriter 메서드를 이용해가지고 하나 얻어냈고
		//이 얻어낸 통로를 out이라는 레퍼런스 변수가 가리키고 있겠죠
		response.setContentType("text/html;charset=MS949");
		
		PrintWriter out = response.getWriter();
		//ServletContext라는 객체가 실제 웹 애플리케이션 영역이라고 생각하면 된다.
		ServletContext application = getServletContext();
		int value = 1; 
		application.setAttribute("value", value);
		out.println("<h1>value : " + value + "</h1>");
	}
}
