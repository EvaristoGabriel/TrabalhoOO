package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.menu.Menu;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {
    String senha;
    PessoaFisica pessoaf;
    PessoaJuridica pessoaj;
    private Conta contac, contap;
    Scanner teclado = new Scanner(System.in);

    public Cliente(String nome, String cpf, String nascimento, String ocupacao, String rg, String telefone, Endereco end) {
        pessoaf = new PessoaFisica(cpf, nascimento, ocupacao, rg, telefone, nome, end);
    }
    
    
    Menu menu= new Menu();
    public void menu (){
        System.out.println("Menu\n1)Transferência\n2)Pagamento\n3)Depósito\n4)Pix\n5)Verificar Extrato\n6)Verificar Saldo\n7)Saque\n8)Empréstimo");
        int x=teclado.nextInt();
        switch(x){
            case 1: 
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
