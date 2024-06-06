package commandPattern;

public class TVDecreaseVolume implements Command{
	private TV tv= null;
	
	public TVDecreaseVolume(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.decreaseVolume();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.increaseVolume();
	}
}