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
		@SuppressWarnings("resource")
		int input = new java.util.Scanner(System.in). nextInt();
		int ans = 50;
		for(int i = 1; i <= 100; i++){
			if(i == ans && i == input){
				System.out.println("True!");
				break;
			}else if(input <= ans && i != input && i == ans){
				System.out.println("小さいです");
				break;
			}else if(input >= ans && i != input && i == ans){
				System.out.println("大きいです");
				break;
			}
		}
	}

}
