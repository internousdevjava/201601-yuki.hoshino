package javaKisoEnsyu09;

public class Triangle extends Figure{
	@SuppressWarnings("unused")
	private final double HALF = 2.0;
	public Triangle(int b, int h){
		super(b, h);
	}
	public void show(){
		System.out.println("三角形のデータ");
		super.show();
		super.getArea();
	}
	public double getArea(){
		return super.getArea() / 2.0;
	}
}
