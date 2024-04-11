package model;

public class ContaBancaria {
	
	private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria() {
       
    }

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	 public void sacar(float valor) {
	        if (valor > saldo) {
	            System.out.println("Saldo insuficiente.");
	        } else {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	        }
	    }

	    public void depositar(float valor) {
	        saldo += valor;
	        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	    }

}
