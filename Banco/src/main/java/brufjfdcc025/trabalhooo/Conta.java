/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Mari Richa
 */
public class Conta {
    Scanner teclado = new Scanner(System.in);
    
    private List <Extrato> extrato;
    private String numero;
    private float saldo;
    
    

    public Conta() {
        
        extrato = new ArrayList<>();
    }

    

    public String getNumero() {
        return numero;
    }

    

    public float getSaldo() {
        return saldo;
    }
    
    public void addExtrato(String tipo, float valor, Date data){
        extrato.add(new Extrato(tipo,valor,data));
        this.saldo+=valor;
    }
    
    public String imprimeExtrato(){
        String imprime="";
        for (Extrato e : extrato){
            imprime+="\n"+e;
            
        }
        imprime+="\n            Total: R$"+ this.saldo;
        return imprime;
    }
    
    public void setSaldo(float saldo) {
        this.saldo += saldo;
    }
    
   
    
    
    
    /*implementar funções:
  
    emprestimos
    
    */
    
    
}
