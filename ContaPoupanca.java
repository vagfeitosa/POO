package model;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
    
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(float taxaRendimento) {
        setSaldo(getSaldo() + getSaldo() * taxaRendimento);
        System.out.println("Novo saldo após rendimento: R$" + getSaldo());
    }
}