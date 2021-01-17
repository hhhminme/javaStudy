package kr.or.connect.webapiexam.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;
// path가 roles로 시작하지만 그 다음에 *라는 것은 모든것 -> 어떤 문자든지 올 수 있다. 
@WebServlet("/roles/*")
public class RoleByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RoleByIdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		//reauest는 getPathInfo를 이용하여 Path 정보를 읽어오는 것을 알 수 있다. 
		String pathInfo = request.getPathInfo(); // /roles/{roleId}
		//읽어온 path 정보를 split을 이용해서 잘라서 배열을 구했다.
		String[] pathParts = pathInfo.split("/");
		//roels 다음에 오는게 1번임. idStr이 실제 Id에 해당되는값 role_id
		String idStr = pathParts[1];
		//string 이니깐 int 로 바꿈 
		int id = Integer.parseInt(idStr);
		
		RoleDao dao = new RoleDao();
		//RoleDao가 갖고 있는 getRole 메서드의 인자로 넣어주고 있다. 
		Role role = dao.getRole(id);

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(role);

		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	}

}