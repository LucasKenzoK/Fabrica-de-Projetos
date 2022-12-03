package view;

import conexoes.MySQL;
import javax.swing.JOptionPane;
import model.Colaborador;
import model.Produto;

public class ViewHub extends javax.swing.JFrame {
 
        MySQL mySQLcon;
        Produto novoProduto;
        Colaborador novoColaborador;
        
    public ViewHub() {
        novoProduto = new Produto();
        mySQLcon = new MySQL();
        novoColaborador = new Colaborador();
        
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        tabs_config = new javax.swing.JTabbedPane();
        Creditos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnAtt2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        attdados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail_bsc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnAtt = new javax.swing.JButton();
        BtnAtt1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tabs_func = new javax.swing.JTabbedPane();
        Buscarprod = new javax.swing.JPanel();
        BtnAtt4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblCategoria = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Cadastrarprod = new javax.swing.JPanel();
        BtnAtt5 = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        lblSenha1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao1 = new javax.swing.JTextArea();
        lblCategoria1 = new javax.swing.JLabel();
        cbCategoria1 = new javax.swing.JComboBox<>();
        lblEstado1 = new javax.swing.JLabel();
        cbEstado1 = new javax.swing.JComboBox<>();
        lblValor1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        Deletar = new javax.swing.JButton();
        txtBuscarProduto = new javax.swing.JTextField();
        btnBuscarProduto1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        Creditos.setBackground(new java.awt.Color(142, 6, 216));
        Creditos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Creditos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("Lucas Kenzo Credendio Kuwajima");
        Creditos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 271, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("GRUPO CHALEIRA");
        Creditos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 304, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 255));
        jLabel3.setText("Gabriel Verlangieri de Sousa");
        Creditos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 271, -1));

        BtnAtt2.setText("Sair ");
        BtnAtt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt2ActionPerformed(evt);
            }
        });
        Creditos.add(BtnAtt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kjbhjb.png"))); // NOI18N
        Creditos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 340, 230));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 255));
        jLabel20.setText("Gabriel Alexandre Rosa");
        Creditos.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 271, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 255));
        jLabel21.setText("Felipe Portari Guimaraes dos Santos");
        Creditos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 330, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 153, 255));
        jLabel22.setText("Luana Landulpho Martini");
        Creditos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 271, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 255));
        jLabel24.setText("João Pedro Carvalho ");
        Creditos.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 271, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 255));
        jLabel23.setText("João Vitor Dinis da Silva ");
        Creditos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 271, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(4).png"))); // NOI18N
        Creditos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 770));

        tabs_config.addTab("Creditos", Creditos);

        attdados.setBackground(new java.awt.Color(142, 6, 216));
        attdados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        attdados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Buscar Pelo E-mail:");
        attdados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        txtEmail_bsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_bscActionPerformed(evt);
            }
        });
        attdados.add(txtEmail_bsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 250, 30));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        attdados.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 80, 30));

        txtSenha.setForeground(new java.awt.Color(255, 153, 255));
        attdados.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 270, 40));

        txtNome.setForeground(new java.awt.Color(255, 153, 255));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        attdados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 270, 40));

        txtEmail.setForeground(new java.awt.Color(255, 153, 255));
        attdados.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 270, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 255));
        jLabel5.setText("Senha:");
        attdados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 255));
        jLabel6.setText("Nome:");
        attdados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 255));
        jLabel7.setText("Email:");
        attdados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 70, 30));

        BtnAtt.setText("Sair ");
        BtnAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAttActionPerformed(evt);
            }
        });
        attdados.add(BtnAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 80, 30));

        BtnAtt1.setText("Atualizar ");
        BtnAtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt1ActionPerformed(evt);
            }
        });
        attdados.add(BtnAtt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 110, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kjbhjb.png"))); // NOI18N
        attdados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 340, 230));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(4).png"))); // NOI18N
        attdados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 770));

        tabs_config.addTab("Atualizar Dados", attdados);

        jTabbedPane3.addTab("Configurações", tabs_config);
        tabs_config.getAccessibleContext().setAccessibleDescription("");

        Buscarprod.setBackground(new java.awt.Color(142, 6, 216));
        Buscarprod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAtt4.setText("Sair ");
        BtnAtt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt4ActionPerformed(evt);
            }
        });
        Buscarprod.add(BtnAtt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 80, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Buscar pelo produto :");
        Buscarprod.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        Buscarprod.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 320, 30));

        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });
        Buscarprod.add(btnBuscarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 110, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 255));
        jLabel16.setText("Produto :");
        Buscarprod.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        Buscarprod.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 30));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 153, 255));
        lblSenha.setText("Descrição :");
        Buscarprod.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        Buscarprod.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, 110));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 153, 255));
        lblCategoria.setText("Categoria :");
        Buscarprod.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 153, 255));
        lblEstado.setText("Estado :");
        Buscarprod.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 153, 255));
        lblValor.setText("Valor :");
        Buscarprod.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        cbCategoria.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SETOR", "A", "B", "C", "D", "F" }));
        Buscarprod.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 140, 40));

        cbEstado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wanel Ville", "Campolim", "Central Parque", "Esmeralda", "Trujillo" }));
        Buscarprod.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 140, 40));

        txtValor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Buscarprod.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 140, 40));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        Buscarprod.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 90, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kjbhjb.png"))); // NOI18N
        Buscarprod.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 340, 230));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(4).png"))); // NOI18N
        Buscarprod.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 770));

        tabs_func.addTab("Buscar Produto", Buscarprod);

        Cadastrarprod.setBackground(new java.awt.Color(142, 6, 216));
        Cadastrarprod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAtt5.setText("Sair ");
        BtnAtt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt5ActionPerformed(evt);
            }
        });
        Cadastrarprod.add(BtnAtt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 80, 30));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 153, 255));
        lblNome.setText("Produto :");
        Cadastrarprod.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));
        Cadastrarprod.add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 310, 40));

        lblSenha1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSenha1.setForeground(new java.awt.Color(255, 153, 255));
        lblSenha1.setText("Descrição :");
        Cadastrarprod.add(lblSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtDescricao1.setColumns(20);
        txtDescricao1.setRows(5);
        jScrollPane2.setViewportView(txtDescricao1);

        Cadastrarprod.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 310, 110));

        lblCategoria1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCategoria1.setForeground(new java.awt.Color(255, 153, 255));
        lblCategoria1.setText("Categoria :");
        Cadastrarprod.add(lblCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        cbCategoria1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informática", "Esportes", "Eletrodomesticos", "Livros", "Games", "Casa" }));
        Cadastrarprod.add(cbCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 140, 40));

        lblEstado1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(255, 153, 255));
        lblEstado1.setText("Estado :");
        Cadastrarprod.add(lblEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        cbEstado1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));
        Cadastrarprod.add(cbEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 140, 40));

        lblValor1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValor1.setForeground(new java.awt.Color(255, 153, 255));
        lblValor1.setText("Valor :");
        Cadastrarprod.add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        txtValor1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Cadastrarprod.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 140, 40));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        Cadastrarprod.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 80, 30));
        btnCadastrar.getAccessibleContext().setAccessibleName("Cadastrar");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        Cadastrarprod.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 80, 30));

        Deletar.setText("Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });
        Cadastrarprod.add(Deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 80, 30));
        Cadastrarprod.add(txtBuscarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 30));

        btnBuscarProduto1.setText("Buscar");
        btnBuscarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProduto1ActionPerformed(evt);
            }
        });
        Cadastrarprod.add(btnBuscarProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 80, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Editar produto :");
        Cadastrarprod.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kjbhjb.png"))); // NOI18N
        Cadastrarprod.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 340, 230));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(4).png"))); // NOI18N
        Cadastrarprod.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 770));

        tabs_func.addTab("Cadastrar Produto", Cadastrarprod);

        jTabbedPane3.addTab("Fuções", tabs_func);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));
        jTabbedPane3.getAccessibleContext().setAccessibleName("Configurações");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(3).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_bscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_bscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_bscActionPerformed
    public void apagaFormBusca() {
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");    
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mySQLcon.conectaBanco();
        novoProduto = new Produto();
        novoColaborador = new Colaborador();
        String email = txtEmail_bsc.getText();
        
        try {
            this.mySQLcon.executarSQL(
                   "SELECT "
                    + "nome,"                    
                    + "email,"
                    + "senha"        
                 + " FROM"
                     + " cadastro "
                 + "WHERE"
                     + " email = '" + email + "'"
                + ";"
            );
            
            while(mySQLcon.getResultSet().next()) {
                novoColaborador.setNome(mySQLcon.getResultSet().getString(1));
                novoColaborador.setEmail(mySQLcon.getResultSet().getString(2));
                novoColaborador.setSenha(mySQLcon.getResultSet().getString(3));
            }
            
            if (novoColaborador.getEmail().equals("")) {
                 JOptionPane.showMessageDialog(null, "Nao encontrado");
            } else {
                txtNome.setText(novoColaborador.getNome());
                txtEmail.setText(novoColaborador.getEmail());
                txtSenha.setText(novoColaborador.getSenha());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na Busca");
        } finally {
           mySQLcon.fechaBanco(); 
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void BtnAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAttActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnAttActionPerformed

    private void BtnAtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt1ActionPerformed
        boolean status = false;
        mySQLcon.conectaBanco();
        String email = txtEmail.getText();
        
        try {
            status = this.mySQLcon.updateSQL(            
                    "UPDATE cadastro SET "                    
                    + "nome = '" + txtNome.getText() + "',"
                    + "email = '" + txtEmail.getText()+ "',"
                    + "senha = '" + txtSenha.getText() + "'"
                + " WHERE "
                    + "email = '" + email + "'"
                + ";"
                  
            );
            
            if (status == true) {
               JOptionPane.showMessageDialog(null, "Atualizacao realizada com sucesso"); 
            } else {
              JOptionPane.showMessageDialog(null, "Houve um problema na Atualizacao");  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na Atualizacao");
        } finally {
            apagaFormBusca();
            mySQLcon.fechaBanco();
        } 
    }//GEN-LAST:event_BtnAtt1ActionPerformed

    private void BtnAtt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnAtt2ActionPerformed

    private void BtnAtt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt4ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_BtnAtt4ActionPerformed

    private void BtnAtt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt5ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_BtnAtt5ActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        // TODO add your handling code here:
        
        mySQLcon.conectaBanco();
        novoProduto = new Produto ();
        
        String produto = txtBusca.getText();
        
        try {
            this.mySQLcon.executarSQL(
                   "SELECT "
                    + " nome,"                    
                    + " categoria,"
                    + " estado,"
                    + " descricao, "     
                    + " valor "        
                 + " FROM"
                     + " produtos "
                 + " WHERE"
                     + " nome = '" + produto + "'"
                + ";"
            );
            
            while(mySQLcon.getResultSet().next()) {
                novoProduto.setProduto(mySQLcon.getResultSet().getString(1));
                novoProduto.setCategoria(mySQLcon.getResultSet().getString(2));
                novoProduto.setEstado(mySQLcon.getResultSet().getString(3));
                novoProduto.setDescricao(mySQLcon.getResultSet().getString(4));
                novoProduto.setValor(Double.parseDouble(mySQLcon.getResultSet().getString(5))); 
            }
            
            if (novoProduto.getProduto().equals("")) {
                 JOptionPane.showMessageDialog(null, "Produto nao encontrado");
            } else {
                txtProduto.setText(novoProduto.getProduto());
                cbCategoria.setSelectedItem(novoProduto.getCategoria());
                cbEstado.setSelectedItem(novoProduto.getEstado());
                txtDescricao.setText(novoProduto.getDescricao());
                txtValor.setText(Double.toString(novoProduto.getValor()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na Busca");
        } finally {
           mySQLcon.fechaBanco(); 
        }  
        
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:

        int status = 0;

        this.mySQLcon.conectaBanco();

        novoProduto = new Produto();
        novoProduto.setProduto(txtNome1.getText());
        novoProduto.setCategoria((String)cbCategoria1.getSelectedItem());
        novoProduto.setEstado((String)cbEstado1.getSelectedItem());
        novoProduto.setDescricao(txtDescricao1.getText());
        novoProduto.setValor(Double.parseDouble(txtValor1.getText()));

        try{
            this.mySQLcon.insertSQL("INSERT INTO produtos("
                + "nome,"
                + "categoria,"
                + "estado,"
                + "descricao,"
                + "valor "
                + ") VALUES ("
                + "'" + novoProduto.getProduto() + "',"
                + "'" + novoProduto.getCategoria()+ "',"
                + "'" + novoProduto.getEstado()+ "',"
                + "'" + novoProduto.getDescricao()+ "',"
                + "'" + novoProduto.getValor()+ "'"
                + ");");

            if (status == 1){
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            }
            else{
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

            }

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto");
        } finally{
            this.mySQLcon.fechaBanco();

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:

        boolean status = false;
        mySQLcon.conectaBanco();

        String produto = txtBuscarProduto.getText();

        try {
            status = this.mySQLcon.updateSQL(

                "UPDATE produtos SET "
                + "nome = '" + txtNome1.getText()+ "',"
                + "categoria = '" + cbCategoria1.getSelectedItem()+ "',"
                + "estado= '" + cbEstado1.getSelectedItem() + "',"
                + "descricao= '" + txtDescricao1.getText()+"',"
                + "valor= '" + txtValor1.getText()+"'"
                + " WHERE "
                + "nome = '" + produto + "'"
                + ";"

            );

            if (status == true) {
                JOptionPane.showMessageDialog(null, "Atualizacao realizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um problema na Atualizacao");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na Atualizacao");
        } finally {
            mySQLcon.fechaBanco();

        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        // TODO add your handling code here:

        boolean status = false;

        mySQLcon.conectaBanco();

        String produto = txtBuscarProduto.getText();

        try {
            status = this.mySQLcon.updateSQL(
                "DELETE FROM produtos "
                + " WHERE "
                + "nome = '" + produto + "'"
                + ";");

            if (status) {
                JOptionPane.showMessageDialog(null, "Cliente apagado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um problema ao apagar o registro");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o registro");
        } finally {
            mySQLcon.fechaBanco();
        }

    }//GEN-LAST:event_DeletarActionPerformed

    private void btnBuscarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProduto1ActionPerformed
        // TODO add your handling code here:
        
        mySQLcon.conectaBanco();
        novoProduto = new Produto ();
        
        String produto = txtBuscarProduto.getText();
        
        try {
            this.mySQLcon.executarSQL(
                   "SELECT "
                    + " nome,"                    
                    + " categoria,"
                    + " estado,"
                    + " descricao, "     
                    + " valor "        
                 + " FROM"
                     + " produtos "
                 + " WHERE"
                     + " nome = '" + produto + "'"
                + ";"
            );
            
            while(mySQLcon.getResultSet().next()) {
                novoProduto.setProduto(mySQLcon.getResultSet().getString(1));
                novoProduto.setCategoria(mySQLcon.getResultSet().getString(2));
                novoProduto.setEstado(mySQLcon.getResultSet().getString(3));
                novoProduto.setDescricao(mySQLcon.getResultSet().getString(4));
                novoProduto.setValor(Double.parseDouble(mySQLcon.getResultSet().getString(5))); 
            }
            
            if (novoProduto.getProduto().equals("")) {
                 JOptionPane.showMessageDialog(null, "Patrimonio nao encontrado");
            } else {
                txtBuscarProduto.setText(novoProduto.getProduto());
                cbCategoria1.setSelectedItem(novoProduto.getCategoria());
                cbEstado1.setSelectedItem(novoProduto.getEstado());
                txtDescricao1.setText(novoProduto.getDescricao());
                txtValor1.setText(Double.toString(novoProduto.getValor()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na Busca");
        } finally {
          
           mySQLcon.fechaBanco(); 
        }  
        
    }//GEN-LAST:event_btnBuscarProduto1ActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        
         boolean status = false;

        mySQLcon.conectaBanco();

        String produto = txtBuscarProduto.getText();

        try {
            status = this.mySQLcon.updateSQL(
                "DELETE FROM produtos "
                + " WHERE "
                + "nome = '" + produto + "'"
                + ";");

            if (status) {
                   
            } else {
                
            }
        } catch (Exception e) {
            
        } finally {
            new ViewCompra().setVisible(true);
            mySQLcon.fechaBanco();
        }
        
  
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtt;
    private javax.swing.JButton BtnAtt1;
    private javax.swing.JButton BtnAtt2;
    private javax.swing.JButton BtnAtt4;
    private javax.swing.JButton BtnAtt5;
    private javax.swing.JPanel Buscarprod;
    private javax.swing.JPanel Cadastrarprod;
    private javax.swing.JPanel Creditos;
    private javax.swing.JButton Deletar;
    private javax.swing.JPanel attdados;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnBuscarProduto1;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbCategoria1;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbEstado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JTabbedPane tabs_config;
    private javax.swing.JTabbedPane tabs_func;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtBuscarProduto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextArea txtDescricao1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail_bsc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}
