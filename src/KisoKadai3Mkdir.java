import java.io.File;

public class KisoKadai3Mkdir {
	String dirN1,dirN2;
	@SuppressWarnings("resource")
	void fdN(){
		System.out.println("フォルダを作成します");
		System.out.println("保存するフォルダを絶対パスで指定してください");
		this.dirN1 = new java.util.Scanner(System.in) .nextLine();
		System.out.println("フォルダ名を入力してください");
		this.dirN2 = new java.util.Scanner(System.in) .nextLine();
	}
	public void mkdir(){
		File newdir = new File(this.dirN1 + this.dirN2);
		newdir.mkdir();
		System.out.println(this.dirN1 + "に" + this.dirN2 + "が作成されました");
	}
}
