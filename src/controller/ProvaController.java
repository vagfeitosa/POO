package controller;
import java.util.ArrayList;
import java.util.List;
import model.Prova;

public class ProvaController {
	private List<Prova> provas;

	public ProvaController() {
		this.provas = new ArrayList<>();
	}

	public void cadastrarProva(Prova prova) {
		provas.add(prova);
	}

	public Prova consultarProva(int posicao) {
		if (posicao >= 0 && posicao < provas.size()) {
			return provas.get(posicao);
		}
		return null;
	}

	public void limparListaDeProvas() {
		provas.clear();
	}
}
