package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;

/**
 * @author Y.Hoshino
 * @version 1.0
 * ログイン処理を行うクラス
 */
public class LoginAction extends ActionSupport{

	/**
	 * ユーザーネームを格納する変数
	 */
	private String user_name;

	/**
	 *パスワードを格納する変数
	 */
	private String pass;

	/**
	 *セッション情報を格納する変数
	 */
	private Map<String, Object> session;

	/**
	 * ログイン処理を行うメソッド
	 * @return ユーザーネームとパスワードを入力し、データベースと照合、
	 * データベースに一致するユーザーネームとパスワードがあればsuccess,無ければerrorを返します。
	 * @see dao.LoginDAO.java, util.DBConnector.java
	 */
	public String execute(){
		LoginDAO dao = new LoginDAO();
		boolean res = dao.selectDB(user_name, pass);
		if(!res){
			return "error";
		}
		return "success";
	}

	/**
	 * ユーザーネームを取得するメソッド
	 * @return user_nameを返します。
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * ユーザーネームを格納するメソッド
	 * @param user_name
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * パスワードを取得するメソッド
	 * @return passを返します。
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * パスワードを格納するメソッド
	 * @param pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return sessionを返します。
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
