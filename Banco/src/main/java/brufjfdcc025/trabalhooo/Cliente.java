package brufjfdcc025.trabalhooo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {
    String senha;
    PessoaFisica pessoaf;
    PessoaJuridica pessoaj;
    private Conta contac, contap;
    Scanner teclado = new Scanner(System.in);

    public Cliente(int opc) {
       System.out.println("Vamos fazer seu cadastro: ");
       if (opc==1)
       {
            pessoaf=new PessoaFisica();
            System.out.println("Qual seu nome: ");
            pessoaf.setNome(teclado.nextLine());
            System.out.println("Qual seu cpf: ");
            pessoaf.setCpf(teclado.nextLine());
            System.out.println("Qual seu nascimento: ");
            pessoaf.setNascimento(teclado.nextLine());
            System.out.println("Rua: ");
            String rua = teclado.nextLine();
            System.out.println("Bairro: ");
            String bairro = teclado.nextLine();
            System.out.println("Cep: ");
            String cep = teclado.nextLine();
            System.out.println("Numero: ");
            int num = teclado.nextInt();
            System.out.println("Complemento: ");
            int comp = teclado.nextInt();
            pessoaf.setEndereco(rua, bairro, cep, num, comp);
       }
           
       else
       {
            pessoaj= new PessoaJuridica(); 
            System.out.println("Qual seu nome: ");
            pessoaj.setNome(teclado.nextLine());
            System.out.println("Qual o CNPJ: ");
            pessoaj.setCnpj(teclado.nextLine());
            System.out.println("Rua: ");
            String rua = teclado.nextLine();
            System.out.println("Bairro: ");
            String bairro = teclado.nextLine();
            System.out.println("Cep: ");
            String cep = teclado.nextLine();
            System.out.println("Numero: ");
            int num = teclado.nextInt();
            pessoaj.setEndereco(rua, bairro, cep, num);
       }
           
       //fazendo o cadastro do cliente
        
        
    }
    
    
    
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
