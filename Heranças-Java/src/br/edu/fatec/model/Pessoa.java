package br.edu.fatec.model;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;
    
    public Pessoa(String nome,int idade,Endereco endereco){
    	this.nome = nome;
    	this.idade = idade;
    	this.endereco = endereco;
    }
    
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
