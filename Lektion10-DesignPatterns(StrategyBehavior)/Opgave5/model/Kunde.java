package model;

import java.util.ArrayList;

public class Kunde {
	private String navn;
	private ArrayList<Bogtitel> bogtitels;

	public Kunde(String navn) {
		// TODO Auto-generated constructor stub
		this.navn = navn;
		this.bogtitels = new ArrayList<>();
	}

	public String getNavn() {
		return navn;
	}

	public void addBogtitel(Bogtitel bogtitel) {
		bogtitels.add(bogtitel);
	}

	public ArrayList<Bogtitel> getBogtitels() {
		return bogtitels;
	}
}
