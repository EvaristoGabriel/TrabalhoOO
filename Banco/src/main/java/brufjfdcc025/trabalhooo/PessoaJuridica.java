package brufjfdcc025.trabalhooo;

public class PessoaJuridica extends Cliente{
    
    private String cnpj;
    
    
    
    public PessoaJuridica(String cnpj, String telefone, String nome, String senha){
        super(senha,telefone, nome);
        this.cnpj= cnpj;
    }

    @Override
    public String getTipo() {
        return "J";    
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
