package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.menu.Menu;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {
    private String senha;
    private String telefone, nome;
    private Endereco endereco;
    //private Scanner teclado = new Scanner(System.in);

    public Cliente(String senha, String telefone, String nome, Endereco endereco) {
        this.senha = senha;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    
//    Menu menu= new Menu();
//    public void menu (){
//        System.out.println("Menu\n1)Transferência\n2)Pagamento\n3)Depósito\n4)Pix\n5)Verificar Extrato\n6)Verificar Saldo\n7)Saque\n8)Empréstimo");
//        int x=teclado.nextInt();
//        switch(x){
//            case 1: 
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//            case 8:
//                break;
//        }
//    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public Conta getContac() {
//        return contac;
//    }
//
//    public void setContac(Conta contac) {
//        this.contac = contac;
//    }
//
//    public Conta getContap() {
//        return contap;
//    }
//
//    public void setContap(Conta contap) {
//        this.contap = contap;
//    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEndereco: " + this.endereco;
    }
    
    
}
