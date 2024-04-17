package controller;

public class OperacaoController {

	private int numero;

	public OperacaoController() {
		super();
	}

	public int getValor() {
		return numero;
	}

	public void setValor(int numero) {
		this.numero = numero;
	}

	public void operacaoValor(int numero1) throws RuntimeException {
		if (numero1 < 0) {
			throw new RuntimeException("Erro numero negativo");
		} else if (numero1 % 2 == 0) {
			setValor(numero1 * numero1);

		} else {
			setValor(numero1 * numero1 * numero1);

		}
	}
}
