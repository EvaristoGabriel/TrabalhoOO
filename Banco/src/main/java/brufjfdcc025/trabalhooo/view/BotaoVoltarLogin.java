/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gabriela
 */
public class BotaoVoltarLogin implements ActionListener {
    
    private final Menu tela;

    public BotaoVoltarLogin(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        tela.painelLogin.setVisible(false);
        tela.repaint();
        tela.menuPossuiConta();
        tela.repaint();
        
    }    
    
    
}
