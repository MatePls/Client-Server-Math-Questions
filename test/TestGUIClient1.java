
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
public class TestGUIClient1 extends javax.swing.JFrame {

    /**
     * Creates new form TestGUIClient
     * @throws java.io.IOException
     */
    
             int ButtonCounter =0;
             int QuestNumberr = 1;

    public TestGUIClient1() {
        initComponents();
        
        ButtonGroup AnswerGroup = new ButtonGroup();
        AnswerGroup.add(Answer1);
        AnswerGroup.add(Answer2);
        AnswerGroup.add(Answer3);   
        
        Socket server = null;
                 try {
                    server = new Socket("localhost",2000); // Creates a socket on port 2000
                    BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream())); // Creates a buffered reader to read input from server
                    PrintWriter PRTWrite = new PrintWriter (server.getOutputStream(), true /* autoFlush */); // Creates a print writer to send data to server
                     
                 InetAddress address = null;
                 
                     address = InetAddress.getLocalHost();
                     //get localhost address
                     System.out.println("Connected to "+server.getInetAddress()); // Gets Inet Address for server
                    System.out.println("Connected to "+address);
    
                String Question1 = reader.readLine();
                
                 } catch (UnknownHostException ex) {
                     System.out.println("Unable to get IP address of server");
                 }
                 catch (IOException ex) {
                    System.out.println("Unable to connect to server on port ");
                 }
    
	
	
	
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        Answer1 = new javax.swing.JRadioButton();
        Answer2 = new javax.swing.JRadioButton();
        Answer3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        QuestionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please select your answer from the following option once chosen press submit to move on to the next question");

        Answer1.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        Answer1.setText("1 - A*B + B*B");
        Answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer1ActionPerformed(evt);
            }
        });

        Answer2.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        Answer2.setText("2 - A*A + A*B");
        Answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer2ActionPerformed(evt);
            }
        });

        Answer3.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        Answer3.setText("3 - A*A + 2*A*B + B*B");
        Answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer3ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        QuitButton.setText("Quit");

        QuestionLabel.setFont(new java.awt.Font("Source Code Pro Light", 1, 24)); // NOI18N
        QuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabel.setText("Q2 - (A + B) * (A - B) ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Answer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Answer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Answer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(306, 306, 306)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(QuitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Answer1)
                        .addGap(18, 18, 18)
                        .addComponent(Answer2)
                        .addGap(18, 18, 18)
                        .addComponent(Answer3)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(QuitButton))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer1ActionPerformed
    
    }//GEN-LAST:event_Answer1ActionPerformed
    
    private void Answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer2ActionPerformed
   
    }//GEN-LAST:event_Answer2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void Answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer3ActionPerformed

     }//GEN-LAST:event_Answer3ActionPerformed

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
            java.util.logging.Logger.getLogger(TestGUIClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestGUIClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestGUIClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestGUIClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestGUIClient1().setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton Answer1;
    public javax.swing.JRadioButton Answer2;
    public javax.swing.JRadioButton Answer3;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JButton QuitButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @throws IOException
     */
    
    }
