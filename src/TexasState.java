
public class TexasState implements State {
	transient StateMachine stateMachine;
	
	public TexasState(StateMachine stateMachine) {
		// TODO Auto-generated constructor stub
		this.stateMachine = stateMachine;
	}
	@Override
	public void increasetemperature() {
		// TODO Auto-generated method stub
		System.out.println("It's feeling like Florida in Texas...");
		stateMachine.setisHot(true);
		stateMachine.reevaluateState();
	}

	@Override
	public void increaselandsize() {
		// TODO Auto-generated method stub
		System.out.println("You made Texas even bigger!!!");
	}

	@Override
	public void inserttraffic() {
		// TODO Auto-generated method stub
		System.out.println("You increased Texas traffic...");
		stateMachine.sethasTraffic(true);
		stateMachine.reevaluateState();
	}

	@Override
	public void decreasetemperature() {
		// TODO Auto-generated method stub
		System.out.println("You made Texas a little cooler...");
	}

	@Override
	public void decreaselandsize() {
		// TODO Auto-generated method stub
		System.out.println("You decreased the land size of Texas");
		stateMachine.setisBig(false);
		stateMachine.reevaluateState();
	}

	@Override
	public void decreasetraffic() {
		// TODO Auto-generated method stub
		System.out.println("You made less traffic in Texas!");
	}

	public String toString() {
		return "Guess we are in Texas Now...";
	}
}
