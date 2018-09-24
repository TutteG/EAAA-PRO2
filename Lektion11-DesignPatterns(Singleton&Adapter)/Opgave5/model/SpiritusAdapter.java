package model;

public class SpiritusAdapter extends Vare {
	private Spiritus spiritus;

	public SpiritusAdapter(Spiritus spiritus) {
		super(spiritus.getPrisen(), spiritus.getBetegnelse());
		this.spiritus = spiritus;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return spiritus.getPrisen();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return spiritus.getBetegnelse();
	}

	@Override
	public double beregnMoms() {
		// TODO Auto-generated method stub
		return spiritus.hentMoms();
	}
}
