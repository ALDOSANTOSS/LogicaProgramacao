package Praticas;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        System.out.println(Math.max(valor1,valor2));
        System.out.println(Math.min(valor1,valor2));


    }
}

