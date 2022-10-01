import java.util.Scanner;

public class CalcularPorcentagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario");
        float salario = scanner.nextFloat();
        float porcentagem = 30;
        float resultado = salario * porcentagem / 100;
        System.out.printf("Resultado: " + resultado);
    }
}
