package decoratorPattern_1;

public class soy implements Extensions{
		private int cost = 20;
		private String Desc="Soy";
		
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
