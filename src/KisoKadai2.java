/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("スタート");
		System.out.println("数字を入力してください \n ターン数が100になるまでに当ててください");
		int a = 0;
		int ans = new java.util.Random() .nextInt(100);
			for(int i = 1; i <= 100; i++){
				@SuppressWarnings("resource")
				int input = new java.util.Scanner(System.in). nextInt();
				if(ans == input){
					System.out.println("True!");
					break;
				}else if(ans != input){
					System.out.println("False...");
				}

				if(input > ans){
					System.out.println("ヒント：小さいです");
				}else if(input < ans){
					System.out.println("ヒント：大きいです");
				}
				a++;
				System.out.println("現在のターン数 : " + a);
			}
	}

}
