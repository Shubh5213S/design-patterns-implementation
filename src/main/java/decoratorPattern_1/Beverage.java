package decoratorPattern_1;

public interface Beverage {
	public String getDesc();
	
	public int getCost();

	public void addExtension(Extensions e);
	public void print();
}
