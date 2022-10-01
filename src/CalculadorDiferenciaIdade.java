import java.util.Scanner;

public class CalculadorDiferenciaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira idade :");
        int idade01 = scanner.nextInt();
        System.out.println("Digite a segunda idade :");
        int idade02 = scanner.nextInt();
        int idade03 = idade01 - idade02;
        System.out.println("Resultado da diferencia de idade :" + idade03);
    }
}
