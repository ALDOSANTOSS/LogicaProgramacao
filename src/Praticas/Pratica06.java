package Praticas;

import java.util.Scanner;

public class Pratica06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if ((numero % 2 )==0){
            System.out.println("Par: "+ (numero % 2));
        } else {
            System.out.println("Impar: "+(numero % 2));
        }
    }
}
