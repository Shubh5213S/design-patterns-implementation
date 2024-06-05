package decoratorPattern_2;

public class Whip extends Beverage{
		
		Whip(Beverage b){
			this.cost =b.getCost() + 50;
			this.desc= b.getDesc()+" " + "with Whip";
		}

}
