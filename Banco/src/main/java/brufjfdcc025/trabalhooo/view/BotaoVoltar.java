package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoVoltar  implements ActionListener{
    
      private final Menu tela;
      Cliente cliente;
   

    public BotaoVoltar(Menu tela, Cliente cliente) {
      
        this.tela = tela;
        this.cliente=cliente;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
            tela.panelPix.setVisible(false);
            tela.repaint();
            tela.menuOpcoes(cliente);
        }catch(Exception e2){
            JOptionPane.showMessageDialog(tela, "ERROR","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
