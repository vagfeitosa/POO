package model;

public class ContaEspecial extends ContaBancaria {
	
    private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
    
    @Override
    public void sacar(float valor) {
        if (valor > getSaldo() + limite) {
            System.out.println("Limite de saque excedido.");
        } else {
        	setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}
