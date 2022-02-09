package brufjfdcc025.trabalhooo;

import brufjfdcc025.trabalhooo.control.Arquivo;
import brufjfdcc025.trabalhooo.control.JSON;
import brufjfdcc025.trabalhooo.view.Menu;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class AtualizaDados implements WindowListener{

    private Menu tela;
    private static  final String caminho = "dados.json";

    public AtualizaDados(Menu tela) {
        this.tela = tela;
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        try {
            String dados = Arquivo.lerArquivo(caminho);
            Set<Cliente> clientes = JSON.toClientes(dados);
            
            for(Cliente c : clientes){
                tela.getClientes().add(c);
            }
            tela.repaint();
            
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(tela, "Não foi possível ler os dados!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            ListModel<Cliente> modelo = tela.getListaClientes().getModel();
            Set<Cliente> clientes = new HashSet<>();

            for(int i=0; i< modelo.getSize(); i++){
                clientes.add(modelo.getElementAt(i));
            }

            String toJSON = JSON.toJSON(clientes);
            Arquivo.escreverArquivo(caminho, toJSON);
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(tela, "Não foi possível salvar os dados!", "ERROR", JOptionPane.ERROR_MESSAGE);
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
