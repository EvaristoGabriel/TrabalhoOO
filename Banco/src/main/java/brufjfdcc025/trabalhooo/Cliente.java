package brufjfdcc025.trabalhooo;

public abstract class Cliente {
    private String senha;
    private String telefone, nome, cpfcnpj;
    private Endereco endereco;

    public Cliente(String senha, String telefone, String nome) {
        this.senha = senha;
        this.telefone = telefone;
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public Conta getContac() {
//        return contac;
//    }
//
//    public void setContac(Conta contac) {
//        this.contac = contac;
//    }
//
//    public Conta getContap() {
//        return contap;
//    }
//
//    public void setContap(Conta contap) {
//        this.contap = contap;
//    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
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
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEndereco: " + this.endereco;
    }
    
    
}
