package model;

public class IngressoVip extends Ingresso{
	private String funcao;

    public IngressoVip(String identificador, float valor, String funcao) {
        super(identificador, valor);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public float valorFinal(float taxaConveniencia) {
        // Acrescenta 18% de taxa de conveniência para ingresso VIP
        return super.valorFinal(taxaConveniencia) * 1.18f;
    }
}