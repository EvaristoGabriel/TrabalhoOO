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
    private String tipo, numero, senha;
    private float saldo;
    private Cartao cartao;

    public Conta() {
        cartao = new Cartao();
        extrato = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getSenha() {
        return senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //funcionalidades do programa
    public void deposito (){
        float val;
        val=teclado.nextFloat();
        extrato.add(new Extrato("Depósito",val));
        val+=this.saldo;
        setSaldo(val);
        System.out.println("Depósito efetuado. Saldo atual: R$"+getSaldo());
        
    }
    
    public void getExtrato(){
        for (Extrato e:extrato)
            System.out.println(e.imprime());
    }
    
    public void saque(){
        float val=teclado.nextFloat();
        
        float val1=this.saldo-val;
        if(val1>=0.0){    
            setSaldo(val1);
            extrato.add(new Extrato("Saque",val));
            System.out.println("Saque efetuado. Saldo atual: R$"+getSaldo());
        }
        else
            System.out.println("Saldo insuficiente. Saldo atual: R$"+getSaldo());
        
    }
    
    public void transferencia(){
        String num; //numero da conta que vai ser transferido
        float val;
        num=teclado.next();
        val=teclado.nextFloat();
        //procurar na lista de clientes pelo numero da conta
    }
    
    
    
    
    
}
