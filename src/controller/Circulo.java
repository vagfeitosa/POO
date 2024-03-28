package controller;

public class Circulo {
	
    double raio;
    
    public Circulo(double i) {

	}

	public double calcularArea() {
        return 3.14 * Math.pow(raio, 2);
    }
    
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}