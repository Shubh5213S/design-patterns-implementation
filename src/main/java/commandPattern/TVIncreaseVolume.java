package commandPattern;

public class TVIncreaseVolume implements Command{
	private TV tv= null;
	
	public TVIncreaseVolume(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.increaseVolume();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.decreaseVolume();
	}
}