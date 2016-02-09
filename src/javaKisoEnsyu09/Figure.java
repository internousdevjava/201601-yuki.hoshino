package javaKisoEnsyu09;

public class Figure {
	private int base;
	private int height;

	public Figure(int base,int height){
		this.base = base;
		this.height = height;
	}
	public void show(){
		System.out.println("底辺:" + this.base + " cm");
		System.out.println("高さ:" + this.height + " cm");
		System.out.println("面積:" +(double)(this.base * this.height) + "平方cm");
	}
	public double getArea(){
		return 0.0;
	}
	public void setBase(int base){
		if(base > 0){
			this.base = base;
		}
	}
	public void setHeight(int height){
		if(height > 0){
			this.height = height;
		}
	}
	public int getBase(){
		return this.base;
	}
	public int getHeight(){
		return this.height;
	}
}
