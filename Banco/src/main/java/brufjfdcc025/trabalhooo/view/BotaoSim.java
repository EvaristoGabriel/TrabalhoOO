package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.graalvm.compiler.nodes.NodeView;

public class BotaoSim implements ActionListener{

    private final Menu tela;

    public BotaoSim(Menu tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        try{
           tela.painel.setVisible(false);
           tela.painel.add(tela.painelLogin);
           tela.painelLogin.setVisible(true);
           tela.repaint();   
        }catch(Exception e){
            JOptionPane.showMessageDialog(tela, "Deu ruim!");
            tela.painel.setVisible(true);
        }
        
    }
    
}
