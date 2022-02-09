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
            boolean login = false;
            for(Cliente c : tela.getClientes()){
                if(tela.getjCpf().getText().equals(c.getCpfcnpj()) && 
                        tela.getjSenha().getText().equals(c.getSenha())){
                    JOptionPane.showMessageDialog(tela, "Bem vindo "+c.getNome()+"!");
                    login = true;
                }
            }        
            if(login != true){
                JOptionPane.showMessageDialog(tela, "Usuário não encontrado!", "Usuário",JOptionPane.ERROR_MESSAGE);
            }
            else{
                tela.painelLogin.setVisible(false);
                tela.menuOpcoes();
                tela.repaint();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(tela, "Algo deu errado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
            
        
    }
}
    
