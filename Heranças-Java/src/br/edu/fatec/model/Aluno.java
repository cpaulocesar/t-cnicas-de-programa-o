package br.edu.fatec.model;


public class Aluno {
	   private String nome;
	    private int idade;
	    private Disciplina disciplina; // Agregação
	    
	    public Aluno(String nome,int idade,Disciplina disc){
	    	this.idade = idade;
	    	this.nome = nome;
	    	this.disciplina = disc;
	    }  
	    
	    
		public Disciplina getDisciplinas() {
			return disciplina;
		}
		public void setDisciplinas(Disciplina disciplinas) {
			this.disciplina = disciplinas;
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
