/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoRealizaTransferencia implements ActionListener {

    private final Menu tela;
    private final JTextField cpf;
    private final JTextField numConta;
    private final JTextField nomeConta;
    private final JTextField tipoConta;

    public BotaoRealizaTransferencia(Menu tela, JTextField cpf, JTextField num, JTextField nome, JTextField tipo) {
        this.cpf = cpf;
        this.tela = tela;
        this.nomeConta = nome;
        this.numConta = num;
        this.tipoConta = tipo;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            int campoCpf = Integer.parseInt(cpf.getText());
            int campoNumConta = Integer.parseInt(numConta.getText());
            int campoTipoConta = Integer.parseInt(tipoConta.getText());
            int campoNomeConta = Integer.parseInt(nomeConta.getText());

            //fazer uma busca pelo cpf da pessoa e creditar na conta dela
            JOptionPane.showMessageDialog(tela, "Transferencia realizada com sucesso!");
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Um ou mais campo nao preenchido!");
        }

    }

}
