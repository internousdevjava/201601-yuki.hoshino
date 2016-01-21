import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KisoKadai3Out {
	String fileN,dirN;
	@SuppressWarnings("resource")
	void fdN(){
		System.out.println("ファイルを出力します。");
		System.out.println("フォルダを指定してください");
		this.dirN = new java.util.Scanner(System.in) .nextLine();
		System.out.println("出力するファイル名を入力してください");
		this.fileN = new java.util.Scanner(System.in) .nextLine();
	}
	void out(){
		FileReader fileR = null;
		try{
			fileR = new FileReader(this.dirN + this.fileN);
			System.out.println(this.dirN + "の" + this.fileN + "を出力します");
		  	int ch;
			while((ch = fileR.read()) != -1){
			  System.out.print((char)ch);
			}

		}catch(FileNotFoundException e){
			  System.out.println(e);
		}catch(IOException e){
			  System.out.println(e);
		}finally{
			if(fileR != null){
				try{
					if(fileR != null){
						fileR.close();
					}
				}catch(IOException e2){}
			}
		}
	}
}
