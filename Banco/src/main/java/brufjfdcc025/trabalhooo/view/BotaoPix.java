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
import javax.swing.JFrame;

public class BotaoPix  implements ActionListener{

    private final Menu tela;
    private Cliente cliente;

    public BotaoPix(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente=cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            JTextField pix = new JTextField();
            JOptionPane.showMessageDialog(tela, pix, "Digite o valor da transferencia:", JOptionPane.INFORMATION_MESSAGE);
            float valPix = Float.parseFloat(pix.getText());
            

            tela.jpMenuOpcoes.setVisible(false);
            tela.panelPix = new JPanel();
            tela.panelPix.setVisible(true);
            tela.repaint();


//            tela.panelPix.add(new JLabel("Valor do Pix: "));
//            tela.valPix = new JTextField(15);
//            tela.panelPix.add(tela.valPix);

            tela.panelPix.add(new JLabel("CPF/CNPJ do destinatário: "));
            tela.valCpf = new JTextField(15);
            tela.panelPix.add(tela.valCpf);
            
//            float val = Float.parseFloat(tela.getValPix().getText());
            String cpf = tela.getValCpf().getText();

            JButton btnPixRealizado = new JButton("Fazer o PIX!");
            btnPixRealizado.addActionListener(new BotaoRealizaPix(tela,cpf,valPix,cliente));

            tela.panelPix.add(btnPixRealizado);
            
            tela.btnVoltar.addActionListener(new BotaoVoltarPix(tela, cliente));
            tela.panelPix.add(tela.btnVoltar, BorderLayout.SOUTH);//BOTAO VOLTAR 
            tela.add(tela.panelPix, BorderLayout.CENTER);
            

        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(tela, "Digite o valor da transferência apenas com números");
        }
//        
    }
}
