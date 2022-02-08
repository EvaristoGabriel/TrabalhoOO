package brufjfdcc025.trabalhooo.view;
//imports do swing
import brufjfdcc025.trabalhooo.AtualizaDados;
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
import javax.swing.JOptionPane;
import static javax.swing.border.TitledBorder.LEFT;

/**
 *
 * @author Israel Louback
 */
public class Menu extends JFrame {

   JList<Cliente> listaClientes;
   // JFrame frame;
   //painel é o painel principal
    JPanel painel, painelRegistro, painelOperacoes,painelLogin, painelPossuiConta;
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

    public void menuPossuiConta(){
        painelPossuiConta = new JPanel();
        painelPossuiConta.setVisible(true);
        painelPossuiConta.setLayout(new GridLayout(0,1,10,10));
        JLabel pergunta = new JLabel("Já possui uma conta?");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(0,1,10,10));
        JButton btSim = new JButton("Sim");
        btSim.addActionListener(new BotaoSim(this));
        JButton btNao = new JButton("Não");
        btNao.addActionListener(new BotaoNao(this));
        
        painelBotoes.add(btSim);
        painelBotoes.add(btNao);
        
        painelPossuiConta.add(pergunta);
        painelPossuiConta.add(painelBotoes);
        
        painel.add(painelPossuiConta, BorderLayout.CENTER);
    }
    
    public void menuLogin(){
        painelLogin = new JPanel();
        painelLogin.setVisible(true);
        JPanel label = new JPanel();
        label.setLayout(new GridLayout(0,1,10,10));
        JLabel cpf = new JLabel("CPF/CNPJ:");
        label.add(cpf);
        JLabel senha = new JLabel("Senha:");
        label.add(senha);
        
        painelLogin.add(label);
        
        JPanel campos = new JPanel();
        campos.setLayout(new GridLayout(0,1,10,10));
        JTextField jtCpf = new JTextField(TAMANHO);
        campos.add(jtCpf);
        JTextField jtSenha = new JTextField(TAMANHO);
        campos.add(jtSenha);
        
        painelLogin.add(campos);
        
        JPanel painelBotoes = new JPanel();
        JButton btEntrar = new JButton("Entrar");
        //btEntrar.addActionListener(new BotaoEntrar(this));
        painelBotoes.add(btEntrar);
        
        painelLogin.add(painelBotoes);
        
        this.add(painelLogin, BorderLayout.CENTER);
    }
    
    public void menuPerguntaPessoa(){
        JPanel PerguntaPessoa = new JPanel();
        PerguntaPessoa.setLayout(new GridLayout(0,1,10,10));
        JLabel pergunta = new JLabel("Que tipo de pessoa você é: ");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(0,1,10,10));
        JButton btPFis = new JButton("Pessoa Física");
        JButton btPJuri = new JButton("Pessoa Jurídica");
        
        painelBotoes.add(btPFis);
        painelBotoes.add(btPJuri);
        
        PerguntaPessoa.add(pergunta);
        PerguntaPessoa.add(painelBotoes);
        
        painel.add(PerguntaPessoa, BorderLayout.CENTER);
        
    }
    
    public void menuCadastra() {
          
        JPanel jpMenuInicial = new JPanel(); //painel com dados do menu
        jpMenuInicial.setVisible(true);
        jpMenuInicial.setBorder(BorderFactory.createTitledBorder("FICHA CADASTRAL")); //titulo do formulario
        //jpMenuInicial.setLayout(new BorderLayout());
        jpMenuInicial.setSize(new Dimension(450, 800));
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

        this.add(jpMenuInicial, BorderLayout.CENTER);
        //botao para registrar cadastro
        JPanel btnPainel = new JPanel();
        //falta fazer o action listener para ele realizar a acao.
        JButton btnCadastro = new JButton("Realizar Cadastro");
        btnPainel.add(btnCadastro); //adiciona ele no formulario
        jpMenuInicial.add(btnPainel, BorderLayout.SOUTH);
    }
    
    public void menuOpcoes() {
        JPanel jpMenuOpcoes = new JPanel();
        jpMenuOpcoes.setVisible(true);
        jpMenuOpcoes.setBorder(BorderFactory.createTitledBorder("Servicos:")); //borda com titulo
        jpMenuOpcoes.setLayout(new BorderLayout());
        //jpMenuOpcoes.setPreferredSize(new Dimension(250, 230)); //dimensao preferida do jpane

        //JScrollPane listaPanel = new JScrollPane();

        //listaClientes = new JList<>(); //lista para armazenar os clientes
       // listaPanel.add(listaClientes);

        //jpMenuOpcoes.add(listaPanel, BorderLayout.CENTER);
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
        btnPainel.setLayout(new GridLayout(0, 2,10,10));
        btnPainel.add(btnEmprestimo);
        btnPainel.add(btnSaque);
        btnPainel.add(btnTransferencias);
        btnPainel.add(btnPagamento);
        btnPainel.add(btnDeposito);
        btnPainel.add(btnPix);
        btnPainel.add(btnVerificarExtrato);
        btnPainel.add(btnVerificarSaldo);

        jpMenuOpcoes.add(btnPainel, BorderLayout.NORTH);

        painel.add(jpMenuOpcoes, BorderLayout.CENTER);
    }
    
    private void configuraClientes() {
        //frame = new JFrame();
        painel = new JPanel();
        painelOperacoes= new JPanel();
        //frame.getContentPane().add(painel);

    }

    private void configuraMenu() {
        this.setSize(500,800); //tamanho em px da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        this.painel = new JPanel(); //painel 1
        this.painel.setLayout(new BorderLayout()); //referencia de onde sera adicionado o painel
        painelOperacoes= new JPanel(); //painel 2
         this.painelOperacoes.setLayout(new BorderLayout());
    }

    public void mostraMenu() {
        this.setSize(500,600);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(500, 300));
        
        
        //this.addWindowListener(new AtualizaDados(this));
        
        painel = new JPanel();
        
        //this.painel.setLayout(new BorderLayout());
        
        menuPossuiConta();
        
        this.add(this.painel);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.pack();
        this.setLocationRelativeTo(null);
        
        this.repaint();
    }
    
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

    public JList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(JList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
