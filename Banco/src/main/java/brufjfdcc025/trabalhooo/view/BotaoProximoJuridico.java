package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.PessoaJuridica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BotaoProximoJuridico implements ActionListener {

    private final Menu tela;

    public BotaoProximoJuridico(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        DefaultListModel<Cliente> modelo = new DefaultListModel<>();


        try{
            //verificando áreas vazias
            if(tela.getjSenha().getText().isEmpty() || tela.getjTelefone().getText().isEmpty() ||
                    tela.getjNome().getText().isEmpty() || tela.getjCnpj().getText().isEmpty()){
                int x = 100/0;
            }

            //verificando áreas que permitem somente números
            int numCnpj = Integer.parseInt(tela.getjCnpj().getText());
            int numTel = Integer.parseInt(tela.getjTelefone().getText());
            
            PessoaJuridica cliente = new PessoaJuridica(tela.getjCnpj().getText(), tela.getjTelefone().getText(),
                    tela.getjNome().getText(), tela.getjSenha().getText());

            modelo.addElement(cliente);
            tela.getListaClientes().setModel(modelo);
            tela.getClientes().add(cliente);
            tela.menuCadastraEndereco(tela.getjNome().getText());
            tela.repaint();
        } 
        
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios");
        } 
        
        catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(tela, "Um ou mais campos preenchidos incorretamente");
        }

    }

}
