import java.io.File;
import java.io.IOException;

public class KisoKadai3Mkdir {
	String fileN,dirN;
	@SuppressWarnings("resource")
	void fdN(){
		System.out.println("ファイルを作成します");
		System.out.println("保存するフォルダを指定してください");
		this.dirN = new java.util.Scanner(System.in) .nextLine();
		System.out.println("ファイル名を入力してください");
		this.fileN = new java.util.Scanner(System.in) .nextLine();
	}
	public void mkdir(){
		File newfile = new File(this.dirN + this.fileN);
		try {
			newfile.createNewFile();
			System.out.println(this.dirN + "に" + this.fileN + "が作成されました");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
