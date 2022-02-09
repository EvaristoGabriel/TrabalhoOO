package brufjfdcc025.trabalhooo;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    
    public PessoaJuridica(String cnpj, String telefone, String nome, String senha, Endereco endereco) {
        super(senha,telefone, nome);//, endereco);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

}
