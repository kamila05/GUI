/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HB1 = new javax.swing.JTextField();
        HB2 = new javax.swing.JTextField();
        HB3 = new javax.swing.JTextField();
        HB4 = new javax.swing.JTextField();
        Diskon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 70, 30);

        jLabel2.setText("Harga Barang 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 100, 30);

        jLabel3.setText("Harga Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 100, 30);

        jLabel4.setText("Harga Barang 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 160, 100, 30);

        jLabel5.setText("Harga Barang 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 200, 100, 30);

        jLabel6.setText("Diskon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 240, 50, 30);
        getContentPane().add(HB1);
        HB1.setBounds(150, 80, 140, 30);
        getContentPane().add(HB2);
        HB2.setBounds(150, 120, 140, 30);
        getContentPane().add(HB3);
        HB3.setBounds(150, 160, 140, 30);
        getContentPane().add(HB4);
        HB4.setBounds(150, 200, 140, 30);
        getContentPane().add(Diskon);
        Diskon.setBounds(150, 240, 140, 30);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 290, 68, 25);

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 290, 65, 25);

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 290, 65, 25);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 340, 140);

        setBounds(0, 0, 417, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int hb1     = Integer.parseInt(HB1.getText());
        int hb2     = Integer.parseInt(HB2.getText());
        int hb3     = Integer.parseInt(HB3.getText());
        int hb4     = Integer.parseInt(HB4.getText());
        int diskon  = Integer.parseInt(Diskon.getText());
        int total;
        int bayar;
        //total
        total = hb1+hb2+hb3+hb4;
        //bayar
        bayar = total-(total*diskon/100);
        TA.setText("Harga Barang 1 : " +hb1+"\nHarga Barang 2 : " +hb2+"\nHarga Barang 3 : " +hb3+"\nHarga Barang 4 : " +hb4+"\nDiskon : " +diskon+"\nTotal Harga : " +total+"\nTotal Bayar : " +bayar);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TA.setText("");
        HB1.setText("");
        HB2.setText("");
        HB3.setText("");
        HB4.setText("");
        Diskon.setText("");
        clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextField HB1;
    private javax.swing.JTextField HB2;
    private javax.swing.JTextField HB3;
    private javax.swing.JTextField HB4;
    private javax.swing.JTextArea TA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clearSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
