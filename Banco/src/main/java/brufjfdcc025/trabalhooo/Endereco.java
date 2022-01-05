package brufjfdcc025.trabalhooo;

public class Endereco {
    //rua, bairro, numero, cep, complemento
    private String rua, bairro, cep;
    private int numero, complemento;

    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getComplemento() {
        return complemento;
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + "\nBairro: " + bairro + "\nCep: " + cep + "\nNumero: " + numero + "\nComplemento: " + complemento;
    }
    
    
}
