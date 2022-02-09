package brufjfdcc025.trabalhooo;

public class PessoaJuridica extends Cliente{
    
    public PessoaJuridica(String cnpj, String telefone, String nome, String senha){//), Endereco endereco) {
        super(senha,telefone, nome);//, endereco);
        this.setCpfcnpj(cnpj);
    }
}
