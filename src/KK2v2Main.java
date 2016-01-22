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
public class KK2v2Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		KK2v2GameCPU GCP = new KK2v2GameCPU();
		KK2v2GameAlone Galn = new KK2v2GameAlone();
		int end = 0;
		do{

			System.out.println("--数当てゲーム--\n\n--メニュー--\n 1:vs CPUモード \n 2:ひとりモード \n99:終了");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int nu = 0;

			if(str.matches("^[0-9]+$")){
				nu = Integer.parseInt(str);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			}

			if(nu == 99){
				System.out.println("終了します");
				break;
			}
			if(nu == 1){
				System.out.println("vs CPUモード");
				GCP.game();
			}
			if(nu == 2){
				System.out.println("ひとりモード");
				Galn.game();
			}
		}while(end < 1);
		System.out.println("--終了--");
	}

}
