import java.io.IOException;

public class KK2v2GameCPU {
	public void game() throws IOException{
		System.out.println("CPUより先に数を当ててください\nターン数が100になるまでに当ててください");
		System.out.println("\n====スタート====");
		System.out.println("数字を入力してください");
		int ans = new java.util.Random() .nextInt(100);
		int a = 0;
			for(int i = 1; i <= 100; i++){
				@SuppressWarnings("resource")
				int input = new java.util.Scanner(System.in). nextInt();
				int enemy = new java.util.Random() .nextInt(100);
				if(enemy == ans){
					System.out.println("enemy true! \n CPUの勝ちです");
					break;
				}

				if(ans == input){
					System.out.println("True! \n あなたの勝ちです");
					break;
				}else if(ans != input){
					System.out.println("False...");
				}
				a++;
				System.out.println("現在のターン数 : " + a);
			}
	}
}
