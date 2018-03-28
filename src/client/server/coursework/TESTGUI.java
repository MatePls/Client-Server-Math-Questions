package client.server.coursework;


import java.awt.Label;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
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
public class TESTGUI extends javax.swing.JFrame {
 
        
             int ButtonCounter =0;
             int QuestNumberr = 1;
             ButtonGroup AnswerGroup = new ButtonGroup();
             Socket server = new Socket("localhost",2000); // Creates a socket on port 2000
        InetAddress address=InetAddress.getLocalHost();
        BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream())); // Creates a buffered reader to read input from server
        PrintWriter pw = new PrintWriter (server.getOutputStream(), true /* autoFlush */); // Creates a print writer to send data to server
          


public TESTGUI() throws IOException {

          initComponents();
       // System.out.println("Connected to "+server.getInetAddress()); // Gets Inet Address for server
	//System.out.println("Connected to "+address);
        System.out.println("Connected to "+server.getInetAddress()); // Gets Inet Address for server
        System.out.println("Connected to "+address);

     
    
       

        AnswerGroup.add(Answer1);
        AnswerGroup.add(Answer2);
        AnswerGroup.add(Answer3);      
        
  
        Answer1.setActionCommand("1");
        Answer2.setActionCommand("2");
        Answer3.setActionCommand("3");
        
        
        QuestionLabel.setText(Question1);                  
                    Answer1.setText(Answer11);
                    Answer2.setText(Answer12);
                    Answer3.setText(Answer13);
        
    }
  
     String Question1 = br.readLine();                 
                     String Answer11 = br.readLine();
                     String Answer12 = br.readLine();
                     String Answer13 = br.readLine(); 
                    String QuestionNumber = br.readLine();
                    
        
        
        

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        QuestionLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Answer1 = new javax.swing.JRadioButton();
        Answer2 = new javax.swing.JRadioButton();
        Answer3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        QuestionLabel.setFont(new java.awt.Font("Source Code Pro Light", 1, 24)); // NOI18N
        QuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                QuestionLabelInputMethodTextChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please select your answer from the following option once chosen press submit to move on to the next question");

        Answer1.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        Answer1.setText("Answer1");
        Answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer1ActionPerformed(evt);
            }
        });

        Answer2.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        Answer2.setText("Answer2");
        Answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer2ActionPerformed(evt);
            }
        });

        Answer3.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 11)); // NOI18N
        Answer3.setText("Answer3");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuestionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Answer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Answer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Answer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(306, 306, 306)
                .addComponent(jButton1)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer1ActionPerformed

    }//GEN-LAST:event_Answer1ActionPerformed
    
    private void Answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer2ActionPerformed

    }//GEN-LAST:event_Answer2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int q = 0;
        
        if (q == 0) {
           
        pw.println(AnswerGroup.getSelection().getActionCommand());
                         
       } AnswerGroup.clearSelection();
        if ("2".equals(QuestionNumber)) {
         try {
            
            String QuestionNumber= null;
            String Question2 = null;
            String Answer21 = null;
            String Answer22 = null;
            String Answer23 = null;
            
            QuestionNumber = br.readLine();
            Question2 = br.readLine();                 
            Answer21 = br.readLine();
            Answer22 = br.readLine();
            Answer23 = br.readLine(); 
     
            QuestionLabel.setText(Question2);
            Answer1.setText(Answer21);
            Answer2.setText(Answer22);
            Answer3.setText(Answer23);
            
            pw.println(AnswerGroup.getSelection().getActionCommand());
            
         } catch (IOException ex) {
                Logger.getLogger(TESTGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
            
         if ("3".equals(QuestionNumber)) {
             try {
                
                
                String Question3 = null;
                String Answer31 = null;
                String Answer32 = null;
                String Answer33 = null;
                
                QuestionNumber = br.readLine();
                Question3 = br.readLine();                 
                Answer31 = br.readLine();
                Answer32 = br.readLine();
                Answer33 = br.readLine(); 
                    
                pw.println(AnswerGroup.getSelection().getActionCommand());
                     
                QuestionLabel.setText(Question3);
                Answer1.setText(Answer31);
                Answer2.setText(Answer32);
                Answer3.setText(Answer33);

               
               } catch (IOException ex) {
                Logger.getLogger(TESTGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
             
         }  
          
        if ("4".equals(QuestionNumber)) {
                try {
                    QuestionLabel.setText(null);
                String RESULT = null;
                RESULT = br.readLine();
                System.out.println (RESULT);
                QuestionLabel.setText(RESULT);
                QuestionLabel.setFont(new java.awt.Font("Source Code Pro Light", 1, 12));
                
              } catch (IOException ex) {
                Logger.getLogger(TESTGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
             
         
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void Answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer3ActionPerformed
   
     }//GEN-LAST:event_Answer3ActionPerformed

    private void QuestionLabelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_QuestionLabelInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionLabelInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(TESTGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TESTGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TESTGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TESTGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TESTGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TESTGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton Answer1;
    public javax.swing.JRadioButton Answer2;
    public javax.swing.JRadioButton Answer3;
    public javax.swing.JLabel QuestionLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @throws IOException
     */
    
    }
