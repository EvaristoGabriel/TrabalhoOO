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
public class BotaoSair  implements ActionListener{
    
       private final Menu tela;
   

    public BotaoSair(Menu tela) {
      
        this.tela = tela;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
            JOptionPane.showMessageDialog(tela, "Sair da conta");
            
        }catch(Exception e2){
        }
        
    }
    
}
