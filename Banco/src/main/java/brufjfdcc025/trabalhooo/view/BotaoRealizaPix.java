/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Israel Louback
 */
public class BotaoRealizaPix  implements ActionListener{
    
     private final Menu tela;
    private final JTextField cpf;

    public BotaoRealizaPix(Menu tela,JTextField cpf) {
        this.cpf=cpf;
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        
        try{
             int pix= Integer.parseInt(cpf.getText()); //para verificar se o textfield do cpf ta sendo preenchido
             //fazer uma busca pelo cpf da pessoa e creditar nele
            JOptionPane.showMessageDialog(tela,"Pix realizado com sucesso!");
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(tela,"Digite o valor do PIX!");
        }
        
    }
    
}
