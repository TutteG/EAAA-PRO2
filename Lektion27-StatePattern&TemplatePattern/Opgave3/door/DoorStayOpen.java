package door;

public class DoorStayOpen extends DoorState {
	private Door door;

	public DoorStayOpen(Door door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Stay open";
	}

	@Override
	public void click() {
		door.setState(door.getClosingState());
		door.startTimer(3000, event -> door.getState().complete());
	}
}
