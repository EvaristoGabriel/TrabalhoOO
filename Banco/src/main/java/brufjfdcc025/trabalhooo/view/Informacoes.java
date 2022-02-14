package brufjfdcc025.trabalhooo.view;

import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Informacoes implements ActionListener{
    private final Menu tela;
    private Cliente cliente;

    public Informacoes(Menu tela, Cliente cliente) {
        this.tela = tela;
        this.cliente=cliente;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            tela.painelInfo = new JPanel();
            tela.painelInfo.setLayout(new GridLayout(0,2));
            tela.jpMenuOpcoes.setVisible(false);
            tela.painelInfo.setVisible(true);
            System.out.println(cliente.toString());
            
            tela.painelInfo.add(new JLabel("Nome: "));
            tela.painelInfo.add(new JLabel(cliente.getNome()));
            tela.painelInfo.add(new JLabel("Telefone: "));
            tela.painelInfo.add(new JLabel(cliente.getTelefone()));
            tela.painelInfo.add(new JLabel("Numero da conta: "));
            tela.painelInfo.add(new JLabel(cliente.getConta().getNumero()));
            tela.painelInfo.add(new JLabel("Saldo: "));
            tela.painelInfo.add(new JLabel(String.valueOf(cliente.getConta().getSaldo())));
            tela.painelInfo.add(new JLabel("Bairro: "));
            tela.painelInfo.add(new JLabel(cliente.getEndereco().getBairro()));
            tela.painelInfo.add(new JLabel("Cep: "));
            tela.painelInfo.add(new JLabel(cliente.getEndereco().getCep()));
            tela.painelInfo.add(new JLabel("Cidade: "));
            tela.painelInfo.add(new JLabel(cliente.getEndereco().getCidade()));
            tela.painelInfo.add(new JLabel("Complemento: "));
            tela.painelInfo.add(new JLabel(cliente.getEndereco().getComplemento()));
            tela.painelInfo.add(new JLabel("Rua: "));
            tela.painelInfo.add(new JLabel(cliente.getEndereco().getRua()));
            tela.painelInfo.add(new JLabel("Numero: "));
            tela.painelInfo.add(new JLabel(String.valueOf(cliente.getEndereco().getNumero())));
            
            JButton voltar = new JButton("Voltar");
            voltar.addActionListener(new VoltarInfo(tela, cliente));
            tela.painelInfo.add(voltar);
            
            tela.add(tela.painelInfo);
            tela.repaint();
        } catch (Exception e) {
        }
    }
}
