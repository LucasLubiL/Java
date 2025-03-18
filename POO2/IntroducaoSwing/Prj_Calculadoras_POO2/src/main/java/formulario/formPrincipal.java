package formulario;

/**
 *
 * @author Lucas
 */
public class formPrincipal extends javax.swing.JFrame {

    
    public formPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mniCalcComum = new javax.swing.JMenuItem();
        mniCalcEqSegGrau = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jMenu2.setText("Calculadoras");

        mniCalcComum.setText("Calculador Comum");
        mniCalcComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCalcComumActionPerformed(evt);
            }
        });
        jMenu2.add(mniCalcComum);

        mniCalcEqSegGrau.setText("Calculadora Segundo Grau");
        mniCalcEqSegGrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCalcEqSegGrauActionPerformed(evt);
            }
        });
        jMenu2.add(mniCalcEqSegGrau);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opções");

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        jMenu3.add(mniSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniCalcComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCalcComumActionPerformed

        new formCalcComum().setVisible(true);
        
    }//GEN-LAST:event_mniCalcComumActionPerformed

    private void mniCalcEqSegGrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCalcEqSegGrauActionPerformed
        
        new formCalcEqSegGrau().setVisible(true);
        
    }//GEN-LAST:event_mniCalcEqSegGrauActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_mniSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mniCalcComum;
    private javax.swing.JMenuItem mniCalcEqSegGrau;
    private javax.swing.JMenuItem mniSair;
    // End of variables declaration//GEN-END:variables
}
