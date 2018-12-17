package door;

public class DoorClosing extends DoorState {
	private Door door;

	public DoorClosing(Door door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Closing";
	}

	@Override
	public void click() {
		door.stopTimer();
		door.setState(door.getOpeningState());
		door.startTimer(3000, event -> door.getState().complete());
	}

	@Override
	public void complete() {
		// TODO Auto-generated method stub
		door.setState(door.getClosedState());
	}

}
