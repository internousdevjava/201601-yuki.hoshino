/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("数字を入力してください");
		int input = new java.util.Scanner(System.in). nextInt();
		int ans = 50;
		for(int i = 1; i <= 100; i++){
			if(i == ans && i == input){
				System.out.println("True!");
			}else if(i == ans && i != input){
				System.out.println("False...");
			}
		}
	}

}
