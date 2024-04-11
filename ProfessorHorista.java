package model;

public class ProfessorHorista extends Professor {
	private int horasAula;
	private double valorHoraAula;
	
	public ProfessorHorista() {
		
	}
	
	public int getHorasAula() {
		return horasAula;
	}
	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}
	public double getValorHoraAula() {
		return valorHoraAula;
	}
	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	public void calcSalario() {
		double salario = getValorHoraAula() * getHorasAula();
		System.out.println("Salario " + salario);		
	}
	
}