package commandPattern;

public class FanIncreaseSpeed implements Command{
	private CeilingFan f= null;
	
	public FanIncreaseSpeed(CeilingFan f) {
		// TODO Auto-generated constructor stub
		this.f = f;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		f.increaseSpeed();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		f.decreaseSpeed();
	}
}
