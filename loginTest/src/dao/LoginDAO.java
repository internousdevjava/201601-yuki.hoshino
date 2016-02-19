package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dto.LoginDTO;
import util.DBConnector;

/**
 * @author Y.Hoshino
 * @version 1.0
 * データベースとに繋ぎ、ユーザーネームとパスワードの有無を確認するクラス
 */
public class LoginDAO extends ActionSupport{
	/**
	 * 入力されたユーザーネームとパスワードを、データベースにあるユーザーネームとパスワードと照合するメソッド
	 * @param user_name
	 * @param pass
	 * @return boolean型で、ユーザーネームとパスワードがあればtrue、無ければfalseを返します。
	 */
	public boolean selectDB(String user_name, String pass){
		boolean result = false;
		Connection con = DBConnector.getConnection("loginTest");
		String sql = "select * from user where user_name = ? AND pass = ?";
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
		}finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
