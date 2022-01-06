package brufjfdcc025.trabalhooo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {
    String senha;
    PessoaFisica pessoaf;
    PessoaJuridica pessoaj;
    private Conta contac, contap;
    Scanner teclado = new Scanner(System.in);
//
    public Cliente(int opc) {
       if (opc==1)
           pessoaf=new PessoaFisica();
       else
           pessoaj= new PessoaJuridica();
       
    }
    
    
    
    public void menu (){
        System.out.println("Menu\n1)Transferência\n2)Pagamento\n3)Depósito\n4)Pix\n5)Verificar Extrato\n6)Verificar Saldo\n7)Saque\n8)Empréstimo");
        int x=teclado.nextInt();
        switch(x){
                case 1:
        }
    }
}
