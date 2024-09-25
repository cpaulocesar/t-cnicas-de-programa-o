package br.edu.fatecpg.apigemini.service;

import java.io.FileWriter;
import java.io.IOException;

public class ManipulaDocumento {
    public void salvaArquivo(String texto){
        try {
            FileWriter escrita = new FileWriter("resumos.txt", true);
            escrita.write(System.lineSeparator());
            escrita.write(texto);
            escrita.close();
            System.out.println("texto salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o texto.");
            e.printStackTrace();
        }
    }
}
