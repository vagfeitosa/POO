package view;

import java.util.Scanner;
import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ProvaController provaController = new ProvaController();
        AtividadeController atividadeController = new AtividadeController();

        boolean sair = false;
        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    testarProvas(provaController);
                    break;
                case 2:
                    testarAtividades(atividadeController);
                    break;
                case 3:
                    testarLimpeza(provaController, atividadeController);
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nSelecione uma opção:");
        System.out.println("1. Testar Provas");
        System.out.println("2. Testar Atividades");
        System.out.println("3. Testar Limpeza das Listas");
        System.out.println("4. Sair");
        System.out.print("Opção: ");
    }

    private static void testarProvas(ProvaController provaController) {
        provaController.cadastrarProva(new Prova(10, 8.5));
        provaController.cadastrarProva(new Prova(8, 7.2));

        System.out.println("\nProva 1: " + provaController.consultarProva(0));
        System.out.println("Prova 2: " + provaController.consultarProva(1));
    }

    private static void testarAtividades(AtividadeController atividadeController) {
        atividadeController.cadastrarAtividade(new Atividade("Java Programming", 5));
        atividadeController.cadastrarAtividade(new Atividade("Data Structures", 8));

        System.out.println("\nAtividade 1: " + atividadeController.consultarAtividade(0));
        System.out.println("Atividade 2: " + atividadeController.consultarAtividade(1));
    }

    private static void testarLimpeza(ProvaController provaController, AtividadeController atividadeController) {
        provaController.cadastrarProva(new Prova(10, 8.5));
        atividadeController.cadastrarAtividade(new Atividade("Java Programming", 5));

        provaController.limparListaDeProvas();
        atividadeController.limparListaDeAtividades();

        System.out.println("\nLista de provas está vazia: " + provaController.consultarProva(0));
        System.out.println("Lista de atividades está vazia: " + atividadeController.consultarAtividade(0));
    }
}