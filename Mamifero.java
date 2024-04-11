package model;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero() {
		super();
		this.setAmbiente("terra");
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String alimento() {
		return alimento;
	}

	public void dados() {
		super.dados();
		System.out.println("Alimento: " + alimento);
		System.out.println("-------------------------------");
	}
}