/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import static java.lang.System.out;


/**
 *
 * @author w1549523
 */
public class Server {

  
   public static void main(String[] args ) throws IOException
   {  

      {  
         int instance = 1;
         ServerSocket clientSock = new ServerSocket(2000);
         System.out.println(" Socket Created, waiting for client to connet");
         System.out.println("**********************************************");
         for (;;)
         {  
            Socket incoming = clientSock.accept( );
            System.out.println("Generating Thread " + instance);
            Thread ServerThread = new ServerThreadHandler(incoming, instance);
            InetAddress ClientAdd = clientSock.getInetAddress();
            System.out.println("Client Connected  " + ClientAdd);
            ServerThread.start();
            instance++;
         }
      }

   }
}
class ServerThreadHandler extends Thread 
{ 
   /**
      Constructs a handler.
      @param INCOMM the incoming socket
      @param QuesC the counter for the handlers (used in prompts)
   */
    
   public ServerThreadHandler(Socket INCOMM, int QuesC)
   { 
      incoming = INCOMM; counter = QuesC; 
   }

   @Override
   public void run()
   {  
       String Correct = "Congradulations you got all the questions right!!";
       String Wrong = "You got one or more of the questions wrong, please try again";
       String BFR[] = new String [3];
       
        boolean AnswerQ1 = false; 
        boolean AnswerQ2 = false; 
        boolean AnswerQ3 = false;
    try
      {  

         BufferedReader ClientAnswer = new BufferedReader
            (new InputStreamReader(incoming.getInputStream()));
         PrintWriter PRTWrite = new PrintWriter
            (incoming.getOutputStream(), true /* autoFlush */);
        
        //Question 1
        PRTWrite.println("Q1: (A + B)*(A+B)");
        PRTWrite.println("1. A*A + B*B ");
        PRTWrite.println("2. A*A +A*B + B*B");
        PRTWrite.println("3. A*A +2*A*B + B*B"); 
            
        BFR[0] = ClientAnswer.readLine();
        System.out.println("Client Answered " +  BFR[0]);
        if ("3".equals(BFR[0])) {
            AnswerQ1 = true;
        }

               
        //Question 2       
        PRTWrite.println(" Q2: (A + B)*(A - B)  ");
        PRTWrite.println(" 1. A*A + 2*B*B ");
        PRTWrite.println(" 2. A*A - B*B ");
        PRTWrite.println(" 3. A*A -2*A*B + B*B ");
        
        BFR[1] = ClientAnswer.readLine();
        System.out.println("Client Answered " + BFR[1]);
        if ("2".equals(BFR[1])){
            AnswerQ2 = true;
        }
        
        //Question 3
        PRTWrite.println("Q3: sin(x)*sin(x) + cos(x)*cos(x)");
        PRTWrite.println(" 1. 1 ");
        PRTWrite.println(" 2. 2 ");
        PRTWrite.println(" 3. 3 ");
        
        BFR[2] = ClientAnswer.readLine();
        System.out.println("Client Answered " + BFR[2]);
        if ("1".equals(BFR[2])){
            AnswerQ3 = true;
        }
        
        //Question Evalution - Correct
        if (AnswerQ1 && AnswerQ2 && AnswerQ3){
            PRTWrite.println(Correct);
        }
        else {
            PRTWrite.println(Wrong);
        }
        PRTWrite.close();
        ClientAnswer.close();

      }     
    

      catch (Exception e)
      {  
        System.out.println("Failed to intialise reader and writer to client");
      }
      
   }
   
   private Socket incoming;
   private int counter;
}

