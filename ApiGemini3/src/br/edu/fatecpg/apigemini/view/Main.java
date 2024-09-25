package br.edu.fatecpg.apigemini.view;
import br.edu.fatecpg.apigemini.service.ConsomeApi;
import br.edu.fatecpg.apigemini.service.ManipulaDocumento;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static br.edu.fatecpg.apigemini.service.ConsomeApi.fazerPergunta;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        ManipulaDocumento doc = new ManipulaDocumento();
        boolean flag = false;
        while (!flag) {
            System.out.println("Menu:");
            System.out.println("1. Fazer uma pergunta");
            System.out.println("2. Multiplas perguntas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scan.nextInt();
            scan.nextLine();
            switch (escolha) {
                case 1:
                    System.out.print("Digite sua pergunta: ");
                    String pergunta = scan.nextLine();
                    String resposta = fazerPergunta(pergunta);
                    System.out.println(resposta);
                    break;
                case 2:
                    int quantasPerguntas;
                    do {
                        System.out.print("Quantas perguntas serão? ");
                        quantasPerguntas = scan.nextInt();
                        scan.nextLine();
                    } while (quantasPerguntas < 3);

                    ArrayList<String> perguntas = new ArrayList<>();
                    for (int c = 0; c < quantasPerguntas; c++) {
                        System.out.println("Digite a " + (c + 1) + "° pergunta:");
                        pergunta = scan.nextLine();
                        perguntas.add(pergunta);
                    }
                    resposta = fazerPergunta("não use carateres especiais! resuma as respostas dessas três perguntas em um texto: "+ String.valueOf(perguntas));
                    System.out.println(resposta);
                    doc.salvaArquivo(resposta);
                    break;
                case 3:
                    flag = true;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scan.close();
    }
    }

