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
		System.out.println("数字Xを入力してください");
		System.out.print("X=");
		@SuppressWarnings("resource")
		int x = new java.util.Scanner(System.in). nextInt();
		System.out.println("数字Yを入力してください");
		System.out.print("Y=");
		@SuppressWarnings("resource")
		int y = new java.util.Scanner(System.in). nextInt();
		for(int i = 1; i <= x; i++){
			for(int j = 1; j <= y; j++){
				System.out.print(" "+ df.format(i*j));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
