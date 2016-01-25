import java.text.DecimalFormat;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		final DecimalFormat df = new DecimalFormat("00");
		System.out.println("1～9までの数字Xを入力してください");
		System.out.print("X=");
		@SuppressWarnings("resource")
		int x = new java.util.Scanner(System.in). nextInt();
		if(x > 9){
			System.out.println("1～9までの範囲の数字を入力してください");
			return;
		}
		System.out.println("1～9までの数字Yを入力してください");
		System.out.print("Y=");
		@SuppressWarnings("resource")
		int y = new java.util.Scanner(System.in). nextInt();
		if(y > 9){
			System.out.println("1～9までの範囲の数字を入力してください");
			return;
		}
		for(int i = 1; i <= x; i++){
			for(int j = 1; j <= y; j++){
				System.out.print("|" + j + "*" + i + "="+ df.format(i*j) + "|");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
