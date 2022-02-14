package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ProximoFisico implements ActionListener {

    private final Menu tela;

    public ProximoFisico(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try{
            //conferindo se há campos vazios
            if(tela.getjSenha().getText().isEmpty() || tela.getjTelefone().getText().isEmpty() ||
                    tela.getjNome().getText().isEmpty() || tela.getjOcupacao().getText().isEmpty() ||
                    tela.getjRg().getText().isEmpty() || tela.getjCpf().getText().isEmpty()){
                int x = 100/0;
            }
            int y;
            //verificando áreas que permitem apenas números
//            int numcpf = Integer.parseInt(tela.getjCpf().getText());
//            int numrg = Integer.parseInt(tela.getjRg().getText());
//            int numtel = Integer.parseInt(tela.getjTelefone().getText());
            if(!tela.getjCpf().getText().substring(0,tela.getjCpf().getText().length()).matches("[0-9]*"))
                y = 100/0;
            
            PessoaFisica cliente = new PessoaFisica(tela.getjCpf().getText(), tela.getjDataNascimento().getText(),
                                                    tela.getjOcupacao().getText(), tela.getjRg().getText(),
                                                    tela.getjTelefone().getText(), tela.getjNome().getText(),
                                                    tela.getjSenha().getText());
            tela.getClientes().add(cliente);
            tela.menuCadastraEndereco(cliente);
            tela.repaint(); 
        }
        
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios!");
        }
        
        catch(NumberFormatException a){
            JOptionPane.showMessageDialog(tela, "Um ou mais campos preenchidos incorretamente");
        }

            
        
    }
        
}
    
