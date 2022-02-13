package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.view.Menu;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

/*
        Trabalho de Orientação a Objetos
    Alunos: Gabriel Evaristo,
            Israel Louback,
            Mariana Richa
 */
public class Banco {

    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>(); //conjunto de clientes 

        Menu tela = new Menu(clientes);
        tela.mostraMenu();
    }
}
