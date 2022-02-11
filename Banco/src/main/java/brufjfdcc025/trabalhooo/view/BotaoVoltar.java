/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Israel Louback
 */
public class BotaoVoltar implements ActionListener {

    private final Menu tela;
    Cliente cliente;

    public BotaoVoltar(Menu tela, Cliente cliente) {

        this.tela = tela;
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            tela.setVisible(false);
            tela.menuOpcoes(cliente);

        } catch (Exception e2) {

        }
    }

}
