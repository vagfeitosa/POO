package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class Principal {
	public static void main(String[] args) {

		Animal camelo = new Animal();
		camelo.alteraNome("Camelo");
		camelo.alteraComprimento(150);
		camelo.alteraCor("Amarelo");
		camelo.alteraVelocidade(2.0f);

		Peixe tubarao = new Peixe();
		tubarao.alteraNome("Tubarão");
		tubarao.alteraComprimento(300);
		tubarao.alteraCor("Cinzento");
		tubarao.alteraVelocidade(1.5f);
		tubarao.alteraCaracteristica("Barbatanas e cauda");

		Mamifero urso = new Mamifero();
		urso.alteraNome("Urso-do-canadá");
		urso.alteraComprimento(180);
		urso.alteraCor("Vermelho");
		urso.alteraVelocidade(0.5f);
		urso.alteraAlimento("Mel");

		System.out.println("Zoo:");
		System.out.println("-------------------------------");
		camelo.dados();
		tubarao.dados();
		urso.dados();
	}
}