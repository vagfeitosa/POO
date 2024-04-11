package model;

public class Ingresso {
	 private String identificador;
	    private float valor;

	    public Ingresso(String identificador, float valor) {
	        this.identificador = identificador;
	        this.valor = valor;
	    }

	    public String getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(String identificador) {
	        this.identificador = identificador;
	    }

	    public float getValor() {
	        return valor;
	    }

	    public void setValor(float valor) {
	        this.valor = valor;
	    }

	    public float valorFinal(float taxaConveniencia) {
	        return valor + taxaConveniencia;
	    }
	}