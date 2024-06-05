package decoratorPattern_2;

public abstract class Beverage {
	protected String desc;
	protected int cost;
	
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc=desc;
	}
	
	public void print() {
		System.out.println("The beverage is: "+desc+" and cost is: "+ cost); 
	}
}
