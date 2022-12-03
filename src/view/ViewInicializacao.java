package view;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewInicializacao extends javax.swing.JFrame {
    
    public ViewInicializacao() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.psbCarrgamento.setMaximum(100);
        this.psbCarrgamento.setValue(0);
        
        
        
        new Thread(){
            
            public void run (){
                for (int i = 0; i <= 100; i++) {
                    
                    psbCarrgamento.setValue(i);
                    
                    try {
                        sleep(50);
                        if (i == 100){
                            new LoginCad().setVisible(true);dispose();
                        }
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }.start();
        }
             
        
        
                
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        psbCarrgamento = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        psbCarrgamento.setForeground(new java.awt.Color(255, 153, 255));
        psbCarrgamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(psbCarrgamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 480, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kjbhjb.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 330));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("EMPORIO ATADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Design sem nome(3).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInicializacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar psbCarrgamento;
    // End of variables declaration//GEN-END:variables
}
