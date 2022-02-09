package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BotaoProximoFisico implements ActionListener {

    private final Menu tela;

    public BotaoProximoFisico(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        DefaultListModel<Cliente> modelo = new DefaultListModel<>();
        
        try{
            if(tela.getjSenha().getText().isEmpty() || tela.getjTelefone().getText().isEmpty() ||
                    tela.getjNome().getText().isEmpty()){
                int x = 100/0;
            }
            Cliente cliente = new Cliente(tela.getjSenha().getText(), tela.getjTelefone().getText(),
                    tela.getjNome().getText());
            modelo.addElement(cliente);
            tela.menuCadastraEndereco();
            tela.repaint(); 
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios");
        }
            
        
    }
        
}
    
