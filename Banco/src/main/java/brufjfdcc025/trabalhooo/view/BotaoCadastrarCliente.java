package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.Endereco;
import brufjfdcc025.trabalhooo.control.Arquivo;
import brufjfdcc025.trabalhooo.control.JSON;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel Louback
 */
public class BotaoCadastrarCliente implements ActionListener {

    private final Menu tela;
    Set<Cliente> clientes;
    private static final String caminho = "dados.json";
    String nome;

    public BotaoCadastrarCliente(Menu tela, String nome) {
        this.tela = tela;
        this.nome = nome;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            //Cadastrar o cliente na lista de clientes
            Endereco end = new Endereco(tela.getjCidade().getText(), tela.getjRua().getText(),
                    tela.getjBairro().getText(), tela.getjCep().getText(),
                    Integer.parseInt(tela.getjNumero().getText()),
                    tela.getjComplemento().getText());
            for(Cliente c : tela.getClientes())
            {
               if(c.getNome().equals(nome)){
                   c.setEndereco(end);
                   System.out.println(c);
               }
            }
            JOptionPane.showMessageDialog(tela, "Cadastro realizado!");
            String json = JSON.toJSON(clientes);
            Arquivo.escreverArquivo(caminho, json);
            tela.jpMenuEndereco.setVisible(false);
            tela.menuLogin();
            tela.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(tela, "Nao foi possivel realizar o cadastro. Um ou mais campo preenchido incorretamente!");
            tela.painel.setVisible(false);
            tela.repaint();
        } 
    }
}
