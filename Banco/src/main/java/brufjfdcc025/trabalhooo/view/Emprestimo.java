package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Emprestimo implements ActionListener {

    private final Menu tela;
    private Cliente cliente;


    public Emprestimo(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente=cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            JTextField emprestimo = new JTextField();
            JOptionPane.showMessageDialog(tela, "Com o empréstimo você pede um certo valor, e por mês sua dívida é acrescida em 1%", "Regras do empréstimo:", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(tela, emprestimo, "Digite o valor do emprestimo:", JOptionPane.INFORMATION_MESSAGE);
            float valEmprestimo = Float.parseFloat(emprestimo.getText());
            //O emprestimo tem como juros 1% por mês;
            if(valEmprestimo > 0){
                cliente.setDivida(valEmprestimo);
                cliente.getConta().addExtrato("Empréstimo", valEmprestimo, Calendar.getInstance().getTime());
                cliente.getDataemprestimo().setAno(Calendar.YEAR);
                cliente.getDataemprestimo().setDia(Calendar.DAY_OF_MONTH);
                cliente.getDataemprestimo().setAno(Calendar.MONTH);
            }
            else{
                JOptionPane.showMessageDialog(tela, "O valor digitado não é permitido", "Valor inválido!",JOptionPane.ERROR_MESSAGE);
            }

        }catch(ArithmeticException e){
            
        }
            catch (NumberFormatException e2) {
              JOptionPane.showMessageDialog(tela, "Voce nao digitou o valor do emprestimo requerido!");
        }

    }

}
