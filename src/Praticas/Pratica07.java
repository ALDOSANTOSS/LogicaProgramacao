package Praticas;

public class Pratica07 {
    public static void main(String[] args) {
        int velocidade = 100;
        int mutado = 0;
        int resultado = velocidade + mutado;

        if (velocidade > 80){
            mutado = (int) (velocidade * 0.5);

            System.out.println("Carro mutado"+resultado);

        }else {
            System.out.println("Na media");
        }
    }
}
