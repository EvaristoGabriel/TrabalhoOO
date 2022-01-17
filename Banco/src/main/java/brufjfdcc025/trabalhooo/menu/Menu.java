/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brufjfdcc025.trabalhooo.menu;
//imports do swing
import brufjfdcc025.trabalhooo.Cliente;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import static javax.swing.border.TitledBorder.LEFT;

/**
 *
 * @author Israel Louback
 */
public class Menu extends JFrame {

   // JList<Cliente> listaClientes;
   // JFrame frame;
    JPanel painel;
    JPanel painel2;
    int TAMANHO =15; //constante para tamanho dos campos de texto.
//CAMPOS DE TEXTO QUE APARECERAM NA INTERFACE.
    JTextField jNome;
    JTextField jCpf;
    JTextField jDataNascimento;
    JTextField jTelefone;
    JTextField jCidade;
    JTextField jBairro;
    JTextField jRua;
    JTextField jComplemento;
    JTextField jNumero;
    JTextField jCep;
    JTextField jSenha;
    JTextField jCnpj;
    JTextField jTransferencias;
    JTextField jPagamento;
    JTextField jDeposito;
    JTextField jPix;
    JTextField jVerificarExtrato;
    JTextField jVerificarSaldo;
    JTextField jSaque;
    JTextField jEmprestimo;

    //getters e setters dos campos
    public JTextField getjNome() {
        return jNome;
    }

    public void setjNome(JTextField jNome) {
        this.jNome = jNome;
    }

    public JTextField getjCpf() {
        return jCpf;
    }

    public void setjCpf(JTextField jCpf) {
        this.jCpf = jCpf;
    }

    public JTextField getjDataNascimento() {
        return jDataNascimento;
    }

    public void setjDataNascimento(JTextField jDataNascimento) {
        this.jDataNascimento = jDataNascimento;
    }

    public JTextField getjTelefone() {
        return jTelefone;
    }

    public void setjTelefone(JTextField jTelefone) {
        this.jTelefone = jTelefone;
    }

    public JTextField getjCidade() {
        return jCidade;
    }

    public void setjCidade(JTextField jCidade) {
        this.jCidade = jCidade;
    }

    public JTextField getjBairro() {
        return jBairro;
    }

    public void setjBairro(JTextField jBairro) {
        this.jBairro = jBairro;
    }

    public JTextField getjRua() {
        return jRua;
    }

    public void setjRua(JTextField jRua) {
        this.jRua = jRua;
    }

    public JTextField getjComplemento() {
        return jComplemento;
    }

    public void setjComplemento(JTextField jComplemento) {
        this.jComplemento = jComplemento;
    }

    public JTextField getjNumero() {
        return jNumero;
    }

    public void setjNumero(JTextField jNumero) {
        this.jNumero = jNumero;
    }

    public JTextField getjCep() {
        return jCep;
    }

    public void setjCep(JTextField jCep) {
        this.jCep = jCep;
    }

    public JTextField getjSenha() {
        return jSenha;
    }

    public void setjSenha(JTextField jSenha) {
        this.jSenha = jSenha;
    }

    public JTextField getjCnpj() {
        return jCnpj;
    }

    public void setjCnpj(JTextField jCnpj) {
        this.jCnpj = jCnpj;
    }

    public JTextField getjTransferencias() {
        return jTransferencias;
    }

    public void setjTransferencias(JTextField jTransferencias) {
        this.jTransferencias = jTransferencias;
    }

    public JTextField getjPagamento() {
        return jPagamento;
    }

    public void setjPagamento(JTextField jPagamento) {
        this.jPagamento = jPagamento;
    }

    public JTextField getjDeposito() {
        return jDeposito;
    }

    public void setjDeposito(JTextField jDeposito) {
        this.jDeposito = jDeposito;
    }

    public JTextField getjPix() {
        return jPix;
    }

    public void setjPix(JTextField jPix) {
        this.jPix = jPix;
    }

    public JTextField getjVerificarExtrato() {
        return jVerificarExtrato;
    }

    public void setjVerificarExtrato(JTextField jVerificarExtrato) {
        this.jVerificarExtrato = jVerificarExtrato;
    }

    public JTextField getjVerificarSaldo() {
        return jVerificarSaldo;
    }

    public void setjVerificarSaldo(JTextField jVerificarSaldo) {
        this.jVerificarSaldo = jVerificarSaldo;
    }

    public JTextField getjSaque() {
        return jSaque;
    }

    public void setjSaque(JTextField jSaque) {
        this.jSaque = jSaque;
    }

    public JTextField getjEmprestimo() {
        return jEmprestimo;
    }

    public void setjEmprestimo(JTextField jEmprestimo) {
        this.jEmprestimo = jEmprestimo;
    }
    

