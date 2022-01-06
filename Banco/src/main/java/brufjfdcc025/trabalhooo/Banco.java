package brufjfdcc025.trabalhooo;

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

        Set<Cliente> clientes = new HashSet<>();

        System.out.println("Bem vindo! Já tem cadastro? ");
        System.out.println("1-Sim\n2-Não\n(Digite 1 ou 2)");
        int cad = teclado.nextInt();
        String buffer = teclado.nextLine();
        switch (cad) {
            case 1:
                System.out.println("Qual o numero do seu cpf? ");
                System.out.println("(sem os espaços)");
                String numero = teclado.next();
                System.out.println("Qual sua senha? ");
                String senha = teclado.next();
                for (Cliente c : clientes) {
                    if (numero.equals(c.getCpf()) && senha.equals(c.getSenha())) {
                        
                    }
                }

                break;
            case 2:
                Cliente cliente = new Cliente();
                //fazendo o cadastro do cliente
                System.out.println("Vamos fazer seu cadastro: ");
                System.out.println("Qual seu nome: ");
                cliente.setNome(teclado.nextLine());
                cliente.setCpf(teclado.nextLine());
                cliente.setNascimento(teclado.nextLine());
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
                cliente.setEndereco(rua, bairro, cep, num, comp);
                System.out.println(cliente.getEndereco());
                //adicionando no conjunto de clientes
                clientes.add(cliente);
                System.out.println(clientes);
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        

    }
}
