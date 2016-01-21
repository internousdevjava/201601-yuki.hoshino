import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KisoKadai3Out {
	String fileN;
	@SuppressWarnings("resource")
	void fileN(){
		System.out.println("ファイルを出力します。ファイル名を入力してください");
		this.fileN = new java.util.Scanner(System.in) .nextLine();
	}
	void out(){
		FileReader fileR = null;
		try{
			fileR = new FileReader("C:\\Users\\internous\\Documents\\" + this.fileN);
			System.out.println("C:\\Users\\internous\\Documents\\" + this.fileN + "を出力します");
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
