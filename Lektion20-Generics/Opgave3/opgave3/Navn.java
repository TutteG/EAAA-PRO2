package opgave3;

public class Navn implements Comparable<Navn> {
	private String fornavn;
	private String efternavn;

	public Navn(String fornavn, String efternavn) {
		this.fornavn = fornavn;
		this.efternavn = efternavn;
	}

	public String getEfternavn() {
		return efternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setEfternavn(String efternavn) {
		this.efternavn = efternavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	@Override
	public String toString() {
		return fornavn + " " + efternavn;
	}

	@Override
	public int compareTo(Navn o) {
		if (fornavn.compareTo(o.getFornavn()) == 0) {
			return efternavn.compareTo(o.efternavn);
		} else {
			return fornavn.compareTo(o.fornavn);
		}
	}
}
