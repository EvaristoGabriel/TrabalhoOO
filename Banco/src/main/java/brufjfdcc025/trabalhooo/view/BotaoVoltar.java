/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Israel Louback
 */
public class BotaoVoltar  implements ActionListener{
    
      private final Menu tela;
   

    public BotaoVoltar(Menu tela) {
      
        this.tela = tela;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
           tela.repaint();
           tela.menuOpcoes();
           tela.repaint();
            
        }catch(Exception e2){
            
        }
    }
    
    
}
