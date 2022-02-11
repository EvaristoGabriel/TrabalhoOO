/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.Conta;
import brufjfdcc025.trabalhooo.PessoaFisica;
import brufjfdcc025.trabalhooo.PessoaJuridica;
import java.util.Calendar;

/**
 *
 * @author Israel Louback
 */
public class BotaoRealizaPix implements ActionListener {

    private final Menu tela;
    private final JTextField cpf;
    private float valPix;
    private Cliente cliente;

    public BotaoRealizaPix(Menu tela, JTextField cpf, float valPix, Cliente cliente) {
        this.cpf = cpf;
        this.tela = tela;
        this.valPix = valPix;
        this.cliente = cliente;

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
//            int cpfpix = Integer.parseInt(cpf.getText()); //para verificar se o textfield do cpf ta sendo preenchido
            //fazer uma busca pelo cpf da pessoa e creditar nele
            boolean cpf = false;

            for (Cliente c : tela.getClientes()) {
                if (c.getTipo().equals("F")) {
                    PessoaFisica p = (PessoaFisica) c;
                    System.out.println(this.cpf.getText());
                    System.out.println(p.getCpf());
//                    System.out.println(this.cpf);
//                    System.out.println(p.getCpf());
                    if (p.getCpf().equals(this.cpf.getText())) {
                        cpf = true;
                        p.getConta().setSaldo(valPix);
                        p.getConta().addExtrato("Pix", valPix, Calendar.getInstance().getTime());
                        cliente.getConta().setSaldo(-valPix);
                        cliente.getConta().addExtrato("Pix", -valPix, Calendar.getInstance().getTime());
                        JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");

                        break;
                    }
                } else {
                    PessoaJuridica p = (PessoaJuridica) c;
                    if (p.getCnpj().equals(tela.getjCpf().getText())) {

                        cpf = true;
                        p.getConta().setSaldo(valPix);
                        p.getConta().addExtrato("Pix", valPix, Calendar.getInstance().getTime());
                        cliente.getConta().setSaldo(-valPix);
                        cliente.getConta().addExtrato("Pix", -valPix, Calendar.getInstance().getTime());
                        JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");

                        break;
                    }
                }

            }

            if (cpf == false) {
                JOptionPane.showMessageDialog(tela, "CPF/CNPJ inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                tela.panelPix.setVisible(false);
                JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");
                tela.panelPix.setVisible(false);
                tela.repaint();
                tela.menuOpcoes(cliente);
            }

        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Valor inválido. Digite o cpf do destinatário do Pix!");
        }
    }
}
