package brufjfdcc025.trabalhooo;

public abstract class Pessoa {
    private String telefone, nome;
    private Endereco endereco;

    public Pessoa(String telefone, String nome, Endereco endereco) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
