/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface4;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicios
 */
public class Pesquisa extends javax.swing.JFrame {

    /**
     * Creates new form Pesquisa
     */
    public Pesquisa() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        areaDeTexto = new javax.swing.JTextArea();
        diferenciar = new javax.swing.JCheckBox();
        textoPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaDeTexto.setEditable(false);
        areaDeTexto.setColumns(20);
        areaDeTexto.setLineWrap(true);
        areaDeTexto.setRows(5);
        areaDeTexto.setTabSize(4);
        areaDeTexto.setText("Se acreditar que o mesmo raio cai 50 vezes no mesmo lugar e que existe um complô gigantesco pra foder uma pessoa é mais fácil do que crer na palavra de uma mulher, isso não assusta vocês não?\n\nUm dia vai ser sua irmã, sua filha.\nA palavra delas não significa nada pra vocês.");
        jScrollPane1.setViewportView(areaDeTexto);

        diferenciar.setSelected(true);
        diferenciar.setText("Diferenciar letras maiúsculas e minúsculas");

        textoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPesquisaActionPerformed(evt);
            }
        });

        botaoPesquisa.setText("Pesquisar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoPesquisa))
                    .addComponent(jScrollPane1)
                    .addComponent(diferenciar))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisa)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(textoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(diferenciar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesquisaActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        String palavra;
        String texto;
        if(!diferenciar.isSelected()){
            palavra = textoPesquisa.getText().toLowerCase();
            texto = areaDeTexto.getText().toLowerCase();
        }else{
            palavra = textoPesquisa.getText();
            texto = areaDeTexto.getText();
        }
        int posicao = texto.indexOf(palavra);
        if(posicao >= 0){
            JOptionPane.showMessageDialog(this, "A palavra "+ palavra +" está no texto");
        }else{
            JOptionPane.showMessageDialog(this, "A palavra "+ palavra +" não está no texto");
        }
    }//GEN-LAST:event_botaoPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeTexto;
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JCheckBox diferenciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoPesquisa;
    // End of variables declaration//GEN-END:variables
}
