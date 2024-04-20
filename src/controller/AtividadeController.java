package controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Atividade;

public class AtividadeController {
	private List<Atividade> atividades;
	private Random random;

	public AtividadeController() {
		this.atividades = new ArrayList<>();
		this.random = new Random();
	}

	public void cadastrarAtividade(Atividade atividade) {
		atividades.add(atividade);
	}

	public Atividade consultarAtividade(int posicao) {
		if (posicao >= 0 && posicao < atividades.size()) {
			return atividades.get(posicao);
		}
		return null;
	}

	public void limparListaDeAtividades() {
		atividades.clear();
	}

	public double gerarNumeroAleatorio() {
		return random.nextDouble() * 10;
	}

}
