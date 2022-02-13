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
    private final String cpf;
    private float valPix;
    private Cliente cliente;

    public BotaoRealizaPix(Menu tela, String cpf, float valPix, Cliente cliente) {
        this.cpf = cpf;
        this.tela = tela;
        this.valPix = valPix;
        this.cliente = cliente;

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            int numcpf = Integer.parseInt(tela.getValCpf().getText()); //para verificar se o textfield do cpf ta sendo preenchido apenas com numeros
            
            //fazer uma busca pelo cpf da pessoa e creditar nele
            boolean boolcpf = false;
            
            for (Cliente c : tela.getClientes()) {
                if (c.getTipo().equals("F")) {
                    PessoaFisica p = (PessoaFisica) c;

//                    System.out.println(this.cpf);
//                    System.out.println(p.getCpf());
                    if (p.getCpf().equals(this.cpf)) {
                        boolcpf = true;
                        if(p.getConta().getSaldo()>=valPix){
//                        p.getConta().setSaldo(valPix);
                        p.getConta().addExtrato("Pix", valPix, Calendar.getInstance().getTime());
//                        cliente.getConta().setSaldo(-valPix);
                        cliente.getConta().addExtrato("Pix", -valPix, Calendar.getInstance().getTime());
                        JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");
                        }else{
                            JOptionPane.showMessageDialog(tela,"Saldo insuficiente!");
                        }
                        break;
                    }
                } else {
                    PessoaJuridica p = (PessoaJuridica) c;
                    if (p.getCnpj().equals(this.cpf)) {

                        boolcpf = true;
                        if(p.getConta().getSaldo()>=valPix){
                         
//                        p.getConta().setSaldo(valPix);
                        p.getConta().addExtrato("Pix", valPix, Calendar.getInstance().getTime());
//                        cliente.getConta().setSaldo(-valPix);
                        cliente.getConta().addExtrato("Pix", -valPix, Calendar.getInstance().getTime());
                        JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");
                        }else{
                            JOptionPane.showMessageDialog(tela,"Saldo insuficiente!");
                        }
                        break;
                    }
                                    }
            }

            if (boolcpf) {
                tela.panelPix.setVisible(false);
                tela.repaint();
                tela.menuOpcoes(cliente);
            } else {
                JOptionPane.showMessageDialog(tela, "CPF/CNPJ inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "CPF/CNPJ inválido. Digite apenas os números do CPF/CNPJ do destinatário do Pix!");

        }
    }
}
