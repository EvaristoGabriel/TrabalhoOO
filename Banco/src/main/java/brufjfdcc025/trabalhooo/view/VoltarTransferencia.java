package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VoltarTransferencia implements ActionListener {

    private final Menu tela;
    Cliente cliente;

    public VoltarTransferencia(Menu tela, Cliente cliente) {

        this.tela = tela;
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        tela.painelTransferencia.setVisible(false);
        tela.repaint();
        tela.menuOpcoes(cliente);

    }

}
