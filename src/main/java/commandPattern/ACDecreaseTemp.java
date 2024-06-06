package commandPattern;

public class ACDecreaseTemp implements Command{
	private AC ac;
	public ACDecreaseTemp(AC ac) {
		// TODO Auto-generated constructor stub
		this.ac= ac;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ac.decreaseTemp();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ac.increaseTemp();
	}

}