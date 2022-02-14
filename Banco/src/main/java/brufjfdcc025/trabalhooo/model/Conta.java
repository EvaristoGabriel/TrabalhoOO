package brufjfdcc025.trabalhooo.model;
import java.util.Scanner;
import java.util.*;

public class Conta {
    Scanner teclado = new Scanner(System.in);
    
    private List <Extrato> extrato;
    private String numero;
    private float saldo;

    public Conta() {
        saldo=0;
        extrato = new ArrayList<>();
        
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero=numero;
    }


    public float getSaldo() {
        return saldo;
    }

    public List<Extrato> getExtrato() {
        return extrato;
    }
    
    public void addExtrato(String tipo, float valor, Date data){ //usar sempre esse ao inves do set
        extrato.add(new Extrato(tipo,valor,data));
        this.saldo+=valor; //ja adiciona o valor ao saldo
    }
    
//    public String imprimeExtrato(){
//        String imprime="";
//        for (Extrato e : extrato){
//            imprime+="\n"+e;
//            
//        }
//        imprime+="\n            Total: R$"+ this.saldo;
//        return imprime;
//    }
    
//    public void setSaldo(float saldo) {
//        this.saldo += saldo;
//    }

    @Override
    public String toString() {
        return "\n  Numero: " + numero + "\n Saldo: " + saldo;
    }
    
    
    
}
