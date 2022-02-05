package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.menu.Menu;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/*
        Trabalho de Orientação a Objetos
    Alunos: Gabriel Evaristo,
            Israel Louback,
            Mariana Richa
 */
public class Banco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Set<Cliente> clientes = new HashSet<>(); //conjunto de clientes 
        Cartao car = new Cartao();
        boolean continuar = true;
        Menu menu = new Menu();
        menu.montaMenu();
        menu.mostraMenu();
        while (continuar) {

            System.out.println("Bem vindo! Já tem cadastro? ");
            System.out.println("1-Sim\n2-Não");
            int cad = teclado.nextInt();
            String espaco = teclado.nextLine();
            switch (cad){
                case 1:
                    System.out.println("Qual o numero do seu cpf/cnpj? ");
                    System.out.println("(sem os pontos)");
                    String numero = teclado.next();
                    System.out.println("Qual sua senha? ");
                    String senha = teclado.next();
                    boolean encontrado = false;
                    for (Cliente c : clientes) {
                        if ((numero.equals(c.pessoaf.getCpf()) || numero.equals(c.pessoaj.getCnpj())) && senha.equals(c.getSenha())) {
                            encontrado = true;
                            System.out.println("Cadastro encontrado....\nLogando....");
                        }
                    }
                    if(encontrado == false){
                        System.out.println("Cadastro não encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Qual tipo de conta:\n1- Pessoa Física\n2- Pessoa Jurídica");
                    int opc = teclado.nextInt();
                    if(opc != 1 && opc != 2){
                        while(opc != 1 && opc != 2){
                            System.out.println("Opção Invalida, digite 1 ou 2");
                            opc = teclado.nextInt();
                        }
                    }
                    Cliente cliente = new Cliente(opc);
                    clientes.add(cliente);
                    //System.out.println(clientes);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            System.out.println("Deseja fazer outra operação?\n1-Sim\n2-Não");
            int cont = teclado.nextInt();
            if(cont != 1 && cont != 2){
                while(cont != 1 && cont != 2){
                    System.out.println("Opção Invalida, digite 1 ou 2");
                    cont = teclado.nextInt();
                }
            }
            if(cont == 1)
                continuar = true;
            else
                continuar =false;
        }
    }
}
