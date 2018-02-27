/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server.coursework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


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
            Thread t = new ServerThreadHandler(incoming, instance);
            t.start();
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

         System.out.println( "Hello! Enter BYE to exit." );

         boolean done = false;
         while (!done)
         {  
            String str = BFRead.readLine();
            if (str == null) done = true;
            else
            {  
            System.out.println("Echo (" + counter + "): " + str);

               if (str.trim().equals("BYE"))
                  done = true;
              
            }
            
         }
         incoming.close();
      }
      catch (Exception e)
      {  
         e.printStackTrace();
      }
   }
   
   private Socket incoming;
   private int counter;
}

