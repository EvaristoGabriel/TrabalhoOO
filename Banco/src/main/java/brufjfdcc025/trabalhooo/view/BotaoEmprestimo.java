package brufjfdcc025.trabalhooo.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoEmprestimo implements ActionListener {

    private final Menu tela;

    public BotaoEmprestimo(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
             JTextField emprestimo = new JTextField();
            JOptionPane.showMessageDialog(tela, emprestimo, "Digite o valor do emprestimo:", JOptionPane.INFORMATION_MESSAGE);
            int valEmprestimo = Integer.parseInt(emprestimo.getText());
            
           //if(){ //condicao para emprestimo ainda nao especificada.
                
                
            //}

        }catch(ArithmeticException e){
            
        }
            catch (NumberFormatException e2) {
              JOptionPane.showMessageDialog(tela, "Voce nao digitou o valor do emprestimo requerido!");
        }

    }

}
