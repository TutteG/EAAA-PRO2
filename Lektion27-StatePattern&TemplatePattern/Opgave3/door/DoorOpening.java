package door;

public class DoorOpening extends DoorState {
	private Door door;

	public DoorOpening(Door door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Opening";
	}

	@Override
	public void click() {
		door.stopTimer();
		door.setState(door.getClosingState());
		door.startTimer(3000, event -> door.getState().complete());
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		door.setState(door.getOpenState());
		door.startTimer(3000, event -> door.getState().timeout());

	}
}
