package door;

public class DoorOpen extends DoorState {
	private Door door;

	public DoorOpen(Door door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Open";
	}

	@Override
	public void click() {
		door.stopTimer();
		door.setState(door.getStayOpenState());
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		door.setState(door.getClosingState());
		door.startTimer(3000, event -> door.getState().complete());
	}
}
