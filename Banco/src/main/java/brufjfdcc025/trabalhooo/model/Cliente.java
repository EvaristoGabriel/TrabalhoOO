package brufjfdcc025.trabalhooo.model;

public abstract class Cliente {
    private String senha;
    private String telefone, nome;
    private Endereco endereco;
    private Conta conta;
    
    

    public Cliente(String senha, String telefone, String nome) {
        this.senha = senha;
        this.telefone = telefone;
        this.nome = nome;
        this.conta = new Conta();
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
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

    @Override
    public String toString() {
        return this.nome ;
    }
    
    public abstract String getTipo();
}
