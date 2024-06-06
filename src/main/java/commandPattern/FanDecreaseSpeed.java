package commandPattern;

public class FanDecreaseSpeed implements Command{
	private CeilingFan f= null;
	
	public FanDecreaseSpeed(CeilingFan f) {
		// TODO Auto-generated constructor stub
		this.f = f;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		f.decreaseSpeed();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		f.increaseSpeed();
	}
}
