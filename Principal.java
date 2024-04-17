package view;

import controller.OperacaoController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		OperacaoController num = new OperacaoController();

		String input = JOptionPane.showInputDialog("Digite um número:");

		try {
			num.operacaoValor(Integer.parseInt(input));
			System.out.println("numero " + num.getValor());
		}catch (NumberFormatException e) {
			System.err.println(e);
			System.out.println("deve ser digitado um numero");
		} catch (RuntimeException f) {
			System.err.println(f);
			System.out.println("O numero deve ser positivo");
		}
	}
}
