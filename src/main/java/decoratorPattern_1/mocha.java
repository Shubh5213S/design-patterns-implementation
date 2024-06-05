package decoratorPattern_1;

public class mocha implements Extensions{
	private int cost = 20;
	private String Desc="Mocha";
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
}
