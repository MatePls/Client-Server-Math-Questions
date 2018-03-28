package Lottery_Client;

import java.net.*;
import java.io.*;
import java.util.*;

public class Lottery_Client_default {
    public static void main(String args[]) throws IOException{
        
    int[] s_numbers = new int[6]; // Array for 6 selected distinct numbers.
    String[] sufixes = new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th"}; int i = 0; // Allows user to see the number selection 
        
while (true) {       
    Socket Server_Deafult = new Socket("localhost", 2121); // Server location and port number
    InetAddress Local_Address = InetAddress.getLocalHost(); // Grabs local ip address
    System.out.println("Connection Initialization " + Server_Deafult.getInetAddress()); // Gives connection Status  
    System.out.print("Address " + Local_Address + "\n"); //Connection initialization. Shows local address 
    
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");  //Spacer
    
    BufferedReader buff_r = new BufferedReader(new InputStreamReader(Server_Deafult.getInputStream())); // Creates a buffer and Opens Input Stream for server socket to read server outputs. 
    String est = buff_r.readLine();// Grabs output from Server for connection confomation.
    System.out.println("Connection...." + est); // Established connection conformation.
    
   
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"); //Welcome screen for client.
    System.out.println("       Welcome to the Lottery client         ");
    System.out.println("        Please type your 6 numbers           ");
    System.out.println("         Number Range Between 1-50           ");
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

    
    
    Scanner num_in = new Scanner(System.in); // Scanner input for selected numbers 
    for(int n = 0; n !=6; n++){
        System.out.println("Enter your "+sufixes[i]+" number : ");
        s_numbers[n] = num_in.nextInt();
        i++;
    }// Asks users to input their 6 numbers and stores them in the s_number array. 
    
    
    PrintStream send_n = new PrintStream(Server_Deafult.getOutputStream()); // Create a PrintStream that will print the numbers to the server through the output stream. 
    for(int k = 0; k != 6; k++){
        send_n.println(s_numbers[k]);
    }// Send the 6 collected numbers from the array to the server one by one.
    
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"); // send numbers
    System.out.println("   Your Numbers have be sent to the Server   ");
    System.out.println("                                             ");
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    
    String recieved = buff_r.readLine();
    System.out.println(recieved);// Conformation from server that numbers have reached.
    
    String error1 = buff_r.readLine();
    System.out.println(error1);// Grab the output from the server to check if numbers are within the range of 1-50.
    
    String error2 = buff_r.readLine();
    System.out.println(error2);// Grab the output from the server to check if there are no repeating numbers.
    
    
    String match = buff_r.readLine();
    System.out.println(match);// Grabs the players status (Win or Loose).
    
    Server_Deafult.close();// Closes server connection to client. 
    
    System.exit(0);
    return; 
    
}   

}  
  
}
