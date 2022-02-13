package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Saque implements ActionListener {

    private final Menu tela;
    private Cliente cliente;

    public Saque(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente = cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
//            JTextField saque = new JTextField();
//            JOptionPane.showMessageDialog(tela, saque, "Digite o valor a ser sacado:", JOptionPane.INFORMATION_MESSAGE);
//            float valSaque = Float.parseFloat(saque.getText());
            
            float valSaque = Float.parseFloat(JOptionPane.showInputDialog(tela, "Digite o valor a ser sacado:", "Saque", JOptionPane.INFORMATION_MESSAGE));

            
            if(cliente.getConta().getSaldo()>=valSaque){
//                cliente.getConta().setSaldo(-valSaque);
                cliente.getConta().addExtrato("Saque", -valSaque, Calendar.getInstance().getTime());
                JOptionPane.showMessageDialog(tela, "Saque efetuado com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(tela, "Saldo insuficiente!");

            }
//            if ( < valSaque) { //se o cliente.getSaldo for menor que o valSaque;
//                int x = 100 / 0;
//            }else{
//                // cliente.conta.setSaldo-=valSaque;
//                
//            }
//        } catch (ArithmeticException e) {
//            JOptionPane.showMessageDialog(tela, "Não foi possivel efetuar o saque!");
//            JOptionPane.showMessageDialog(tela, "Valor disponivel para saque: " ); // +cliente.conta.getSaldo();
//            tela.painel.setVisible(false);
//            tela.repaint();
        }
        catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(tela, "Voce não digitou o valor a ser sacado\nou digiotu um valor inválido!");
        }

    }

}
