import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double cashback = 0.0;

     
        if (idade >= 21) {
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.05; 
            } else {
                cashback = valorCompra * 0.07; 
            }
        } else {
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.07; 
            } else {
                cashback = valorCompra * 0.10; 
            }
        }

        
        System.out.printf("Cliente: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Cashback: R$ %.2f%n", cashback);


        scanner.close();
    }
}
 
