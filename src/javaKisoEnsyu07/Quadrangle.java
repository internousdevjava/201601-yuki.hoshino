package javaKisoEnsyu07;

public class Quadrangle extends Figure{
	public Quadrangle(){
		super(9,15);
	}

	public void show(){
		System.out.println("四角形のデータ");
		super.show();
		super.getArea();
	}

	public double gerArea(){
		return 9 * 15;
	}
}
