package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnector;

public class LoginDAO {
	public boolean selectDB(String user_name, String pass){
		boolean result = false;
		Connection con = DBConnector.getConnection("loginTest");
		String sql = "select * from user where user_name = ? and pass = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, pass);
			ResultSet rSet = ps.executeQuery();

			if(rSet.next()){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}
