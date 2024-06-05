package decoratorPattern_2;

public class decoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea t= new Tea();
		Tea t2= new Tea();
		t.print();
		Mocha m = new Mocha(t);
		m.print();
		Whip w = new Whip(t);
		w.print();
		Whip w2 = new Whip(m);
		w2.print();
		Whip w3 = new Whip(t2);
		w3.print();
		
	}

}
