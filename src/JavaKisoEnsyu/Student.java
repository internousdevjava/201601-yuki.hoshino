package JavaKisoEnsyu;

public class Student {
	String name;
	int kokugo;
	int sansu;
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
