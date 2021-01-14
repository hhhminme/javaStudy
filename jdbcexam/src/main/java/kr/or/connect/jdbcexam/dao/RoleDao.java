package kr.or.connect.jdbcexam.dao;
import kr.or.connect.jdbcexam.dto.Role;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";

	public int updateRole(Role role) {
		int updateCount = 0; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "UPDATE role SET description = ? WHERE role_id = ?";
		
		try  (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)){
			
			ps.setString(1, role.getDescription());
			ps.setInt(2,role.getRoleId());
			
			updateCount = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return updateCount;
	}
}