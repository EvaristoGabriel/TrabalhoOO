package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import brufjfdcc025.trabalhooo.model.PessoaJuridica;
import java.util.Calendar;

public class RealizaPix implements ActionListener {

    private final Menu tela;
    private final String cpf;
    private float valPix;
    private Cliente cliente;

    public RealizaPix(Menu tela, String cpf, float valPix, Cliente cliente) {
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

                    if (p.getCpf().equals(this.cpf)) {
                        boolcpf = true;
                        
                        p.getConta().addExtrato("Pix", valPix, Calendar.getInstance().getTime());
                        cliente.getConta().addExtrato("Pix", -valPix, Calendar.getInstance().getTime());
                        JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");
                        
                        break;
                    }
                } else {
                    PessoaJuridica p = (PessoaJuridica) c;
                    if (p.getCnpj().equals(this.cpf)) {

                        boolcpf = true;
                        
                        p.getConta().addExtrato("Pix", valPix, Calendar.getInstance().getTime());
                        cliente.getConta().addExtrato("Pix", -valPix, Calendar.getInstance().getTime());
                        JOptionPane.showMessageDialog(tela, "Pix realizado com sucesso!");
                        
                        break;
                    }
                                    }
            }

            if (boolcpf==true) {
                tela.painelPix.setVisible(false);
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
