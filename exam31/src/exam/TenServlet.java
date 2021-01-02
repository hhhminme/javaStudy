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
    //�������� �������� ������ -> ��û�� �������� �� ���α׷��� ����Ǹ鼭 ten�̶�� ��û�ϸ� �� ������ ����Ǹ鼭 
    //�����ϴ� �ڵ带 ������ �� �ڵ带 ������ -> �����ϰ� ���� ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>1���� 10���� ���!!<h1>");

		for(int i = 1; i<=10; i++) {
			out.println(i+"<br>");
		}
		out.close();
	}
}
