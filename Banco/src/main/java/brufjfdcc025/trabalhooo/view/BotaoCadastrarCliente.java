package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.InputMismatchException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel Louback
 */
public class BotaoCadastrarCliente implements ActionListener {

    private final Menu tela;

    public BotaoCadastrarCliente(Menu tela) {
        this.tela = tela;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            //int x = Integer.parseInt(tela.getjNumero().getText());
            //Cadastrar o cliente na lista de clientes
            JOptionPane.showMessageDialog(tela, "Cadastro realizado!");
            tela.jpMenuInicial.setVisible(false);
            tela.menuLogin();
            tela.repaint();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(tela, "Nao foi possivel realizar o cadastro. Um ou mais campo preenchido incorretamente!");
            tela.painel.setVisible(false);
            tela.repaint();
        }
    }
}