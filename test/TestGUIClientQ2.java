
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w1549523
 */
public class TestGUIClientQ2 extends javax.swing.JFrame {

    
           
        Socket server = new Socket("localhost",2000);
        PrintWriter PRTWrite = new PrintWriter (server.getOutputStream(), true /* autoFlush */);
        BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
        InetAddress address = InetAddress.getLocalHost();

    /**
     * Creates new form TestGUIClientQ2
     * @throws java.io.IOException
     */
    public TestGUIClientQ2() throws IOException   {
        

        
      
   
        
        initComponents();
                ButtonGroup AnswerGroup = new ButtonGroup();
        AnswerGroup.add(AnswerButton1);
        AnswerGroup.add(AnswerButton2);
        AnswerGroup.add(AnswerButton3);   
 
    }
int ANSWER[] = new int [3];
       int counter =0;

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        AnswerButton1 = new javax.swing.JRadioButton();
        AnswerButton2 = new javax.swing.JRadioButton();
        AnswerButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Source Code Pro Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Q2 - (A + B) * (A - B) ");

        AnswerButton1.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 11)); // NOI18N
        AnswerButton1.setText("1 - A * A + 2 * B * B");
        AnswerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButton1ActionPerformed(evt);
            }
        });

        AnswerButton2.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 11)); // NOI18N
        AnswerButton2.setText("2 - A * A - B * B");
        AnswerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButton2ActionPerformed(evt);
            }
        });

        AnswerButton3.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 11)); // NOI18N
        AnswerButton3.setText("3 - A * B - 2 * A * B + B * B");
        AnswerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please select your answer from the following options once chosen press submit to move on to the next questiom");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerButton3)
                    .addComponent(AnswerButton2)
                    .addComponent(AnswerButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(AnswerButton1)
                .addGap(18, 18, 18)
                .addComponent(AnswerButton2)
                .addGap(18, 18, 18)
                .addComponent(AnswerButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButton1ActionPerformed
        
        ANSWER[counter] = 1;

    }//GEN-LAST:event_AnswerButton1ActionPerformed

    private void AnswerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButton3ActionPerformed
        ANSWER[counter] = 3;

    }//GEN-LAST:event_AnswerButton3ActionPerformed

    private void AnswerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButton2ActionPerformed
      ANSWER[counter] =2;

    }//GEN-LAST:event_AnswerButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PRTWrite.print(ANSWER[counter]);
        counter++;
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TestGUIClientQ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestGUIClientQ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestGUIClientQ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestGUIClientQ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new TestGUIClientQ2().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TestGUIClientQ2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AnswerButton1;
    private javax.swing.JRadioButton AnswerButton2;
    private javax.swing.JRadioButton AnswerButton3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