    private void menuInicial() {
          
        JPanel jpMenuInicial = new JPanel(); //painel com dados do menu
        jpMenuInicial.setBorder(BorderFactory.createTitledBorder("FICHA CADASTRAL")); //titulo do formulario
        //jpMenuInicial.setLayout(new BorderLayout());
        jpMenuInicial.setPreferredSize(new Dimension(450, 800));
        jpMenuInicial.setLayout(new GridLayout(25, 5));
        
        
        //adiciona os labels para e as caixas de texto para da campo.
        jpMenuInicial.add(new JLabel("Nome: "));
        jNome = new JTextField(TAMANHO);
        jpMenuInicial.add(jNome);

        jpMenuInicial.add(new JLabel("Data de Nascimento: "));
        jDataNascimento = new JTextField(TAMANHO);
        jpMenuInicial.add(jDataNascimento);

        jpMenuInicial.add(new JLabel("CEP: "));
        jCep = new JTextField(TAMANHO);
        jpMenuInicial.add(jCep);

        jpMenuInicial.add(new JLabel("CPF: "));
        jCpf = new JTextField(TAMANHO);
        jpMenuInicial.add(jCpf);

        jpMenuInicial.add(new JLabel("Bairro: "));
        jBairro = new JTextField(TAMANHO);
        jpMenuInicial.add(jBairro);

        jpMenuInicial.add(new JLabel("Numero: "));
        jNumero = new JTextField(TAMANHO);
        jpMenuInicial.add(jNumero);

        jpMenuInicial.add(new JLabel("Complemento: "));
        jComplemento = new JTextField(TAMANHO);
        jpMenuInicial.add(jComplemento);

        jpMenuInicial.add(new JLabel("Senha: "));
        jSenha = new JTextField(TAMANHO);
        jpMenuInicial.add(jSenha);

        //jpMenuInicial.add(new JLabel("CNPJ: "));
        //jCnpj = new JTextField(size);
        //jpMenuInicial.add(jCnpj);
        jpMenuInicial.add(new JLabel("Cidade: "));
        jCidade = new JTextField(TAMANHO);
        jpMenuInicial.add(jCidade);

        jpMenuInicial.add(new JLabel("Rua: "));
        jRua = new JTextField(TAMANHO);
        jpMenuInicial.add(jRua);

        jpMenuInicial.add(new JLabel("Telefone: "));
        jTelefone = new JTextField(TAMANHO);
        jpMenuInicial.add(jTelefone);

        painel.add(jpMenuInicial, BorderLayout.CENTER);
        //botao para registrar cadastro
        JPanel btnPainel = new JPanel();
        //falta fazer o action listener para ele realizar a acao.
        JButton btnCadastro = new JButton("Realizar Cadastro");
        btnPainel.add(btnCadastro); //adiciona ele no formulario
        jpMenuInicial.add(btnPainel, BorderLayout.SOUTH);
    }

    private void menuOpcoes() {
        JPanel jpMenuOpcoes = new JPanel();
        jpMenuOpcoes.setBorder(BorderFactory.createTitledBorder("Servicos:")); //borda com titulo
        jpMenuOpcoes.setLayout(new BorderLayout());
        jpMenuOpcoes.setPreferredSize(new Dimension(250, 230)); //dimensao preferida do jpane

        JScrollPane listaPanel = new JScrollPane();

        //listaClientes = new JList<>(); //lista para armazenar os clientes
       // listaPanel.add(listaClientes);

        jpMenuOpcoes.add(listaPanel, BorderLayout.CENTER);
       //cria os botoes para cada operacao e adiciona eles no painel
        JPanel btnPainel = new JPanel();
        JButton btnEmprestimo = new JButton("Emprestimo");
        JButton btnSaque = new JButton("Saque");
        JButton btnTransferencias = new JButton("Transferencias");
        JButton btnPagamento = new JButton("Pagamento");
        JButton btnDeposito = new JButton("Deposito");
        JButton btnPix = new JButton("PIX");
        JButton btnVerificarExtrato = new JButton("Verificar Extrato");
        JButton btnVerificarSaldo = new JButton("Verificar Saldo");
        btnPainel.setLayout(new GridLayout(10, 5));
        btnPainel.add(btnEmprestimo);
        btnPainel.add(btnSaque);
        btnPainel.add(btnTransferencias);
        btnPainel.add(btnPagamento);
        btnPainel.add(btnDeposito);
        btnPainel.add(btnPix);
        btnPainel.add(btnVerificarExtrato);
        btnPainel.add(btnVerificarSaldo);

        jpMenuOpcoes.add(btnPainel, BorderLayout.NORTH);

        painel2.add(jpMenuOpcoes, BorderLayout.CENTER);
    }

    private void configuraClientes() {
        //frame = new JFrame();
        painel = new JPanel();
        painel2= new JPanel();
        //frame.getContentPane().add(painel);

    }

    private void configuraMenu() {
        this.setSize(500,800); //tamanho em px da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        this.painel = new JPanel(); //painel 1
        this.painel.setLayout(new BorderLayout()); //referencia de onde sera adicionado o painel
        this.painel2= new JPanel(); //painel 2
         this.painel2.setLayout(new BorderLayout());
    }

    public void montaMenu() {
        //chama os metodos para configurar o menu
        configuraMenu();
        configuraClientes();
        menuInicial();
        menuOpcoes();
        mostraMenu();
    }

    public void mostraMenu() {
        this.add(painel); //adiciona menu inicial
        this.setVisible(true); //torna-o visivel
        this.add(painel2);//adiciona menu opcoes
        this.setVisible(true);//torna-o visivel
    }

}
