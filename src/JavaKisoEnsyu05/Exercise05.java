package JavaKisoEnsyu05;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Employee[] e = new Employee[5];
		e[0] = new Employee("織田信二",77,82);
	    e[1] = new Employee("小松里奈",40,97);
	    e[2] = new Employee("鈴木千佳",90,49);
	    e[3] = new Employee("筑井喜一",75,81);
	    e[4] = new Employee("野並由佳",71,72);

    	System.out.println("---------------------------\n社員名簿システム\n---------------------------");
	    for(int i=0; i < e.length; i++){
	    	e[i].display();
	    	System.out.println("---------------------------");
	    }

	    e[0].showTotalNumber();
	}
}
