package JavaKisoEnsyu02;

public class Student {
	String name;
	int kokugo;
	int sansu;

	public  Student(String name){
		this.name = name;
		this.kokugo = 0;
		this.sansu = 0;
		System.out.println("氏名："+ name + "\n国語："+ kokugo + "\n算数：" + sansu);
	}
	public Student(String name,int kokugo,int sansu){
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
		System.out.println("氏名："+ name + "\n国語："+ kokugo + "\n算数：" + sansu);
	}
	public void getName(){
		return;
	}
	public void getKokugo(){
		return;
	}
	public void getSansu(){
		return;
	}
	public void setName(String n){
		this.name = n;
		System.out.println("氏名：" + n);
	}
	public void setKokugo(int k){
		this.kokugo = k;
		System.out.println("国語：" + k);
	}
	public void setSansu(int s){
		this.sansu = s;
		System.out.println("算数：" + s);
	}
}
