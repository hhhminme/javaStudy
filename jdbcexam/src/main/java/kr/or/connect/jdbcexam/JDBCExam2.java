package kr.or.connect.jdbcexam;
import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;
public class JDBCExam2 {
	public static void main(String[] args) {
		int roleId = 200; 
		String description = "PM";
		
		Role role = new Role(roleId,description);
		
		RoleDao dao = new RoleDao();
		int insertCount = dao.addRole(role);
		
		System.out.println(insertCount);
	}
}
