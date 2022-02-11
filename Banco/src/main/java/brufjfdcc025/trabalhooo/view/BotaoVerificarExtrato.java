package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import brufjfdcc025.trabalhooo.Cliente;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class BotaoVerificarExtrato implements ActionListener{

    private final Menu tela;
    private Cliente cliente;
    private JPanel painel;

    public BotaoVerificarExtrato(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente=cliente;
        painel = new JPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        painel.setVisible(true);
        painel.setLayout(new java.awt.GridBagLayout());
        JLabel label = new JLabel(cliente.getConta().imprimeExtrato());
        painel.add(label);
        
        
    }
    }
