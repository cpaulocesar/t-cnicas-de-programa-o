package br.edu.fatec.model;

public class Disciplina {
	   private String nome;
	    private int cargaHoraria;
	    
	    public Disciplina(String nome,int cargaHr){
	    	this.nome =  nome;
	    	this.cargaHoraria = cargaHr;
	    }
	    
	    
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCargaHoraria() {
			return cargaHoraria;
		}
		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}
}
