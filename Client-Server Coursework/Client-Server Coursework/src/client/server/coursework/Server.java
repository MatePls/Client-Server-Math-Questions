/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server.coursework;

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

  
   public static void main(String[] args )
   {  
      try
      {  
         int instance = 1;
         ServerSocket clientSock = new ServerSocket(2000);
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
      catch (IOException e)
      {  
         e.printStackTrace();
      }
   }
}
class ServerThreadHandler extends Thread 
{ 
   /**
      Constructs a handler.
      @param i the incoming socket
      @param c the counter for the handlers (used in prompts)
   */
    
   public ServerThreadHandler(Socket i, int c)
   { 
      incoming = i; counter = c; 
   }

   public void run()
   {  
      try
      {  
         BufferedReader BFRead = new BufferedReader
            (new InputStreamReader(incoming.getInputStream()));
         PrintWriter PRTWrite = new PrintWriter
            (incoming.getOutputStream(), true /* autoFlush */);

         
        PRTWrite.println( "Connection Established, Welcome to the hardest maths test of your life!." );

         boolean done = false;
         while (!done)
         {  
            String BFR = BFRead.readLine();
            if (BFR == null) done = true;
            else
            {  
            PRTWrite.println( (" + BFR + "));

               if (BFR.equals(" "))
                  done = true;
              
            }
            
         }
         incoming.close();
      }
      catch (Exception e)
      {  
        System.out.println("Failed to intialise reader and writer to client");
      }
   }
   
   private Socket incoming;
   private int counter;
}

