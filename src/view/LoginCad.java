/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import conexoes.MySQL;
import javax.swing.JOptionPane;
import model.Colaborador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginCad extends javax.swing.JFrame {

    MySQL mySQLcon;
    Colaborador novoColaborador;
    
    public LoginCad() {
        
        mySQLcon = new MySQL();
        novoColaborador = new Colaborador();
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnAtt1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BtnAtt2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtSenha_log = new javax.swing.JTextField();
        txtEmail_log = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnAtt3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setToolTipText("");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel4.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, 40));
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 270, 40));
        jPanel4.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 255));
        jLabel5.setText("Senha:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 255));
        jLabel7.setText("Email:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 255));
        jLabel6.setText("Nome:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, 30));

        BtnAtt1.setText("Cadastrar ");
        BtnAtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt1ActionPerformed(evt);
            }
        });
        jPanel4.add(BtnAtt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Cadastro:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        BtnAtt2.setText("Sair ");
        BtnAtt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt2ActionPerformed(evt);
            }
        });
        jPanel4.add(BtnAtt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 80, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(4).png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 720));

        jTabbedPane1.addTab("Cadastro", null, jPanel4, "");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 30));

        txtSenha_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha_logActionPerformed(evt);
            }
        });
        jPanel3.add(txtSenha_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 270, 40));

        txtEmail_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_logActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 270, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Login:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 255));
        jLabel8.setText("Senha:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 255));
        jLabel11.setText("Email:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 70, 30));

        BtnAtt3.setText("Sair ");
        BtnAtt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtt3ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnAtt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 80, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(4).png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 720));

        jTabbedPane1.addTab("Login", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 500, 500));
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome (2).png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_logActionPerformed

    private void txtSenha_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha_logActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email, senha;

        email = txtEmail_log.getText();
        senha = txtSenha_log.getText();

        Colaborador autenticausuario = new Colaborador();
        novoColaborador.setEmail(email);
        novoColaborador.setSenha(senha);

        autenticausuario(novoColaborador);

        System.out.println("usuario: " + email);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void BtnAtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt1ActionPerformed
        int status = 0;

        this.mySQLcon.conectaBanco();

        novoColaborador = new Colaborador();

        novoColaborador.setNome(txtNome.getText());
        novoColaborador.setEmail(txtEmail.getText());
        novoColaborador.setSenha(txtSenha.getText());

        try{
            this.mySQLcon.insertSQL("INSERT INTO cadastro("
                + "nome,"
                + "email,"
                + "senha"
                + ") VALUES ("
                + "'" + novoColaborador.getNome() + "',"
                + "'" + novoColaborador.getEmail()+ "',"
                + "'" + novoColaborador.getSenha()+ "'"
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

    }//GEN-LAST:event_BtnAtt1ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void BtnAtt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnAtt2ActionPerformed

    private void BtnAtt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtt3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnAtt3ActionPerformed
    public void autenticausuario(Colaborador validausuario){
        this.mySQLcon.conectaBanco();
        novoColaborador.setEmail(txtEmail.getText());
        novoColaborador.setSenha(txtSenha.getText());


        try{
        String sql = ("SELECT * FROM cadastro WHERE email=? and senha=?");
        PreparedStatement ps = mySQLcon.getConn().prepareStatement(sql);
        ps.setString(1, txtEmail_log.getText());
        ps.setString(2, txtSenha_log.getText());

        ResultSet rs = ps.executeQuery();

            if(txtEmail_log.getText().equals("admin@gmail.com") && txtSenha_log.getText().equals("kenzogay")){
            new ViewHub().setVisible(true);dispose();
            }

            else if (rs.next() && !txtEmail_log.getText().equals("") && !txtSenha_log.getText().equals("")){
           // ViewCadastro tela = new ViewCadastro();
            //tela.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Bem vindo");
            new ViewHub().setVisible(true);dispose();
            }else {
           JOptionPane.showMessageDialog(null, "Email ou senha inválido");

        }
        }
        catch(Exception e){
        System.out.println(e);
    }
    }

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
            java.util.logging.Logger.getLogger(LoginCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new LoginCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtt1;
    private javax.swing.JButton BtnAtt2;
    private javax.swing.JButton BtnAtt3;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail_log;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSenha_log;
    // End of variables declaration//GEN-END:variables
}

