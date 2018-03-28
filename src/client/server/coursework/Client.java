/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server.coursework;



import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void main (String args[]) throws Exception {
        System.out.println("Connection to Server has started, Looking for Server");
        Client CLIENT = new Client();
        CLIENT.run();
        
    }
    
    
    public void run() throws Exception {

        int ANSWER[] = new int [3];
        
        while (true) {
	Socket server = new Socket("localhost",2000); // Creates a socket on port 2000
	InetAddress address=InetAddress.getLocalHost(); 
	//get localhost address
	
	
	System.out.println("Connected to "+server.getInetAddress()); // Gets Inet Address for server
	System.out.println("Connected to "+address);
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream())); // Creates a buffered reader to read input from server
        PrintWriter PRTWrite = new PrintWriter (server.getOutputStream(), true /* autoFlush */); // Creates a print writer to send data to server
        

        //Question 1 = Variable Declaration
        String Question1 = reader.readLine();
        String Statement1 = reader.readLine();
        String Answer11 = reader.readLine();
        String Answer12 = reader.readLine();
        String Answer13 = reader.readLine();
        
      //Question 1 - Prints Question from Server
        System.out.println("      ");   
        System.out.println(Question1);
        System.out.println(Statement1);
        System.out.println(Answer11);
        System.out.println(Answer12);
        System.out.println(Answer13);
        System.out.println("      ");

        Scanner INPUT = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your answer: "); // User input on questions
        ANSWER[0] = INPUT.nextInt();
        do   {
            PRTWrite.println(ANSWER[0]);
            
        } while (ANSWER[0] >= '4'  ); 
       //         System.err.println("Please enter a value between 1-3");
        //    ANSWER[0] = 0;      
        
        
      //Question 2 - Variable Declaration
        String Question2 = reader.readLine();
        String Statement2 = reader.readLine();        
        String Answer21 = reader.readLine();
        String Answer22 = reader.readLine();
        String Answer23 = reader.readLine();
        
      //Question 2 - Prints Question from Server
        System.out.println("      ");
        System.out.println(Question2);
        System.out.println(Statement2);
        System.out.println(Answer21);
        System.out.println(Answer22);
        System.out.println(Answer23);
        System.out.println("      ");        
      //Gets user input on question
        System.out.println("Enter your answer: ");
        ANSWER[1] = INPUT.nextInt();
        
        do   {
            PRTWrite.println(ANSWER[1]);
            
        } while (ANSWER[1] >= '4'  ); 
         //       System.err.println("Please enter a value between 1-3");
          //  ANSWER[1] = 0;
        
    
        
        
      //Question 3 - Variable Declaration
        System.out.println("      ");       
        String Question3 = reader.readLine();
        String Statement3 = reader.readLine();        
        String Answer31 = reader.readLine();
        String Answer32 = reader.readLine();
        String Answer33 = reader.readLine();
        
      //Question 3 - Prints Question from Server  
        System.out.println("      ");        
        System.out.println(Question3);
        System.out.println(Statement3);
        System.out.println(Answer31);
        System.out.println(Answer32);
        System.out.println(Answer33);
        System.out.println("      ");
      //Gets user input on question
        System.out.println("Enter your answer: ");
        ANSWER[2] = INPUT.nextInt();
        
       do   {
            PRTWrite.println(ANSWER[2]);
            
        } while (ANSWER[2] >= '4' ); 
          //      System.err.println("Please enter a value between 1-3");
          //  ANSWER[2] = 0;
        
      //Client waits for server to reply with results
        System.out.println();
        System.out.println(" You have completed the test.");
        System.out.println(" Evaluating Answer ...");
        System.out.println();
        String RESULT = reader.readLine();
        System.out.println (RESULT);
        
        PRTWrite.close();
        reader.close();
        server.close();

        }
    }
}

	
 

