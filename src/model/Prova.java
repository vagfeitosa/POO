package model;

public class Prova {
	private int numeroQuestoes;
	private double mediaNota;

	public Prova(int numeroQuestoes, double mediaNota) {
		this.setNumeroQuestoes(numeroQuestoes);
		this.setMediaNota(mediaNota);
	}

	public int getNumeroQuestoes() {
		return numeroQuestoes;
	}

	public void setNumeroQuestoes(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
	}

	public double getMediaNota() {
		return mediaNota;
	}

	public void setMediaNota(double mediaNota) {
		this.mediaNota = mediaNota;
	}
}