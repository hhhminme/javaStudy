package kr.or.connect.jdbcexam;
import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCExam4 { //delete
	public static void main(String[] args) {
		int roleId = 501;
		
		RoleDao dao = new RoleDao();
		int deleteCount = dao.deleteRole();

		System.out.println(deleteCount);
		
		
//		int roleId = 200; 
//		String description = "PM";
//		
//		Role role = new Role(roleId,description);
//		
//		RoleDao dao = new RoleDao();
//		int insertCount = dao.addRole(role);
//		
//		System.out.println(insertCount);
	}
}
