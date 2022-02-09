package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class BotaoNao implements ActionListener{

    private final Menu tela;

    public BotaoNao(Menu tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        try{
           tela.painel.setVisible(false);
           tela.menuPerguntaPessoa();
           tela.repaint();   
        }catch(Exception e){
            JOptionPane.showMessageDialog(tela, "Deu ruim!");
            tela.painel.setVisible(true);
        }
    }
    
}
