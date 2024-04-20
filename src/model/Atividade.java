package model;

public class Atividade {
	private String assunto;
	private int paginasDissertacao;

	public Atividade(String assunto, int paginasDissertacao) {
		this.setAssunto(assunto);
		this.setPaginasDissertacao(paginasDissertacao);
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public int getPaginasDissertacao() {
		return paginasDissertacao;
	}

	public void setPaginasDissertacao(int paginasDissertacao) {
		this.paginasDissertacao = paginasDissertacao;
	}
}