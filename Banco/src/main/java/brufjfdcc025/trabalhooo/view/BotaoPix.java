package brufjfdcc025.trabalhooo.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import brufjfdcc025.trabalhooo.Cliente;

public class BotaoPix  implements ActionListener{

    private final Menu tela;
    private Cliente cliente;
    JPanel panelPix;

    public BotaoPix(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente=cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            JTextField pix = new JTextField();
            JOptionPane.showMessageDialog(tela, pix, "Digite o valor da transferencia:", JOptionPane.INFORMATION_MESSAGE);
            int valPix = Integer.parseInt(pix.getText());

            tela.jpMenuOpcoes.setVisible(false);
            panelPix = new JPanel();
            panelPix.setVisible(true);

            JLabel cpfJLabel = new JLabel("CPF do destinatário: ");

            JTextField cpf = new JTextField(15);

            panelPix.add(cpfJLabel);
            panelPix.add(cpf);

            JButton btnPixRealizado = new JButton("Fazer o PIX!");
            btnPixRealizado.addActionListener(new BotaoRealizaPix(tela,cpf,valPix,cliente));

            panelPix.add(btnPixRealizado);

            tela.add(panelPix, BorderLayout.CENTER);

        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Valor da transferencia nao foi digitado");
        }
//        
    }
}
