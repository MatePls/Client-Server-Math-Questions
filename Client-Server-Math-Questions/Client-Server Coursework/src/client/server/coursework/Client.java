/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server.coursework;

// TimeClient

import java.net.*;
import java.io.*;

public class Client {

    public static void main (String args[]) throws IOException {
	
	Socket server = new Socket("localhost",2000);
	InetAddress address=InetAddress.getLocalHost();
	//get localhost address
	
	
	System.out.println("Connected to "+server.getInetAddress());
	System.out.println("Connected to "+address);
    
    

	InputStream in = server.getInputStream();

	byte b[] = new byte[100];
     	int num = in.read(b);
	
	{
	System.out.println("Server said: "+ in);
    }
  }
}
