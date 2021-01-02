package exam;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TenServlet
 */
@WebServlet("/ttt")
public class TenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //동적으로 응답결과를 만들어내는 -> 요청이 들어왔을때 이 프로그램이 실행되면서 ten이라고 요청하면 이 서블릿이 실행되면서 
    //응답하는 코드를 만들어내고 이 코드를 보내줌 -> 응답하고 싶은 내용
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>1에서 10까지 출력!!<h1>");

		for(int i = 1; i<=10; i++) {
			out.println(i+"<br>");
		}
		out.close();
	}
}
