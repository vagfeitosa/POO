package model;

public class ProfessorTitular extends Professor {
	private int anosinstituicao;
	private double salario;
	
	public int getAnosinstituicao() {
		return anosinstituicao;
	}
	public void setAnosinstituicao(int anosinstituicao) {
		this.anosinstituicao = anosinstituicao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void calcSalario() {
		salario = getSalario() * ((getAnosinstituicao() /5)*1.05);
		System.out.println("Salario " + salario);		
	}
}
