package view;

import model.Conta;

public class Principal {

	public static void main(String[] args) {

		Conta c1 = new Conta();

		c1.setAgencia(1);
		c1.setCodigo(1);
		c1.setLimite(1000f);
		c1.setSaldo(0);

		c1.Depositar(500);
		System.out.println("Saldo apos deposito " + c1.getSaldo());

		c1.Sacar(500);
		System.out.println("Saldo apos saque " + c1.getSaldo());

		try {
			c1.Sacar(1000);
			System.out.println("Saldo apos saque " + c1.getSaldo());
		} catch (RuntimeException e) {
			System.err.println(e);
			System.out.println("Seu limite é de: " + c1.getLimite());
		}

		try {
			c1.Sacar(100);
			System.out.println("Saldo apos saque " + c1.getSaldo());
		} catch (RuntimeException e) {
			System.err.println(e);
			System.out.println("Seu saldo é de: " + c1.getSaldo());
			System.out.println("Seu limite é de: " + c1.getLimite());
		}

	}

}
