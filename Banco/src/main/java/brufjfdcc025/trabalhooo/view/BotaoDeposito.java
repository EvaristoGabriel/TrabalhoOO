package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoDeposito implements ActionListener {

    private final Menu tela;

    public BotaoDeposito(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            JTextField deposito = new JTextField();
            JOptionPane.showMessageDialog(tela, deposito, "Digite o valor a ser depositado:", JOptionPane.INFORMATION_MESSAGE);
            int valDeposito = Integer.parseInt(deposito.getText());
            if (valDeposito < 10) {
                int x = 100 / 0;
            } else {
                
                //implementar o cliente.conta.setsaldo e acumular com o valdeposito

            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Nao foi possivel efetuar o deposito!");
            JOptionPane.showMessageDialog(tela, "Só é válido depositos acima de R$10,00");

        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(tela, "Voce nao digitou o valor a ser depositado!");
        }

    }

}
