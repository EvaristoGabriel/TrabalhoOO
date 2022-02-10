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
    
    
    //funcionalidades do programa
    
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
   
    
    
    
    /*implementar funções:
    criar cartao
    renovar cartao
    emprestimos
    
    */
    
    
}
