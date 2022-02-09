package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.control.JSON;
import brufjfdcc025.trabalhooo.view.Menu;
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
        
        Cliente c = new Cliente("1234", "32988628281", "Gabriel", new Endereco("JF", "Rio Branco", "Centro", "3698788", 102, "13"));
        clientes.add(c);
        Menu tela = new Menu();
        tela.mostraMenu();
//        System.out.println("Vamos fazer seu cadastro: ");
//        if (opc==1)
//        {
//            pessoaf=new PessoaFisica();
//            System.out.println("Qual seu nome: ");
//            pessoaf.setNome(teclado.nextLine());
//            System.out.println("Qual seu cpf: ");
//            pessoaf.setCpf(teclado.nextLine());
//            System.out.println("Qual seu nascimento: ");
//            pessoaf.setNascimento(teclado.nextLine());
//            System.out.println("Cidade:");
//            String cidade = teclado.nextLine();
//            System.out.println("Rua: ");
//            String rua = teclado.nextLine();
//            System.out.println("Bairro: ");
//            String bairro = teclado.nextLine();
//            System.out.println("Cep: ");
//            String cep = teclado.nextLine();
//            System.out.println("Numero: ");
//            int num = teclado.nextInt();
//            System.out.println("Complemento: ");
//            int comp = teclado.nextInt();
//            pessoaf.setEndereco(new Endereco(cidade,rua,  bairro, cep, num, comp));
//            System.out.println("Qual a senha para acesso: ");
//            setSenha(teclado.next());
//        }
//
//        else
//        {
//            pessoaj= new PessoaJuridica(); 
//            System.out.println("Qual seu nome: ");
//            pessoaj.setNome(teclado.nextLine());
//            System.out.println("Qual o CNPJ: ");
//            pessoaj.setCnpj(teclado.nextLine());
//            System.out.println("Cidade:");
//            String cidade = teclado.nextLine();
//            System.out.println("Rua: ");
//            String rua = teclado.nextLine();
//            System.out.println("Bairro: ");
//            String bairro = teclado.nextLine();
//            System.out.println("Cep: ");
//            String cep = teclado.nextLine();
//            System.out.println("Numero: ");
//            int num = teclado.nextInt();
//            System.out.println("Complemento: ");
//            int comp = teclado.nextInt();
//            pessoaj.setEndereco(new Endereco(cidade,rua,  bairro, cep, num, comp));
//            System.out.println("Qual a senha para acesso: ");
//            setSenha(teclado.next());
//        }
//        Cartao car = new Cartao();
//        boolean continuar = true;
//        Menu menu = new Menu();
//        menu.montaMenu();
//        menu.mostraMenu();
//        while (continuar) {
//            System.out.println("Bem vindo! Já tem cadastro? ");
//            System.out.println("1-Sim\n2-Não");
//            int cad = teclado.nextInt();
//            String espaco = teclado.nextLine();
//            switch (cad){
//                case 1:
//                    System.out.println("Qual o numero do seu cpf/cnpj? ");
//                    System.out.println("(sem os pontos)");
//                    String numero = teclado.next();
//                    System.out.println("Qual sua senha? ");
//                    String senha = teclado.next();
//                    boolean encontrado = false;
//                    for (Cliente c : clientes) {
//                        if ((numero.equals(c.pessoaf.getCpf()) || numero.equals(c.pessoaj.getCnpj())) && senha.equals(c.getSenha())) {
//                            encontrado = true;
//                            System.out.println("Cadastro encontrado....\nLogando....");
//                        }
//                    }
//                    if(encontrado == false){
//                        System.out.println("Cadastro não encontrado");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Qual tipo de conta:\n1- Pessoa Física\n2- Pessoa Jurídica");
//                    int opc = teclado.nextInt();
//                    if(opc != 1 && opc != 2){
//                        while(opc != 1 && opc != 2){
//                            System.out.println("Opção Invalida, digite 1 ou 2");
//                            opc = teclado.nextInt();
//                        }
//                    }
//                    Cliente cliente = new Cliente(opc);
//                    clientes.add(cliente);
//                    //System.out.println(clientes);
//                    break;
//                default:
//                    System.out.println("Opção Inválida");
//                    break;
//            }
//            System.out.println("Deseja fazer outra operação?\n1-Sim\n2-Não");
//            int cont = teclado.nextInt();
//            if(cont != 1 && cont != 2){
//                while(cont != 1 && cont != 2){
//                    System.out.println("Opção Invalida, digite 1 ou 2");
//                    cont = teclado.nextInt();
//                }
//            }
//            if(cont == 1)
//                continuar = true;
//            else
//                continuar =false;
//        }
    }
}
