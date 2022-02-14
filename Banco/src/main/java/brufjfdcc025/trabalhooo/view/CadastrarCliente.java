package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.Endereco;
import brufjfdcc025.trabalhooo.control.Arquivo;
import brufjfdcc025.trabalhooo.control.JSON;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import brufjfdcc025.trabalhooo.model.PessoaJuridica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastrarCliente implements ActionListener {

    private final Menu tela;
    List<Cliente> clientes;
    private static final String caminho = "dados.json";
    Cliente cliente;

    public CadastrarCliente(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente = cliente;
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            
            //tratando campos vazios
            if(tela.getjCidade().getText().isEmpty() ||  tela.getjRua().getText().isEmpty() || 
                    tela.getjBairro().getText().isEmpty() ||  tela.getjCep().getText().isEmpty() || 
                    tela.getjNumero().getText().isEmpty()){
                    int x= 10/0;
            }
            //tratando campos que só pode números
            int num = Integer.parseInt(tela.getjNumero().getText());
            int numCep = Integer.parseInt(tela.getjCep().getText());
            
            //Cadastrar o cliente na lista de clientes
            Endereco end = new Endereco(tela.getjCidade().getText(), tela.getjRua().getText(),
                    tela.getjBairro().getText(), tela.getjCep().getText(),
                    num, tela.getjComplemento().getText());
            
            for(Cliente c : tela.getClientes())
            {
               if(c.getTipo().equals(cliente.getTipo()) && cliente.getTipo().equals("F")){
                   PessoaFisica p = (PessoaFisica) c;
                   PessoaFisica p2 = (PessoaFisica) cliente;
                   if(p.getCpf().equals(p2.getCpf())){
                        cliente.getConta().setNumero(String.valueOf(tela.getClientes().indexOf(c)));
                        break;
                   }
               }
               if(c.getTipo().equals(cliente.getTipo()) && cliente.getTipo().equals("J")){
                   PessoaJuridica p = (PessoaJuridica)c;
                   PessoaJuridica p2 = (PessoaJuridica)cliente;
                   if(p.getCnpj().equals(p2.getCnpj())){
                        cliente.getConta().setNumero(String.valueOf(tela.getClientes().indexOf(c)));
                        break;
                   }
               }
            }
            
            cliente.setEndereco(end);
             
            JOptionPane.showMessageDialog(tela, "Cadastro realizado!");
            String json = JSON.toJSON(clientes);
            Arquivo.escreverArquivo(caminho, json);
            tela.jpMenuEndereco.setVisible(false);
            tela.menuLogin();
            tela.repaint();

        } 
        
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(tela, "Não deixe campos vazios");
        } 
        
        catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(tela, "Um ou mais campos preenchidos incorretamente");
        } catch (IOException ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
//  
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(tela, "Não foi possível realizar o cadastro. Um ou mais campos preenchido incorretamente!");
//            tela.painel.setVisible(false);
//            tela.repaint();
//        }  
//  
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(tela, "Não foi possível realizar o cadastro. Um ou mais campos preenchido incorretamente!");
//            tela.painel.setVisible(false);
//            tela.repaint();
//        } 
    }
}
