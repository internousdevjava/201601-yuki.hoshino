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
		int x = new java.util.Scanner(System.in). nextInt();
		int y = new java.util.Scanner(System.in). nextInt();
		for(int i = 1; i <= x; i++){
			for(int j = 1; j <= y; j++){
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
