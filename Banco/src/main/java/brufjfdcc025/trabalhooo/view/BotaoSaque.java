package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoSaque implements ActionListener {

    private final Menu tela;

    public BotaoSaque(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            JTextField saque = new JTextField();
            JOptionPane.showMessageDialog(tela, saque, "Digite o valor a ser sacado:", JOptionPane.INFORMATION_MESSAGE);
            int valSaque = Integer.parseInt(saque.getText());
            
//            if ( < valSaque) { //se o cliente.getSaldo for menor que o valSaque;
//                int x = 100 / 0;
//            }else{
//                // cliente.conta.setSaldo-=valSaque;
//                
//            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Nao foi possivel efetuar o saque!");
            JOptionPane.showMessageDialog(tela, "Valor disponivel para saque: " ); // +cliente.conta.getSaldo();
            tela.painel.setVisible(false);
            tela.repaint();
        }
        catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(tela, "Voce nao digitou o valor a ser sacado!");
        }

    }

}
