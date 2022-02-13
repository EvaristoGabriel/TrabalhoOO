/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RealizaTransferencia implements ActionListener {

    private final Menu tela;
    private final JTextField cpf;
    private final JTextField numConta;
    private final JTextField nomeConta;
    private final Cliente cliente;

    public RealizaTransferencia(Menu tela, JTextField cpf, JTextField num, JTextField nome, Cliente cliente) {
        this.cpf = cpf;
        this.tela = tela;
        this.nomeConta = nome;
        this.numConta = num;
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            int campoCpf = Integer.parseInt(cpf.getText());
            int campoNumConta = Integer.parseInt(numConta.getText());
            //int campoNomeConta = Integer.parseInt(nomeConta.getText());
            
            //fazer uma busca pelo cpf da pessoa e creditar na conta dela
            JOptionPane.showMessageDialog(tela, "Transferencia realizada com sucesso!");
            tela.panelTransferencia.setVisible(false);
            tela.repaint();
            tela.menuOpcoes(cliente);
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Digite apenas números para a conta e para o CPF/CNPJ.");
        }

    }

}
