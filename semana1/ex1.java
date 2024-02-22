import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número: ");
        num = ler.nextDouble();
        if (num > 0) {
            System.out.println("Número Positivo!");
        } else if(num < 0) {
            System.out.println("Número Negativo!");
        } else{
            System.out.println("Zero");
        }
        ler.close();
    }
}
