package model;

public class Peixe extends Animal {
	private String caracteristica;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("mar");
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String caracteristica() {
		return caracteristica;
	}

	public void dados() {
		super.dados();
		System.out.println("Característica: " + caracteristica);
		System.out.println("-------------------------------");
	}
}