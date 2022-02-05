package brufjfdcc025.trabalhooo;

public class PessoaFisica extends Pessoa{
    //nome, cpf, Endereço, nascimento
    private String cpf, nascimento,ocupacao,rg;

    public PessoaFisica(String cpf, String nascimento, String ocupacao, String rg, String telefone, String nome, Endereco endereco) {
        super(telefone, nome, endereco);
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.ocupacao = ocupacao;
        this.rg = rg;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
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
    
    
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nCpf: " + cpf + "\nNascimento: " + nascimento + "\nEndereco: " + this.getEndereco();
    }
    
    
}
