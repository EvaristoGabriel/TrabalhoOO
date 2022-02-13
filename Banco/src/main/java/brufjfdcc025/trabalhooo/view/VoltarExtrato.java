/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Gabriela
 */
public class VoltarExtrato implements ActionListener {
    
    private final Menu tela;
    Cliente cliente;

    public VoltarExtrato(Menu tela, Cliente cliente) {

        this.tela = tela;
        this.cliente = cliente;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tela.painelExtrato.setVisible(false);
        tela.repaint();
        tela.menuOpcoes(cliente);

    }
    
    
}
