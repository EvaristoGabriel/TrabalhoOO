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
        String[] opcs = {"Cliente", "Funcionario"};
        Scanner teclado = new Scanner(System.in);
        
        int x = JOptionPane.showOptionDialog(null, "Quem é você?", "Pessoa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcs, opcs[0]);
        Set <Cliente> clientes = new HashSet <>();
        switch(x){
            case 0:
                System.out.println("Já tem cadastro? ");
                System.out.println("1-Sim\n2-Não");
                int cad = teclado.nextInt();
                String buffer = teclado.nextLine();
                switch(cad){
                    case 1:
                        System.out.println("Qual o numero do seu cartao: ");
                        System.out.println("*sem os espaços");
                        String numero = teclado.next();
                        System.out.println("Qual sua senha: ");
                        String senha = teclado.next();
                        for(Cliente c : clientes){
                            if(numero.equals(c.card.getNumero()) && senha.equals(c.card.getSenha())){
                                
                            }
                        }

                        break;
                    case 2:
                        Cliente cliente = new Cliente();
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
                        clientes.add(cliente);
                        System.out.println(clientes);
                        break;
                    default: 
                        System.out.println("Opção Inválida");
                        break;
                }
                break;
            
            case 1:
                break;
        }
        Cliente cliente = new Cliente();
        
    }
}
