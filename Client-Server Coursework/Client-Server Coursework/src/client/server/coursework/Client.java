/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server.coursework;



import java.net.*;
import java.io.*;

public class Client {

    public static void main (String args[]) throws Exception {
        
        Client CLIENT = new Client();
        CLIENT.run();
        
    }
    
    
    public void run() throws Exception {
	
	Socket server = new Socket("localhost",2000);
	InetAddress address=InetAddress.getLocalHost();
	//get localhost address
	
	
	System.out.println("Connected to "+server.getInetAddress());
	System.out.println("Connected to "+address);
    
    

        
        //Between here*
	InputStream in = server.getInputStream();

	byte b[] = new byte[1000];
     	in.read(b);
	
	{
	System.out.println("Server said: "+ in);
        //* and here this section needs to be changed so that the client properly is able to communicate with the server
        //sending data back and forth
        //What might be a good idea is to start the building the gui so that a checkbox or radio button value is sent back
        }
        
  }
    
}
