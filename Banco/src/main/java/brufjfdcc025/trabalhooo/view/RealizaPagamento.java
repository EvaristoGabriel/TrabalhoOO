package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.PessoaJuridica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RealizaPagamento implements ActionListener {

    private final Menu tela;
    private final int cpf;
    private final String numConta;
    private final String nomeConta;
    private final Cliente cliente;
    private final float val;

    public RealizaPagamento(Menu tela, int cpf, String numConta, String nomeConta, float val, Cliente cliente) {
        this.tela = tela;
        this.cpf = cpf;
        this.numConta = numConta;
        this.nomeConta = nomeConta;
        this.cliente = cliente;
        this.val = val;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            boolean pag = false;
            for (Cliente c : tela.getClientes()) {
                if (c.getTipo().equals("J")) {
                    PessoaJuridica p = (PessoaJuridica) c;
                    if (p.getCnpj().equals(cpf) && p.getConta().getNumero().equals(numConta) && p.getNome().equals(nomeConta)) {
                        c.getConta().addExtrato("Pagamento", val, Calendar.getInstance().getTime());
                        cliente.getConta().addExtrato("Pagamento", -val, Calendar.getInstance().getTime());
                        pag = true;
                        break;
                    }
                }
            }

            if (pag == true) {
                JOptionPane.showMessageDialog(tela, "Pagamento realizado com sucesso!");
                tela.painelPagamento.setVisible(false);
                tela.repaint();
                tela.menuOpcoes(cliente);

            } else {
                JOptionPane.showMessageDialog(tela, "Destinatário não encontrado!");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(tela, "Digite apenas números para a conta e para o CNPJ.");
        }

    }

}
