package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.control.JSON;
import brufjfdcc025.trabalhooo.view.Menu;
import java.util.Calendar;
import java.util.Date;
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
        Date data = new Date(System.currentTimeMillis());
//        System.out.println(Calendar.getInstance().getTime());
        Scanner teclado = new Scanner(System.in);

        Set<Cliente> clientes = new HashSet<>(); //conjunto de clientes 

        Menu tela = new Menu(clientes);
        tela.mostraMenu();
    }
}
