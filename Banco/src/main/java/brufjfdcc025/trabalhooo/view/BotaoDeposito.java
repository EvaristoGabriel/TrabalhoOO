package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoDeposito implements ActionListener {

    private final Menu tela;
    private Cliente cliente;

    public BotaoDeposito(Menu tela) {
        this.tela = tela;
        this.cliente=cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            JTextField deposito = new JTextField();
            JOptionPane.showMessageDialog(tela, deposito, "Digite o valor a ser depositado:", JOptionPane.INFORMATION_MESSAGE);
            float valDeposito = Float.parseFloat(deposito.getText());
            if (valDeposito < 10) {
                int x = 100 / 0; 
            } else {
                
                //implementar o cliente.conta.setsaldo e acumular com o valdeposito
                cliente.getConta().setSaldo(valDeposito);
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Não foi possível efetuar o depósito!");
            JOptionPane.showMessageDialog(tela, "Só é válido depósitos acima de R$10,00");

        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Você não digitou o valor a ser depositado!");
        }

    }

}
