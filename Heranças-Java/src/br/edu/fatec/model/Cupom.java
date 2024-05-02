package br.edu.fatec.model;

public class Cupom {
    private String codigo;
    private double desconto;

    // Construtor
    public Cupom(String codigo, double desconto) {
        this.codigo = codigo;
        this.desconto = desconto;
    }

    // Getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}

