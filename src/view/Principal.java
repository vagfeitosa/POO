package view;

import controller.Circulo;

public class Principal {

	public static void main(String[] args) {
		
	Circulo circulo = new Circulo(5);
	
    double area = circulo.calcularArea();
    System.out.println("Área do círculo: " + area);

    double perimetro = circulo.calcularPerimetro();
    System.out.println("Perímetro do círculo: " + perimetro);
	}
}
