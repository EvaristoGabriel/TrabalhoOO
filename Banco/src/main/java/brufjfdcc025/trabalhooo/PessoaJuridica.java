package brufjfdcc025.trabalhooo;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String cnpj, String telefone, String nome, Endereco endereco) {
        super(telefone, nome, endereco);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

}
