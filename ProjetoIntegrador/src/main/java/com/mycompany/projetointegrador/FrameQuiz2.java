/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetointegrador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felip_000
 */
public class FrameQuiz2 extends javax.swing.JFrame {

    /**
     * Creates new form FrameQuiz1
     */
    public FrameQuiz2() {
        super("Questão 2");
        initComponents();
        setLocationRelativeTo(null);
        var q = new Questao(2);
        var dao = new QuestaoDAO();
        try {
            var rs = dao.obterQuestao(q);
            rs.next();
            rs.next();
            respostaq1RadioButton1.setText(rs.getString(2));
            respostaq1RadioButton2.setText(rs.getString(3));
            respostaq1RadioButton3.setText(rs.getString(4));
            respostaq1RadioButton4.setText(rs.getString(5));
            perguntaTextField.setText(rs.getString(6));
            String resposta = rs.getString(7);
            int pontos = rs.getInt(8);
            rs.close();
            
        } catch (Exception ex) {
            Logger.getLogger(FrameQuiz1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        respostaq1RadioButton1 = new javax.swing.JRadioButton();
        respostaq1RadioButton2 = new javax.swing.JRadioButton();
        respostaq1RadioButton3 = new javax.swing.JRadioButton();
        respostaq1RadioButton4 = new javax.swing.JRadioButton();
        proximoButton = new javax.swing.JButton();
        voltaButton = new javax.swing.JButton();
        perguntaTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 134, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Questão 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        respostaq1RadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respostaq1RadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        respostaq1RadioButton1.setText("Resposta1q2");
        respostaq1RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaq1RadioButton1ActionPerformed(evt);
            }
        });

        respostaq1RadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respostaq1RadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        respostaq1RadioButton2.setText("Resposta2q2");
        respostaq1RadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaq1RadioButton2ActionPerformed(evt);
            }
        });

        respostaq1RadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respostaq1RadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        respostaq1RadioButton3.setText("Resposta3q2");
        respostaq1RadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaq1RadioButton3ActionPerformed(evt);
            }
        });

        respostaq1RadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respostaq1RadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        respostaq1RadioButton4.setText("Resposta4q2");
        respostaq1RadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respostaq1RadioButton4ActionPerformed(evt);
            }
        });

        proximoButton.setText("Próxima");
        proximoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoButtonActionPerformed(evt);
            }
        });

        voltaButton.setText("Voltar");
        voltaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaButtonActionPerformed(evt);
            }
        });

        perguntaTextField.setBackground(new java.awt.Color(69, 134, 198));
        perguntaTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        perguntaTextField.setForeground(new java.awt.Color(255, 255, 255));
        perguntaTextField.setText("jTextField1");
        perguntaTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 180, Short.MAX_VALUE)
                        .addComponent(voltaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(proximoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respostaq1RadioButton1)
                            .addComponent(respostaq1RadioButton2)
                            .addComponent(respostaq1RadioButton3)
                            .addComponent(respostaq1RadioButton4)
                            .addComponent(perguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(perguntaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(respostaq1RadioButton1)
                .addGap(18, 18, 18)
                .addComponent(respostaq1RadioButton2)
                .addGap(18, 18, 18)
                .addComponent(respostaq1RadioButton3)
                .addGap(18, 18, 18)
                .addComponent(respostaq1RadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proximoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respostaq1RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaq1RadioButton1ActionPerformed
        if (respostaq1RadioButton1.isSelected()){
            respostaq1RadioButton2.setSelected(false);
            respostaq1RadioButton3.setSelected(false);
            respostaq1RadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_respostaq1RadioButton1ActionPerformed

    private void respostaq1RadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaq1RadioButton2ActionPerformed
        if (respostaq1RadioButton2.isSelected()){
            respostaq1RadioButton1.setSelected(false);
            respostaq1RadioButton3.setSelected(false);
            respostaq1RadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_respostaq1RadioButton2ActionPerformed

    private void respostaq1RadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaq1RadioButton3ActionPerformed
        if (respostaq1RadioButton3.isSelected()){
            respostaq1RadioButton1.setSelected(false);
            respostaq1RadioButton2.setSelected(false);
            respostaq1RadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_respostaq1RadioButton3ActionPerformed

    private void respostaq1RadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respostaq1RadioButton4ActionPerformed
        if (respostaq1RadioButton4.isSelected()){
            respostaq1RadioButton1.setSelected(false);
            respostaq1RadioButton2.setSelected(false);
            respostaq1RadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_respostaq1RadioButton4ActionPerformed

    private void voltaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaButtonActionPerformed
        var dt = new FrameQuiz1(); //chama uma tela específica
        dt.setVisible(true); //faz tal tela ser visível
        setVisible(false); // descarta a tela atual
        if(ContaCertas.getContador() > 0){
            ContaCertas.decrementarContador();
        }
    }//GEN-LAST:event_voltaButtonActionPerformed

    private void proximoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoButtonActionPerformed
        if (respostaq1RadioButton1.isSelected() || respostaq1RadioButton2.isSelected() || respostaq1RadioButton3.isSelected() || respostaq1RadioButton4.isSelected()){
            var dt = new FrameQuiz3(); //chama uma tela específicao nome para sua tentativa:
            dt.setVisible(true); //faz tal tela ser visível
            dispose(); // descarta a tela atual
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma resposta...");
        }
    }//GEN-LAST:event_proximoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameQuiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameQuiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameQuiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameQuiz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameQuiz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField perguntaTextField;
    private javax.swing.JButton proximoButton;
    private javax.swing.JRadioButton respostaq1RadioButton1;
    private javax.swing.JRadioButton respostaq1RadioButton2;
    private javax.swing.JRadioButton respostaq1RadioButton3;
    private javax.swing.JRadioButton respostaq1RadioButton4;
    private javax.swing.JButton voltaButton;
    // End of variables declaration//GEN-END:variables
}
