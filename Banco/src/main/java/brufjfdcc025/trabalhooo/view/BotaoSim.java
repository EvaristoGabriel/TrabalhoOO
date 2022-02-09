package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import org.graalvm.compiler.nodes.NodeView;

public class BotaoSim implements ActionListener{

    private final Menu tela;

    public BotaoSim(Menu tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        try{
           tela.painel.setVisible(false);
           tela.menuLogin();
           tela.repaint();   
        }catch(Exception e){
            JOptionPane.showMessageDialog(tela, "Deu ruim!");
            tela.painel.setVisible(true);
        }
        
    }
    
}
