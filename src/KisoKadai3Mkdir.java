import java.io.File;
import java.io.IOException;

public class KisoKadai3Mkdir {
	String fileN;
	@SuppressWarnings("resource")
	void fileN(){
		System.out.println("ファイルを作成します");
		System.out.println("ファイル名を入力してください");
		this.fileN = new java.util.Scanner(System.in) .nextLine();
	}
	public void mkdir(){
		File newfile = new File("C:\\Users\\internous\\Documents\\" + this.fileN);
		try {
			newfile.createNewFile();
			System.out.println("documentに" + this.fileN + "が作成されました");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
