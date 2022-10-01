package Praticas;

public class Pratica05 {
    public static void main(String[] args) {
        double salario = 200;
        double resultado = 0;
        if (salario >= 1000){
            double mutadoCinquenta = salario * 0.5;
            resultado = salario + mutadoCinquenta;
            System.out.println("O cliente pagou acima de 1000 e foi mutado com 50%: " +mutadoCinquenta+ " Valor total: "+resultado);
            System.out.println(" Valor total: "+resultado);

        } else {
            double mutadoDez = salario * 0.1;
            resultado = salario + mutadoDez;
            System.out.println("Mutado apenas em 10%: "+resultado);
        }
    }
}
