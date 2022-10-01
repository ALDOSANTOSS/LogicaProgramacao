package Praticas.Exarcicio01;

public class Contato {
    private String Nome;
    private String Endereco;
    private String Telefone;

    public Contato() {
    }

    public Contato(String nome, String endereco, String telefone) {
        this.Nome = nome;
        this.Endereco = endereco;
        this.Telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
