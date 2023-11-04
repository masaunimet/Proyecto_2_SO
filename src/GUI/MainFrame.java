/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.DefaultListModel;

/**
 *
 * @author Andres
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jSlider1 = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        nintendoQ4 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        nintendoQ1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        nintendoQ2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        nintendoQ3 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        capcomQ4 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        capcomQ1 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        capcomQ2 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        capcomQ3 = new javax.swing.JList<>();
        nintendoFighterScore = new javax.swing.JLabel();
        nintendoFighterPicture = new javax.swing.JLabel();
        nintendoFighterFrame1 = new javax.swing.JLabel();
        capcomFighterScore = new javax.swing.JLabel();
        capcomFighterPicture = new javax.swing.JLabel();
        capcomFighterFrame = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        jScrollPane2.setViewportView(nintendoQ4);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 90));

        jScrollPane3.setViewportView(nintendoQ1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 90));

        jScrollPane4.setViewportView(nintendoQ2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 90));

        jScrollPane5.setViewportView(nintendoQ3);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 90));

        jScrollPane6.setViewportView(capcomQ4);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 150, 90));

        jScrollPane7.setViewportView(capcomQ1);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 150, 90));

        jScrollPane8.setViewportView(capcomQ2);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 150, 90));

        jScrollPane9.setViewportView(capcomQ3);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 150, 90));

        nintendoFighterScore.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        nintendoFighterScore.setText("0");
        getContentPane().add(nintendoFighterScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 30, 30));

        nintendoFighterPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nintendoImages/download (2) (1).jpeg"))); // NOI18N
        nintendoFighterPicture.setPreferredSize(new java.awt.Dimension(100, 80));
        getContentPane().add(nintendoFighterPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 280));
        getContentPane().add(nintendoFighterFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 240, 340));

        capcomFighterScore.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        capcomFighterScore.setText("0");
        getContentPane().add(capcomFighterScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 30, 30));

        capcomFighterPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nintendoImages/download (2) (1).jpeg"))); // NOI18N
        capcomFighterPicture.setPreferredSize(new java.awt.Dimension(100, 80));
        getContentPane().add(capcomFighterPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 180, 280));
        getContentPane().add(capcomFighterFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, 340));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Cola Refuerzos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Cola Prioridad 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Cola Prioridad 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Cola Prioridad 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Cola Prioridad 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Cola Prioridad 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setText("Cola Prioridad 3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Cola Refuerzos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void clearLists() {
        DefaultListModel modelo = new DefaultListModel();
        getNintendoQ1().setModel(modelo);
        getNintendoQ2().setModel(modelo);
        getNintendoQ3().setModel(modelo);
        getNintendoQ4().setModel(modelo);
        
        getCapcomQ1().setModel(modelo);
        getCapcomQ2().setModel(modelo);
        getCapcomQ3().setModel(modelo);
        getCapcomQ4().setModel(modelo);
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capcomFighterFrame;
    private javax.swing.JLabel capcomFighterPicture;
    private javax.swing.JLabel capcomFighterScore;
    private javax.swing.JList<String> capcomQ1;
    private javax.swing.JList<String> capcomQ2;
    private javax.swing.JList<String> capcomQ3;
    private javax.swing.JList<String> capcomQ4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel nintendoFighterFrame1;
    private javax.swing.JLabel nintendoFighterPicture;
    private javax.swing.JLabel nintendoFighterScore;
    private javax.swing.JList<String> nintendoQ1;
    private javax.swing.JList<String> nintendoQ2;
    private javax.swing.JList<String> nintendoQ3;
    private javax.swing.JList<String> nintendoQ4;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the capcomFighterFrame
     */
    public javax.swing.JLabel getCapcomFighterFrame() {
        return capcomFighterFrame;
    }

    /**
     * @return the capcomFighterPicture
     */
    public javax.swing.JLabel getCapcomFighterPicture() {
        return capcomFighterPicture;
    }

    /**
     * @return the capcomFighterScore
     */
    public javax.swing.JLabel getCapcomFighterScore() {
        return capcomFighterScore;
    }

    /**
     * @return the capcomQ1
     */
    public javax.swing.JList<String> getCapcomQ1() {
        return capcomQ1;
    }

    /**
     * @return the capcomQ2
     */
    public javax.swing.JList<String> getCapcomQ2() {
        return capcomQ2;
    }

    /**
     * @return the capcomQ3
     */
    public javax.swing.JList<String> getCapcomQ3() {
        return capcomQ3;
    }

    /**
     * @return the capcomQ4
     */
    public javax.swing.JList<String> getCapcomQ4() {
        return capcomQ4;
    }

    /**
     * @return the nintendoFighterFrame1
     */
    public javax.swing.JLabel getNintendoFighterFrame1() {
        return nintendoFighterFrame1;
    }

    /**
     * @return the nintendoFighterPicture
     */
    public javax.swing.JLabel getNintendoFighterPicture() {
        return nintendoFighterPicture;
    }

    /**
     * @return the nintendoFighterScore
     */
    public javax.swing.JLabel getNintendoFighterScore() {
        return nintendoFighterScore;
    }

    /**
     * @return the nintendoQ1
     */
    public javax.swing.JList<String> getNintendoQ1() {
        return nintendoQ1;
    }

    /**
     * @return the nintendoQ2
     */
    public javax.swing.JList<String> getNintendoQ2() {
        return nintendoQ2;
    }

    /**
     * @return the nintendoQ3
     */
    public javax.swing.JList<String> getNintendoQ3() {
        return nintendoQ3;
    }

    /**
     * @return the nintendoQ4
     */
    public javax.swing.JList<String> getNintendoQ4() {
        return nintendoQ4;
    }
}