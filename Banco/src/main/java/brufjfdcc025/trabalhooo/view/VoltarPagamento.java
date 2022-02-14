/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gabriela
 */
public class VoltarPagamento implements ActionListener {

    private Menu tela;
    private Cliente cliente;

    public VoltarPagamento(Menu tela, Cliente cliente) {

        this.tela = tela;
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        tela.painelPagamento.setVisible(false);
        tela.repaint();
        tela.menuOpcoes(cliente);
    }

}
