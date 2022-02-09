package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.Endereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel Louback
 */
public class BotaoCadastrarCliente implements ActionListener {

    private final Menu tela;
    Set<Cliente> clientes;

    public BotaoCadastrarCliente(Menu tela) {
        this.tela = tela;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            //Cadastrar o cliente na lista de clientes
            Endereco end = new Endereco(tela.getjCidade().getText(), tela.getjRua().getText(),
                                        tela.getjBairro().getText(), tela.getjCep().getText(),
                                        Integer.parseInt(tela.getjNumero().getText()),
                                        tela.getjComplemento().getText());
            //arrumar um jeito de colocar o endereço no cliente
            
            JOptionPane.showMessageDialog(tela, "Cadastro realizado!");
            tela.painel.setVisible(false);
            tela.menuLogin();
            tela.repaint();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(tela, "Nao foi possivel realizar o cadastro. Um ou mais campo preenchido incorretamente!");
            tela.painel.setVisible(false);
            tela.repaint();
        }
    }
}