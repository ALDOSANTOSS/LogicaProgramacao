package Praticas;

public class Pratica04 {
    public static void main(String[] args) {
        double salario = 2000;
        double resultado = 0;
        if (salario >= 4500) {
            resultado = salario * 0.3;
            System.out.println("30%");

        } else {
            resultado = salario * 0.15;
            System.out.println("15");

        }
        System.out.println("Valor final :" + resultado);


    }

}



