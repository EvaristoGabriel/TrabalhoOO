package brufjfdcc025.trabalhooo.view;

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
    JPanel panelTransferencia;

    public BotaoTransferencia(Menu tela) {
        this.tela = tela;
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
                panelTransferencia = new JPanel();
                panelTransferencia.setVisible(true);
                JLabel nome = new JLabel("Nome:");
                JLabel tipoConta = new JLabel("Tipo da conta:");
                JLabel numConta = new JLabel("Numero da conta :");
                JLabel cpfJLabel = new JLabel("CPF: ");

                JTextField nomeDestinatario = new JTextField(15);
                JTextField tipoDestinatario = new JTextField(15);
                JTextField numeroConta = new JTextField(15);
                JTextField cpf = new JTextField(15);
                panelTransferencia.add(nome);
                panelTransferencia.add(nomeDestinatario);
                panelTransferencia.add(tipoConta);
                panelTransferencia.add(tipoDestinatario);
                panelTransferencia.add(numConta);
                panelTransferencia.add(numeroConta);
                panelTransferencia.add(cpfJLabel);
                panelTransferencia.add(cpf);
                
                
                JButton btntransferir = new JButton("Transferir");
                btntransferir.addActionListener(new BotaoRealizaTransferencia(tela,cpf,nomeDestinatario,tipoDestinatario,numeroConta));
                
                
               panelTransferencia.add(btntransferir);
               
                
                tela.add(panelTransferencia,BorderLayout.CENTER);
                
                

                     
            }

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Só é válido transferencias a partir de R$ 3,00");
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Valor da transferencia nao foi digitado");
        }
//        
    }
}
