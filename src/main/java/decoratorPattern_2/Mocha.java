package decoratorPattern_2;

public class Mocha extends Beverage{
	
	Mocha(Beverage b){
		this.cost =b.getCost() + 10;
		this.desc= b.getDesc()+" " + "with Mocha";
	}

}
