package Praticas.Exarcicio01;

public class Test {
    public static void main(String[] args) {
        Contato c1 = new Contato();
        c1.setNome("Aldo");
        c1.setEndereco("Joao Durval");
        c1.setTelefone("43243234232");
        System.out.println(c1.getNome());
        System.out.println(c1.getEndereco());
        System.out.println(c1.getTelefone());
    }
}
