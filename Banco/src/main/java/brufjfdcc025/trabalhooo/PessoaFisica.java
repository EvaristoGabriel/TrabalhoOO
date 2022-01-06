package brufjfdcc025.trabalhooo;

public class PessoaFisica{
    //nome, cpf, Endereço, nascimento
    private String nome, cpf, nascimento,ocupacao,telefone,rg;
    private Endereco endereco;

    public PessoaFisica() {
        this.endereco = new Endereco();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String cidade, String rua, String bairro, String cep, int numero, int complemento) {
        this.endereco.setCidade(cidade);
        this.endereco.setRua(rua);
        this.endereco.setBairro(bairro);
        this.endereco.setCep(cep);
        this.endereco.setNumero(numero);
        this.endereco.setComplemento(complemento);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCpf: " + cpf + "\nNascimento: " + nascimento + "\nEndereco: " + endereco;
    }
    
    
}
