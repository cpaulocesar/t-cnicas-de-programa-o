import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) throws Exception {
        String[] nomes = new String[5];
        String nome;
        boolean flag = false;
        int c = 0;
        Scanner scan = new Scanner(System.in);
        while (c < nomes.length) {
            System.out.println("Entre com o nome: ");
            nomes[c] = scan.nextLine();
            c++;
        }
        System.out.println("Entre com o valor comparativo: ");
        nome = scan.nextLine();
        for(int i =0; i < nomes.length; i++) {
            if(nomes[i].equals(nome)){
                flag = true;
            }
        }
            if (flag == true) {
                System.out.println("Nome encontrado");
            }else{
                System.out.println("Nome não encontrado");
            }
            scan.close();
        
    }
}
