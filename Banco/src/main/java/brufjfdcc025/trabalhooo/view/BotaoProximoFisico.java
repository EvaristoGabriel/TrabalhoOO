package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.PessoaFisica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BotaoProximoFisico implements ActionListener {

    private final Menu tela;

    public BotaoProximoFisico(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try{
            if(tela.getjSenha().getText().isEmpty() || tela.getjTelefone().getText().isEmpty() ||
                    tela.getjNome().getText().isEmpty() || tela.getjOcupacao().getText().isEmpty() ||
                    tela.getjRg().getText().isEmpty() || tela.getjCpf().getText().isEmpty()){
                int x = 100/0;
            }
            PessoaFisica cliente = new PessoaFisica(tela.getjCpf().getText(), tela.getjDataNascimento().getText(),
                                                    tela.getjOcupacao().getText(), tela.getjRg().getText(),
                                                    tela.getjTelefone().getText(), tela.getjNome().getText(),
                                                    tela.getjSenha().getText());
            tela.AdicionarCliente(cliente);
            tela.menuCadastraEndereco(tela.getjNome().getText());
            tela.repaint(); 
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios");
        }
            
        
    }
        
}
    
