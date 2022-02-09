package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
//import com.sun.security.ntlm.Client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JOptionPane;
import brufjfdcc025.trabalhooo.Cliente;

public class BotaoEntrar implements ActionListener {
    private final Menu tela;
    Set<Cliente> clientes;

    public BotaoEntrar(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try{
            for(Cliente c : tela.getClientes()){
                System.out.println(c);
               // System.out.println("tela.getjCpf().getText() = "+tela.getjCpf().getText());
                System.out.println("c.getCpfcnpj() = "+c.getCpfcnpj());
                System.out.println("tela.getjSenha().getText() = "+tela.getjSenha().getText());
                System.out.println("c.getSenha()"+c.getSenha());
//                if(tela.getjCpf().getText().equals(c.getCpfcnpj()) && 
//                        tela.getjSenha().getText().equals(c.getSenha()))
//                    JOptionPane.showMessageDialog(tela, "Bem vindo "+c.getNome()+"!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(tela, "Algo deu errado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
            
        
    }
}
    
