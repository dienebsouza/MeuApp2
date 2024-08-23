/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Calculos;

/**
 *
 * @author laboratorio
 */
public class Tela extends javax.swing.JFrame {
    Calculos c = new Calculos();
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTvalor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTvalor2 = new javax.swing.JTextField();
        jBsoma = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();
        jBsub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Digite um número:");

        jLabel2.setText("Digite outro valor:");

        jBsoma.setBackground(new java.awt.Color(204, 255, 204));
        jBsoma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsoma.setForeground(new java.awt.Color(0, 102, 0));
        jBsoma.setText("somar");
        jBsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomaActionPerformed(evt);
            }
        });

        jLresultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLresultado.setForeground(new java.awt.Color(255, 0, 0));
        jLresultado.setText("0.00");

        jBsub.setBackground(new java.awt.Color(255, 204, 204));
        jBsub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsub.setForeground(new java.awt.Color(153, 0, 0));
        jBsub.setText("subtrair");
        jBsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLresultado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBsoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsub))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTvalor2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jTvalor1))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsoma)
                    .addComponent(jBsub))
                .addGap(18, 18, 18)
                .addComponent(jLresultado)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomaActionPerformed
        // TODO add your handling code here:
        //Calculos c = new Calculos();
        //pega os valores escritos, converte e seta no valor
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText("Soma " + c.somar());
        //pega o valor escrito na primeira caixa e mostra no resultado
        //jLresultado.setText(jTvalor1.getText());
    }//GEN-LAST:event_jBsomaActionPerformed

    private void jBsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubActionPerformed
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText("Subtração " + c.subtrair());
    }//GEN-LAST:event_jBsubActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsoma;
    private javax.swing.JButton jBsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JTextField jTvalor1;
    private javax.swing.JTextField jTvalor2;
    // End of variables declaration//GEN-END:variables
}
