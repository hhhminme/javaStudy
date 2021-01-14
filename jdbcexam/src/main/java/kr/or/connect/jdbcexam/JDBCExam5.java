package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;
public class JDBCExam5 {
	public static void main(String[] args) {
		
		int RoleId = 100; 
		String description = "SLIME";
		
		Role role = new Role(RoleId,description);
		
		RoleDao dao = new RoleDao();
		
		int updateCount = dao.updateRole(role);
		System.out.println(updateCount);
	}
}
