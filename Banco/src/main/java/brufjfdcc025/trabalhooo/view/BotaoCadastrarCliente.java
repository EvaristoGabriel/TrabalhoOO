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
            
            //tratando campos vazios
            if(tela.getjCidade().getText().isEmpty() ||  tela.getjRua().getText().isEmpty() || 
                    tela.getjBairro().getText().isEmpty() ||  tela.getjCep().getText().isEmpty() || 
                    tela.getjNumero().getText().isEmpty()){
                    int x= 10/0;
            }
            //tratando campos que só pode números
            int num = Integer.parseInt(tela.getjNumero().getText());
            int numCep = Integer.parseInt(tela.getjCep().getText());
            
            //Cadastrar o cliente na lista de clientes
            Endereco end = new Endereco(tela.getjCidade().getText(), tela.getjRua().getText(),
                    tela.getjBairro().getText(), tela.getjCep().getText(),
                    num, tela.getjComplemento().getText());
            
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

        } 
        
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios");
        } 
        
        catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(tela, "Um ou mais campos preenchidos incorretamente");
        } 
        
        catch (IOException ex) {
            Logger.getLogger(BotaoCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(tela, "Não foi possível realizar o cadastro. Um ou mais campos preenchido incorretamente!");
//            tela.painel.setVisible(false);
//            tela.repaint();
//        } 
    }
}
