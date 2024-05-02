package br.edu.fatec.main;
import br.edu.fatec.model.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = scanner.nextLine();
        System.out.println("Digite a carga horária da disciplina:");
        int cargaHorariaDisciplina = scanner.nextInt();
        scanner.nextLine();

        Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHorariaDisciplina);

        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();
        System.out.println("Digite a idade do aluno:");
        int idadeAluno = scanner.nextInt();
        scanner.nextLine();

        Aluno aluno = new Aluno(nomeAluno, idadeAluno, disciplina);

        // Exibir informações do aluno e da disciplina
        System.out.println("Informações do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Disciplina ------");
        System.out.println("Nome: " + aluno.getDisciplinas().getNome());
        System.out.println("Carga Horária: " + aluno.getDisciplinas().getCargaHoraria());
        
        
        
        System.out.println("Digite o nome da pessoa:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a rua do endereço:");
        String ruaEndereco = scanner.nextLine();
        System.out.println("Digite a cidade do endereço:");
        String cidadeEndereco = scanner.nextLine();
        System.out.println("Digite o CEP do endereço:");
        String cepEndereco = scanner.nextLine();
        
        Endereco endereco = new Endereco(ruaEndereco, cidadeEndereco, cepEndereco);
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa, endereco);

        // Exibir informações da pessoa e do endereço
        System.out.println("Informações da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço ------");
        System.out.println("Rua: " + pessoa.getEndereco().getRua());
        System.out.println("Cidade: " + pessoa.getEndereco().getCidade());
        System.out.println("CEP: " + pessoa.getEndereco().getCep());
        
        System.out.println("Digite o valor total da compra:");
        double valorTotalCompra = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o código do cupom:");
        String codigoCupom = scanner.nextLine();
        System.out.println("Digite o desconto do cupom:");
        double descontoCupom = scanner.nextDouble();
        
        Cupom cupom = new Cupom(codigoCupom, descontoCupom);
        Compra compra = new Compra(valorTotalCompra, cupom);

        // Exibir informações da compra e do cupom
        System.out.println("Informações da compra:");
        System.out.println("Valor Total: " + compra.getValorTotal());
        System.out.println("Cupom ------");
        System.out.println("Código: " + compra.getCupom().getCodigo());
        System.out.println("Desconto: " + compra.getCupom().getDesconto() + "%");


        scanner.close();
	}

}
