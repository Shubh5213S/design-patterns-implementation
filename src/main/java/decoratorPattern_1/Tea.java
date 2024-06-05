package decoratorPattern_1;

public class Tea implements Beverage {
	private String description="Tea";
	private int cost= 20;
	
	public void setCost(int c) {
		// TODO Auto-generated method stub
		this.cost=c;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
	@Override
	public void addExtension(Extensions e) {
		cost += e.getCost();
		description+=" with "+e.getDesc();
	}
	@Override
	public void print() {
		System.out.println("The beverage is: "+description+" and cost is: "+ cost); 
	}
	
}
