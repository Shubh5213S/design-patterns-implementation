package decoratorPattern_1;

public class decoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea t=new Tea();
		Tea t2=new Tea();
		mocha m = new mocha();
		m.setCost(50);
	    System.out.println("The beverage is: "+t.getDesc()+" and cost is: "+ t.getCost()); 
		
		t.addExtension(m);
		t.print();
		t.addExtension(m);
		t.print();
		t.addExtension(new soy());
		t.print();
		t2.print();
	}

}