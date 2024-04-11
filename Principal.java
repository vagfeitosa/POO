package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ContaPoupanca poup1 = new ContaPoupanca();
	     ContaEspecial esp1 = new ContaEspecial();
	     
	     
	     poup1.depositar(500);
	     poup1.sacar(200);
	     poup1.calcularNovoSaldo(0.02f);

	     esp1.setLimite(100);
	     esp1.sacar(15);
	     esp1.sacar(300);


	}

}
