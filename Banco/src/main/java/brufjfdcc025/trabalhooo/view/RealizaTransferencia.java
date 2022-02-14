package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RealizaTransferencia implements ActionListener {

    private final Menu tela;
    private final int cpf;
    private final String numConta;
    private final String nomeConta;
    private final Cliente cliente;
    private final float val;

    public RealizaTransferencia(Menu tela, int cpf,String num, String nome, Float val, Cliente cliente) {
        this.cpf = cpf;
        this.tela = tela;
        this.nomeConta = nome;
        this.numConta = num;
        this.val = val;
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            boolean trans = false;
            for (Cliente c : tela.getClientes()) {
                System.out.println(c);
                if (c.getTipo().equals("F")) {
                    PessoaFisica p = (PessoaFisica) c;
                    if (p.getCpf().equals(cpf) && p.getConta().getNumero().equals(numConta) && p.getNome().equals(nomeConta)) {
                        c.getConta().addExtrato("Transferência", val, Calendar.getInstance().getTime());
                        cliente.getConta().addExtrato("Transferência", -val, Calendar.getInstance().getTime());
                        trans = true;
                        break;
                    }
                }
            }

            if (trans == true) {
                JOptionPane.showMessageDialog(tela, "Transferencia realizada com sucesso!");
                tela.painelTransferencia.setVisible(false);
                tela.repaint();
                tela.menuOpcoes(cliente);

            } else {
                JOptionPane.showMessageDialog(tela, "Destinatário não encontrado!");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(tela, "Digite apenas números para a conta e para o CPF.");
        }

    }

}
