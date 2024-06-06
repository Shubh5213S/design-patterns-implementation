package commandPattern;

public class ACOnCommand implements Command{
	private AC ac;
	
	public ACOnCommand(AC ac) {
		// TODO Auto-generated constructor stub
		this.ac = ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.off();
	}
	
}
