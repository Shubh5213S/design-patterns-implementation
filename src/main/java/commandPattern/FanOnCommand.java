package commandPattern;

public class FanOnCommand implements Command{
	private CeilingFan f;
	
	public FanOnCommand(CeilingFan f){
		// TODO Auto-generated constructor stub
		this.f= f;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		f.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		f.off();
	}
}

