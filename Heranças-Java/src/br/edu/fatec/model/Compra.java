package br.edu.fatec.model;

public class Compra {
	    private double valorTotal;
	    private Cupom cupom;

	    // Construtor
	    public Compra(double valorTotal, Cupom cupom) {
	        this.valorTotal = valorTotal;
	        this.cupom = cupom;
	    }

	    // Getters e setters
	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    public Cupom getCupom() {
	        return cupom;
	    }

	    public void setCupom(Cupom cupom) {
	        this.cupom = cupom;
	    }
	}
