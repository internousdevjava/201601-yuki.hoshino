import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3Inp {
	String fileN;
	@SuppressWarnings("resource")
	void fileNIn(){
		System.out.println("ファイルに追記します");
		System.out.println("追記したいファイル名を保存場所名から入力してください");
		this.fileN = new java.util.Scanner(System.in) .nextLine();
	}
	String input1;
	@SuppressWarnings("resource")
	void input(){
		System.out.println("追記したい内容を記述してください");
		this.input1 = new java.util.Scanner(System.in) .nextLine();
	}
	public void inp(){
		FileWriter fw = null;
		try{
			fw = new FileWriter("C:\\Users\\internous\\Documents\\" + this.fileN,true);
			fw.write(this.input1 + "\r\n");
			fw.flush();
			System.out.println("Documentsの" + this.fileN + "に"+ this.input1 + "を追記しました");
		}catch(IOException e){
				System.out.println("ファイル書き込みエラーです");
		}finally{
			if(fw != null){
				try{
					if(fw != null){
						fw.close();
					}
				}catch(IOException e2){}
			}
		}
	}
}
