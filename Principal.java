package view;
import model.Paralelogramo;
import model.Trapezio;
import model.Quadrilatero;
 
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paralelogramo paralelogramo = new Paralelogramo(5, 3);       
		System.out.println("Área do Paralelogramo: " + paralelogramo.calcArea());        
		System.out.println("Perímetro do Paralelogramo: " + paralelogramo.calcPerimetro());

		Trapezio trapezio = new Trapezio(6, 4, 3);       
		System.out.println("Área do Trapézio: " + trapezio.calcArea());      
		System.out.println("Perímetro do Trapézio: " + trapezio.calcPerimetro());
		   
	}
		
}

