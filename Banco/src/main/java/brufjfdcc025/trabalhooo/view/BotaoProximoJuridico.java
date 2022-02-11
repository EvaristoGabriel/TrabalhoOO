package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.PessoaJuridica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BotaoProximoJuridico implements ActionListener {

    private final Menu tela;

    public BotaoProximoJuridico(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try{
            if(tela.getjSenha().getText().isEmpty() || tela.getjTelefone().getText().isEmpty() ||
                    tela.getjNome().getText().isEmpty() || tela.getjCnpj().getText().isEmpty()){
                int x = 100/0;
            }
            PessoaJuridica cliente = new PessoaJuridica(tela.getjCnpj().getText(), tela.getjTelefone().getText(),
                    tela.getjNome().getText(),tela.getjSenha().getText());
            
            tela.getClientes().add(cliente);
            tela.menuCadastraEndereco(tela.getjNome().getText());
            tela.repaint(); 
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios");
        }
            
        
    }
    
}
