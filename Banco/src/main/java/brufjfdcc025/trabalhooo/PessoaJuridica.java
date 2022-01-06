package brufjfdcc025.trabalhooo;

public class PessoaJuridica {
    private String cnpj, nome;
    private Endereco endereco;

    public PessoaJuridica() {
        endereco = new Endereco();
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(String cidade, String rua, String bairro, String cep, int numero, int complemento) {
        this.endereco.setCidade(cidade);
        this.endereco.setRua(rua);
        this.endereco.setBairro(bairro);
        this.endereco.setCep(cep);
        this.endereco.setNumero(numero);
        this.endereco.setComplemento(complemento);
    }

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
