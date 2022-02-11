package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
//import com.sun.security.ntlm.Client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JOptionPane;
import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.PessoaFisica;
import brufjfdcc025.trabalhooo.PessoaJuridica;

public class BotaoEntrar implements ActionListener {

    private final Menu tela;
    Set<Cliente> clientes;

    public BotaoEntrar(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            boolean login = false;
            Cliente cliente = null;
            for (Cliente c : tela.getClientes()) {
                //usar mascara para ver se é fisica ou juridica
                if (c.getTipo().equals("F")) {
                    PessoaFisica p = (PessoaFisica) c;
                    if (p.getCpf().equals(tela.getjCpf().getText())
                            && tela.getjSenha().getText().equals(c.getSenha())) {
                        JOptionPane.showMessageDialog(tela, "Bem vindo " + c.getNome() + "!");
                        login = true;
                        
                        cliente = c;
                        break;
                    }
                } else {
                    PessoaJuridica p = (PessoaJuridica) c;
                    if (p.getCnpj().equals(tela.getjCpf().getText())
                            && tela.getjSenha().getText().equals(c.getSenha())) {
                        JOptionPane.showMessageDialog(tela, "Bem vindo " + c.getNome() + "!");
                        login = true;
                        
                        cliente = c;
                        break;
                    }
                }
                
            }
            if (login != true) {
                JOptionPane.showMessageDialog(tela, "Usuário não encontrado!", "Usuário", JOptionPane.ERROR_MESSAGE);
            } else {
                tela.painelLogin.setVisible(false);
                tela.menuOpcoes(cliente);
                tela.repaint();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(tela, "Algo deu errado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
}
