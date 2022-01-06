/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo;

/**
 *
 * @author Mari Richa
 */
public class PessoaJuridica {
    private String cnpj;
    private Endereco endereco;

    public PessoaJuridica() {
        endereco = new Endereco();
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(String rua, String bairro, String cep, int numero, int complemento) {
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
    
    
    
    
            
}
