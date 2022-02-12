package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import com.sun.org.apache.xerces.internal.util.DOMUtil;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotaoTransferencia implements ActionListener {

    private final Menu tela;
    Cliente cliente;

    public BotaoTransferencia(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente = cliente;

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            JTextField transferencia = new JTextField();
            JOptionPane.showMessageDialog(tela, transferencia, "Digite o valor da transferencia:", JOptionPane.INFORMATION_MESSAGE);
            int valTransferencia = Integer.parseInt(transferencia.getText());

            if (valTransferencia < 3) {
                int x = 100 / 0;
            } else {
                tela.jpMenuOpcoes.setVisible(false);
                tela.panelTransferencia = new JPanel();
                tela.panelTransferencia.setVisible(true);
                JLabel nome = new JLabel("Nome:");
                JLabel numConta = new JLabel("Número da conta:");
                JLabel cpfJLabel = new JLabel("CPF: ");

                JTextField nomeDestinatario = new JTextField(15);
                JTextField numeroConta = new JTextField(15);
                JTextField cpf = new JTextField(15);
                tela.panelTransferencia.add(nome);
                tela.panelTransferencia.add(nomeDestinatario);
                tela.panelTransferencia.add(numConta);
                tela.panelTransferencia.add(numeroConta);
                tela.panelTransferencia.add(cpfJLabel);
                tela.panelTransferencia.add(cpf);

                JButton btntransferir = new JButton("Transferir");
                btntransferir.addActionListener(new BotaoRealizaTransferencia(tela, cpf, numeroConta, nomeDestinatario, cliente));

                tela.panelTransferencia.add(btntransferir);

                tela.btnVoltar.addActionListener(new BotaoVoltarTransferencia(tela, cliente));
                tela.panelTransferencia.add(tela.btnVoltar, BorderLayout.SOUTH);//BOTAO VOLTAR 
                tela.add(tela.panelTransferencia, BorderLayout.CENTER);

            }

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Só é válido transferencias a partir de R$ 3,00");
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Valor da transferencia nao foi digitado");
        }
//        
    }
}
