package brufjfdcc025.trabalhooo.view;


//imports do swing
import brufjfdcc025.trabalhooo.model.AtualizaDados;
import brufjfdcc025.trabalhooo.model.Cliente;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import java.util.List;
import java.util.Set;
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
import javax.swing.JTable;
import static javax.swing.border.TitledBorder.LEFT;

public class Menu extends JFrame {


    
    List<Cliente> clientes;
    JList ListaClientes =new JList<>();

   //painel é o painel principal
    JPanel painel, painelRegistro, painelOperacoes, jpMenuEndereco,painelLogin, painelPossuiConta, 
            jpMenuInicial,PerguntaPessoa,jpMenuOpcoes,painelPix,painelTransferencia,painelExtrato,
            painelPagamento, painelInfo;
    int TAMANHO =15; //constante para tamanho dos campos de texto.//constante para tamanho dos campos de texto.
    
    JButton btnVoltar;

//CAMPOS DE TEXTO QUE APARECERAM NA INTERFACE.
    JTextField jBairro;
    JTextField jCep;
    JTextField jCidade;
    JTextField jCnpj;
    JTextField jComplemento;
    JTextField jCpf;
    JTextField jDataNascimento;
    JTextField jDeposito;
    JTextField jEmprestimo;    
    JTextField jNome;
    JTextField jNumero;
    JTextField jOcupacao;
    JTextField jPagamento;
    JTextField jPix;
    JTextField jRg;
    JTextField jRua;
    JTextField jSaque;
    JTextField jSenha;
    JTextField jTelefone;
    JTextField jTransferencias;
    JTextField jVerificarExtrato;
    JTextField jVerificarSaldo;
    JTextField valPix;
    JTextField valCpf;
    


    public Menu(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void menuPossuiConta(){
        this.painel.setVisible(true);
        painelPossuiConta = new JPanel();
        painelPossuiConta.setVisible(true);
        painelPossuiConta.setLayout(new GridLayout(0,1,10,10));
        JLabel titulo = new JLabel ("BEM-VINDO AO BANCO DCC025!");
        JLabel pergunta = new JLabel("        Já possui uma conta?");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(0,1,10,10));
        JButton btSim = new JButton("Sim");
        btSim.addActionListener(new Sim(this));
        JButton btNao = new JButton("Não");
        btNao.addActionListener(new Nao(this));
        
        painelBotoes.add(btSim);
        painelBotoes.add(btNao);
        
        painelPossuiConta.add(titulo);
        painelPossuiConta.add(pergunta);
        painelPossuiConta.add(painelBotoes);
        
        painel.add(painelPossuiConta, BorderLayout.CENTER);
    }
    
    public void menuLogin(){
        
        //this.jpMenuEndereco.setVisible(false);
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
        jCpf = new JTextField(TAMANHO);
        campos.add(jCpf);
        jSenha = new JTextField(TAMANHO);
        campos.add(jSenha);
        
        painelLogin.add(campos);
        
        JPanel painelBotoes = new JPanel();
        
        JButton btEntrar = new JButton("Entrar");
        btEntrar.addActionListener(new Entrar(this));
        painelBotoes.add(btEntrar);
        
        JButton btVoltarLogin = new JButton("Voltar");
        btVoltarLogin.addActionListener(new VoltarLogin(this));
        painelBotoes.add(btVoltarLogin);
     
        painelLogin.add(painelBotoes);
        
        this.add(painelLogin, BorderLayout.CENTER);
    }
    
    public void menuPerguntaPessoa(){
        this.painelPossuiConta.setVisible(false);
        PerguntaPessoa  = new JPanel();
        PerguntaPessoa.setVisible(true);
        PerguntaPessoa.setLayout(new GridLayout(5,3,20,20));
        JLabel pergunta = new JLabel("Que tipo de pessoa você é: ");
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(2,2,20,20));
        JButton btPFis = new JButton("Pessoa Física");
        btPFis.addActionListener(new CadastroPessoaFisica(this));
        JButton btPJuri = new JButton("Pessoa Jurídica");
        btPJuri.addActionListener(new CadastroPessoaJuridica(this));
        
        painelBotoes.add(btPFis);
        painelBotoes.add(btPJuri);
        
        PerguntaPessoa.add(pergunta);
        PerguntaPessoa.add(painelBotoes);
        
