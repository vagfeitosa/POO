package model;

public class Conta {
	private int agencia;
	private int codigo;
	private float saldo;
	private float limite;

	public Conta() {
		super();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void Depositar(float deposito) {
		setSaldo(getSaldo() + deposito);
	}

	public void Sacar(float saque) throws RuntimeException {
		if ((getSaldo() + getLimite()) < saque) {
			throw new RuntimeException("ERRO Você não possui limite para saque");
		} else if (getSaldo() >= saque) {
			setSaldo(getSaldo() - saque);
		} else {
			setSaldo(getSaldo() - saque);
			setLimite(getLimite() - saque);
		}
	}
}