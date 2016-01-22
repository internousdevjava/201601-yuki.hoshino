import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		KisoKadai3Inp i = new KisoKadai3Inp();
		KisoKadai3Mkdir m = new KisoKadai3Mkdir();
		KisoKadai3Out o = new KisoKadai3Out();
		/*
		System.out.println("1キー：ファイルに追記");
		System.out.println("2キー：ファイルを作成");
		System.out.println("3キー：ファイルを出力");
		for(;;){
			@SuppressWarnings("resource")
			String cmd1 = new java.util.Scanner(System.in) .nextLine();
			switch(cmd1){
			case "1":
				i.fileNIn();
				i.input();
				i.inp();
				System.out.println("qキーを押してください");
				String cmdInp = new java.util.Scanner(System.in) .nextLine();
				if(cmdInp == "q"){
					break;
				}
				break;
			case "2":
				m.fileN();
				m.mkdir();
				System.out.println("qキーを押してください");
				String cmdMkd = new java.util.Scanner(System.in) .nextLine();
				if(cmdMkd == "q"){
					break;
				}
				break;
			case "3":
				o.fileN();
				o.out();
				System.out.println("出力しました");
				System.out.println("qキーを押してください");
				String cmdOut = new java.util.Scanner(System.in) .nextLine();
				if(cmdOut == "q"){
					break;
				}
				break;
			default:
				System.out.println("上記キー以外のキーが押されました");
				break;
			}
			System.out.println("4キーで終了します");
			@SuppressWarnings("resource")
			int cmd2 = new java.util.Scanner(System.in) .nextInt();
			if(cmd2 == 4){
				break;
			}
		}
		*/
		int end = 0;
		do{

			System.out.println("\n\n--メニュー--\n\n 1:ファイルを作成する\n 2:ファイルに追記する\n 3:ファイルを出力する\n "
					+ "99:終了\nのどれかをキー入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int nu = 0;

			if(str.matches("^[0-9]+$")){
				nu = Integer.parseInt(str);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			}

			if(nu == 99){
				System.out.println("終了");
				break;
			}
			if(nu == 1){
				System.out.println("ファイルを作成");
				m.fdN();
				m.mkdir();
			}
			if(nu == 2){
				System.out.println("ファイルに追記");
				i.fdN();
				i.input();
				i.inp();
			}
			if(nu == 3){
				System.out.println("ファイルを出力");
				o.fdN();
				o.out();
			}
		}while(end < 1);
		System.out.println("--処理終了--");
	}
}
