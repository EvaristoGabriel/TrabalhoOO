package brufjfdcc025.trabalhooo;

import java.util.Calendar;

public class Cartao {
    private String nomeTitular, numero, senha, cvv;
    private Calendar vencimento;
    
    public Cartao (){
        //funcao calendar para vencimento
        
        //random para cvv
        int a, b, c;
        a = (int)(Math.random()*10);
        b = (int)(Math.random()*10);
        c = (int)(Math.random()*10);
        this.cvv=Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCvv() {
        return cvv;
    }

    public Calendar getVencimento() {
        return vencimento;
    }
    
    
    
    
}
