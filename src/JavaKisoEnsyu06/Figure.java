package JavaKisoEnsyu06;

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
	}
	public double getArea(){
		return (double)(this.base * this.height);
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
