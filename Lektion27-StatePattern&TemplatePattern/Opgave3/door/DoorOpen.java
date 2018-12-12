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
		door.setState(door.getStayOpenState());
		door.startTimer(100, event -> door.getState());
	}

	@Override
	public void timeout() {
		// TODO Auto-generated method stub
		door.setState(door.getClosingState());
		door.startTimer(3000, event -> door.getState().complete());
	}
}
