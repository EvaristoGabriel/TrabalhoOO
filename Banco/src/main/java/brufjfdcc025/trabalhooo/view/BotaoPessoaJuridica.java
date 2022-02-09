package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class BotaoPessoaJuridica implements ActionListener {

    private final Menu tela;

    public BotaoPessoaJuridica(Menu tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
    try{
            tela.menuCadastraJuridica();
            tela.repaint();
        }catch(Exception e){
            JOptionPane.showMessageDialog(tela, "Deu ruim!");
            tela.painel.setVisible(true);
        }
    
    }
}
