/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilhamoperasikalkulator;

/**
 *
 * @author SMKIJO-HP04
 */
public class Tampilanoperasi extends javax.swing.JFrame {

    /**
     * Creates new form Tampilanoperasi
     */
    public Tampilanoperasi() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Masukkannilai1 = new javax.swing.JTextField();
        Masukkannilai3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        Hasilakhir = new javax.swing.JLabel();
        Masukkannilai2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INI_KALKULATOR");
        setBackground(new java.awt.Color(255, 158, 15));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(255, 162, 2));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nilai1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nilai2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nilai3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        Masukkannilai1.setBackground(new java.awt.Color(255, 102, 51));
        Masukkannilai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masukkannilai1ActionPerformed(evt);
            }
        });
        getContentPane().add(Masukkannilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 125, 30));

        Masukkannilai3.setBackground(new java.awt.Color(255, 102, 51));
        Masukkannilai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masukkannilai3ActionPerformed(evt);
            }
        });
        getContentPane().add(Masukkannilai3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 125, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("JumlahNilai");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        Tambah.setBackground(new java.awt.Color(51, 204, 0));
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Kurang.setBackground(new java.awt.Color(51, 204, 0));
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        getContentPane().add(Kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        Kali.setBackground(new java.awt.Color(51, 204, 0));
        Kali.setText("x");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        Bagi.setBackground(new java.awt.Color(51, 204, 0));
        Bagi.setText("/");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        getContentPane().add(Bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        Hasilakhir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(Hasilakhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 120, 20));

        Masukkannilai2.setBackground(new java.awt.Color(255, 102, 51));
        Masukkannilai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masukkannilai2ActionPerformed(evt);
            }
        });
        getContentPane().add(Masukkannilai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 125, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Masukkannilai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masukkannilai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Masukkannilai1ActionPerformed

    private void Masukkannilai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masukkannilai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Masukkannilai2ActionPerformed

    private void Masukkannilai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masukkannilai3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Masukkannilai3ActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        int a1, a2, a3, out;
        a1 = Integer.parseInt(Masukkannilai1.getText());
        a2 = Integer.parseInt(Masukkannilai2.getText());
        a3 = Integer.parseInt(Masukkannilai3.getText());
        out  = (a1 + a2 + a3);
        Hasilakhir.setText(String.valueOf(out));
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
       int a1, a2, a3, out;
        a1 = Integer.parseInt(Masukkannilai1.getText());
        a2 = Integer.parseInt(Masukkannilai2.getText());
        a3 = Integer.parseInt(Masukkannilai3.getText());
        out  = (a1 - a2 - a3);
        Hasilakhir.setText(String.valueOf(out));
    }//GEN-LAST:event_KurangActionPerformed

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        int a1, a2, a3, out;
        a1 = Integer.parseInt(Masukkannilai1.getText());
        a2 = Integer.parseInt(Masukkannilai2.getText());
        a3 = Integer.parseInt(Masukkannilai3.getText());
        out  = (a1 * a2 * a3);
        Hasilakhir.setText(String.valueOf(out));
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        int a1, a2, a3, out;
        a1 = Integer.parseInt(Masukkannilai1.getText());
        a2 = Integer.parseInt(Masukkannilai2.getText());
        a3 = Integer.parseInt(Masukkannilai3.getText());
        out  = (a1 / a2 / a3);
        Hasilakhir.setText(String.valueOf(out));
    }//GEN-LAST:event_BagiActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilanoperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilanoperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilanoperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilanoperasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilanoperasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JLabel Hasilakhir;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JTextField Masukkannilai1;
    private javax.swing.JTextField Masukkannilai2;
    private javax.swing.JTextField Masukkannilai3;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
