package view;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}

	public static void metodo2() {
		System.out.println("Inicio do método 2");
		try {
			int[] vetor = new int[10];
			for (int i = 0; i <= 15; i++) {
				vetor[i] = i;
				System.out.println(i);
				if (i == 9) {
					int vlr = vetor[i] / vetor[0];
					System.out.println(vlr);
				}
			}
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.err.println("ERRO " + e.getMessage());
		}
		System.out.println("Fim do método 2");
	}
}