        this.add(PerguntaPessoa, BorderLayout.CENTER);
        
    }
    
    public void menuCadastraJuridica() {
        this.PerguntaPessoa.setVisible(false);
        
        jpMenuInicial = new JPanel(); //painel com dados do menu
        
        jpMenuInicial.setVisible(true);
        jpMenuInicial.setBorder(BorderFactory.createTitledBorder("FICHA CADASTRAL")); //titulo do formulario
        //jpMenuInicial.setLayout(new BorderLayout());
//        jpMenuInicial.setSize(new Dimension(450, 800));
        jpMenuInicial.setPreferredSize(new Dimension(500, 300));
        jpMenuInicial.setLayout(new GridLayout(14, 5));
        
        //adiciona os labels para e as caixas de texto para da campo.
        jpMenuInicial.add(new JLabel("Nome: "));
        jNome = new JTextField(TAMANHO);
        jpMenuInicial.add(jNome);

        jpMenuInicial.add(new JLabel("Senha:"));
        jSenha = new JTextField(TAMANHO);
        jpMenuInicial.add(jSenha);

        jpMenuInicial.add(new JLabel("Telefone: (apenas números) "));
        jTelefone = new JTextField(TAMANHO);
        jpMenuInicial.add(jTelefone);
        
        jpMenuInicial.add(new JLabel("CNPJ: (apenas números) "));
        jCnpj = new JTextField(TAMANHO);
        jpMenuInicial.add(jCnpj);
        
        this.add(jpMenuInicial, BorderLayout.CENTER);
        //botao para registrar cadastro
        JPanel btnPainel = new JPanel();

        JButton btnProximo = new JButton("Próximo");
        btnProximo.addActionListener(new ProximoJuridico(this));
        btnPainel.add(btnProximo); //adiciona ele no formulario
        
        JButton btnVolta = new JButton("Voltar");
        btnVolta.addActionListener(new VoltarCadastro(this));
        btnPainel.add(btnVolta);
        
        jpMenuInicial.add(btnPainel, BorderLayout.SOUTH);
       
    }
    
    public void menuCadastraFisica() {
        this.PerguntaPessoa.setVisible(false);
      
        jpMenuInicial = new JPanel(); //painel com dados do menu
        
        jpMenuInicial.setVisible(true);
        jpMenuInicial.setBorder(BorderFactory.createTitledBorder("FICHA CADASTRAL")); //titulo do formulario
        //jpMenuInicial.setLayout(new BorderLayout());
//        jpMenuInicial.setSize(new Dimension(450, 800));
        jpMenuInicial.setPreferredSize(new Dimension(500, 300));

        jpMenuInicial.setLayout(new GridLayout(12, 5));
        
        //adiciona os labels para e as caixas de texto para da campo.
        //cpf, nascimento,ocupacao,rg
        jpMenuInicial.add(new JLabel("Nome: "));
        jNome = new JTextField(TAMANHO);
        jpMenuInicial.add(jNome);

        jpMenuInicial.add(new JLabel("Senha:"));
        jSenha = new JTextField(TAMANHO);
        jpMenuInicial.add(jSenha);

        jpMenuInicial.add(new JLabel("Telefone: (apenas números) "));
        jTelefone = new JTextField(TAMANHO);
        jpMenuInicial.add(jTelefone);
        
        jpMenuInicial.add(new JLabel("CPF: (apenas números) "));
        jCpf = new JTextField(TAMANHO);
        jpMenuInicial.add(jCpf);
        
        jpMenuInicial.add(new JLabel("Ocupação: "));
        jOcupacao = new JTextField(TAMANHO);
        jpMenuInicial.add(jOcupacao);
        
        jpMenuInicial.add(new JLabel("Nascimento: "));
        jDataNascimento = new JTextField(TAMANHO);
        jpMenuInicial.add(jDataNascimento);
        
        jpMenuInicial.add(new JLabel("RG: (apenas números) "));
        jRg = new JTextField(TAMANHO);
        jpMenuInicial.add(jRg);
        
        this.add(jpMenuInicial, BorderLayout.CENTER);
        //botao para registrar cadastro
        JPanel btnPainel = new JPanel();
        
        JButton btnProximo = new JButton("Próximo");
        btnProximo.addActionListener(new ProximoFisico(this));
        btnPainel.add(btnProximo); //adiciona ele no formulario
        
        JButton btnVolta = new JButton("Voltar");
        btnVolta.addActionListener(new VoltarCadastro(this));
        btnPainel.add(btnVolta);
        
        jpMenuInicial.add(btnPainel, BorderLayout.SOUTH);
       
    }

    public void menuCadastraEndereco(Cliente cliente){
        this.jpMenuInicial.setVisible(false);
        
        jpMenuEndereco = new JPanel();
        jpMenuEndereco.setVisible(true);
        jpMenuEndereco.setBorder(BorderFactory.createTitledBorder("ENDEREÇO"));
//        jpMenuEndereco.setSize(new Dimension(450, 800));
        jpMenuEndereco.setPreferredSize(new Dimension(500, 300));
        jpMenuEndereco.setLayout(new GridLayout(12, 0));
        
        
        jpMenuEndereco.add(new JLabel("CEP: (apenas números) "));
        jCep = new JTextField(TAMANHO);
        jpMenuEndereco.add(jCep);

        jpMenuEndereco.add(new JLabel("Bairro: "));
        jBairro = new JTextField(TAMANHO);
        jpMenuEndereco.add(jBairro);

        jpMenuEndereco.add(new JLabel("Numero: (apenas números) "));
        jNumero = new JTextField(TAMANHO);
        jpMenuEndereco.add(jNumero);

        jpMenuEndereco.add(new JLabel("Complemento: (opcional)"));
        jComplemento = new JTextField(TAMANHO);
        jpMenuEndereco.add(jComplemento);

        jpMenuEndereco.add(new JLabel("Cidade: "));
        jCidade = new JTextField(TAMANHO);
        jpMenuEndereco.add(jCidade);

        jpMenuEndereco.add(new JLabel("Rua: "));
        jRua = new JTextField(TAMANHO);
        jpMenuEndereco.add(jRua);
        
        JPanel btnPainel = new JPanel();
        //falta fazer o action listener para ele realizar a acao.
        JButton btnCadastro = new JButton("Realizar Cadastro");
        btnCadastro.addActionListener(new CadastrarCliente(this, cliente));
        btnPainel.add(btnCadastro);
        
        jpMenuEndereco.add(btnPainel);
        
        this.add(jpMenuEndereco, BorderLayout.CENTER);
    }
    
    public void menuOpcoes(Cliente cliente) {
//        painelLogin.setVisible(false);
        
        jpMenuOpcoes = new JPanel();
        jpMenuOpcoes.setVisible(true);
        jpMenuOpcoes.setBorder(BorderFactory.createTitledBorder("Servicos:")); //borda com titulo
        jpMenuOpcoes.setLayout(new BorderLayout());
        
        JPanel btnPainel = new JPanel();
        JButton btnEmprestimo = new JButton("Emprestimo");
        JButton btnSaque = new JButton("Saque");
        JButton btnTransferencias = new JButton("Transferência");
        JButton btnPagamento = new JButton("Pagamento");
        JButton btnDeposito = new JButton("Depósito");
        JButton btnPix = new JButton("PIX");
        JButton btnVerificarExtrato = new JButton("Verificar Extrato");
        JButton btnVerificarSaldo = new JButton("Verificar Saldo");
        JButton btnSair = new JButton("Sair");
        JButton btnInfo = new JButton("Perfil");
        btnVoltar = new JButton ("Voltar");
        
        btnPainel.setLayout(new GridLayout(0, 2,10,10));
        btnPainel.add(btnEmprestimo);
        btnPainel.add(btnSaque);
        btnPainel.add(btnTransferencias);
        btnPainel.add(btnPagamento);
        btnPainel.add(btnDeposito);
        btnPainel.add(btnPix);
        btnPainel.add(btnVerificarExtrato);
        btnPainel.add(btnVerificarSaldo);
        btnPainel.add(btnInfo);
       // btnPainel.add(btnSair);
  
        
        jpMenuOpcoes.add(btnPainel, BorderLayout.NORTH);
        jpMenuOpcoes.add(btnSair,BorderLayout.SOUTH);
        btnVerificarExtrato.addActionListener(new VerificarExtrato(this,cliente));
        btnVerificarSaldo.addActionListener(new VerificarSaldo(this,cliente));
        btnPix.addActionListener(new Pix(this,cliente));
        btnTransferencias.addActionListener(new Transferencia(this,cliente));
        btnPagamento.addActionListener(new Pagamento(this, cliente));
        btnDeposito.addActionListener(new Deposito(this,cliente));
        btnSaque.addActionListener(new Saque(this,cliente));
        btnEmprestimo.addActionListener(new Emprestimo(this,cliente));
        btnSair.addActionListener(new Sair(this));
        btnInfo.addActionListener(new Informacoes(this,cliente));
        

        this.add(jpMenuOpcoes, BorderLayout.CENTER);
    }
    
    private void configuraClientes() {
        //frame = new JFrame();
        painel = new JPanel();
        painelOperacoes= new JPanel();
        //frame.getContentPane().add(painel);

    }

    private void configuraMenu() {
//        this.setSize(500,800); //tamanho em px da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        this.painel = new JPanel(); //painel 1
        this.painel.setLayout(new BorderLayout()); //referencia de onde sera adicionado o painel
        painelOperacoes= new JPanel(); //painel 2
         this.painelOperacoes.setLayout(new BorderLayout());
    }

    public void mostraMenu() {
        
        this.addWindowListener(new AtualizaDados(this));
        painel = new JPanel();
//        this.setSize(500,600);
        
        this.setPreferredSize(new Dimension(500, 500));
                
        this.setVisible(true);
        for(Cliente c: clientes)
            System.out.println(c);
        
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void addClientes(List<Cliente> clientes) {
         for(Cliente c : clientes){
                this.clientes.add(c);
            }
    }
    
    

    public JList getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(JList ListaClientes) {
        this.ListaClientes = ListaClientes;
    }
    
        public JTextField getjOcupacao() {
        return jOcupacao;
    }

    public void setjOcupacao(JTextField jOcupacao) {
        this.jOcupacao = jOcupacao;
    }

    public JTextField getjRg() {
        return jRg;
    }

    public void setjRg(JTextField jRg) {
        this.jRg = jRg;
    }

    public JTextField getValPix() {
        return valPix;
    }

    public void setValPix(JTextField valPix) {
        this.valPix = valPix;
    }

    public JTextField getValCpf() {
        return valCpf;
    }

    public void setValCpf(JTextField valCpf) {
        this.valCpf = valCpf;
    }
    
    
}
