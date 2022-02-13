package brufjfdcc025.trabalhooo.model;

import brufjfdcc025.trabalhooo.view.Menu;
import brufjfdcc025.trabalhooo.control.Arquivo;
import brufjfdcc025.trabalhooo.control.JSON;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import brufjfdcc025.trabalhooo.control.Propertys;
import com.sun.tools.sjavac.CleanProperties;
import java.util.ArrayList;

public class AtualizaDados implements WindowListener {

    private Menu tela;
    private static final String PessoaJuridica = "Juridica.json", PessoaFisica = "Fisica.json";

    public AtualizaDados(Menu tela) {
        this.tela = tela;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {
            String dados1 = Arquivo.lerArquivo(PessoaFisica);
            String dados2 = Arquivo.lerArquivo(PessoaJuridica);
            System.out.println("Dados1 = " + dados1);
            System.out.println("Dados2 = " + dados2);
//            Set<Cliente> clientes = JSON.toPessoaFisica(dados1);

//            List<Cliente> clientes = JSON.toPessoaFisica(dados1);
//            for(Cliente c : clientes){
//                System.out.println("dado1 c = "+c);
//                tela.getClientes().add(c);
//            }
//            
//            clientes = JSON.toPessoaJuridica(dados2);
//            for(Cliente c : clientes){
//                tela.getClientes().add(c);
//            }
//            for(Cliente c : tela.getClientes()){
//                System.out.println("C = "+c);
//            }
//            
            tela.addClientes(JSON.toPessoaFisica(dados1));
            tela.addClientes(JSON.toPessoaJuridica(dados2));
            System.out.println(tela.getClientes());

            tela.repaint();

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(tela, "Não foi possível ler os dados!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            List<Cliente> clientes = tela.getClientes();
//            List<Cliente> clienteF = new ArrayList<>();
//            List<Cliente> clienteJ = new ArrayList<>();

            for (Cliente c : clientes) {
                if (c.getTipo().equals("F")) {
                    String a = JSON.toJSON2(c);
                    Arquivo.escreverArquivo(PessoaFisica, a);
                } 
                else {
                    String b = JSON.toJSON2(c);
                    Arquivo.escreverArquivo(PessoaJuridica, b);
                }
            }
//            for(Cliente c : clientes){
//                if(c.getTipo().equals("F")){
//                    clienteF.add(c);
//                }
//                else{
//                    clienteJ.add(c);
//                }
//            }
//            String toJSON = JSON.toJSON(clienteF);
//            Arquivo.escreverArquivo(PessoaFisica, toJSON);
//            toJSON = JSON.toJSON(clienteJ);
//            Arquivo.escreverArquivo(PessoaJuridica, toJSON);
        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(tela, "Deu ruim!", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
