package view;
import model.ProfessorHorista;
import model.ProfessorTitular;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorHorista hor1 = new ProfessorHorista();
		ProfessorTitular tit1 = new ProfessorTitular();
		
		hor1.setNome("Vagner");
		hor1.setMatricula("123456");
		hor1.setIdade(33);
		hor1.setHorasAula(180);
		hor1.setValorHoraAula(36);
		
		System.out.println("Professor: " + hor1.getNome());
		hor1.calcSalario();
		System.out.println("-----------------------" + "\n");
		
		tit1.setNome("Gabrielly");
		tit1.setMatricula("22222");
		tit1.setIdade(28);
		tit1.setAnosinstituicao(5);
		tit1.setSalario(5400);
		
		System.out.println("Professor: " + tit1.getNome());
		tit1.calcSalario();
	}
}