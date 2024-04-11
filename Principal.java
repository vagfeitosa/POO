package view;
import model.Ingresso;
import model.IngressoVip;

public class Principal {
	public static void main(String[] args) {
      
        Ingresso ingressoComum = new Ingresso("001", 50.0f);
        System.out.println("Ingresso Comum:");
        System.out.println("Identificador: " + ingressoComum.getIdentificador());
        System.out.println("Valor: R$" + ingressoComum.getValor());
        System.out.println("Valor final com taxa de conveniência (10%): R$" + ingressoComum.valorFinal(10.0f));

        IngressoVip ingressoVip = new IngressoVip("002", 100.0f, "VIP Gold");
        System.out.println("\nIngresso VIP:");
        System.out.println("Identificador: " + ingressoVip.getIdentificador());
        System.out.println("Função: " + ingressoVip.getFuncao());
        System.out.println("Valor: R$" + ingressoVip.getValor());
        System.out.println("Valor final com taxa de conveniência (15%): R$" + ingressoVip.valorFinal(15.0f));
    }
}