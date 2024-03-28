package view;

import controller.ContaBancaria;

public class Principal {
	// Método main para criar um objeto ContaBancaria e realizar os testes
    public static void main(String[] args) {
        // Criando uma conta bancária com número 123, titular "Fulano" e saldo inicial de R$1000
        ContaBancaria conta = new ContaBancaria(123, "Vagner", 1000);

        // Realizando um depósito de R$500
        conta.depositar(500);

        // Realizando um saque de R$200
        conta.sacar(200);

        // Verificando o saldo atual da conta
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}