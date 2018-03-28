package Lottery_Client;
import java.net.*;
import java.io.*;
import java.util.*;

public class Lottery_Server_default {
    
    
  
    public static void main(String args[]) throws IOException{
        int r_number[] = new int[6]; //Array for numbers sent from client to server.
        
        boolean Player_Status  = false; //Boolean value for players win and loose status.
        boolean Your_errors = false; 
        int recieved = 0; //Checked amount of numbers recieved. 
        int error_range = 0; //Number of errors to do with number ranges. 
        int error_repeat = 0; //Nmber of errors with repeating numbers. 
        
        
        ServerSocket Server_Default  = new ServerSocket(2121); //Makes server socket. 
        InetAddress Local_Address = InetAddress.getLocalHost(); //Grabs local address.
        
while (true) {
           System.out.println("Address : " + Local_Address);
           System.out.println("Client Status : ");
           Socket Client = Server_Default.accept(); // Connects to client.
           Scanner Client_In = new Scanner(Client.getInputStream()); // Scanner for client input to server. 
           System.out.print(Client.getInetAddress() + " Granted Access :) "); 
           System.out.println("");
           
           OutputStreamWriter Client_out = new OutputStreamWriter(Client.getOutputStream());
           PrintWriter Output = new PrintWriter(Client_out);// Prints to client.
           String confirm = (" Established ");
           Output.println(confirm);// Sends string to client using PrintWriter
           Output.flush();// Send conformation code to client that connection is established.

    
        
           for(int i = 0; i !=6; i++){
               r_number[i] = Client_In.nextInt();
               recieved++;
           }// reads numbers sent from the client and stores in r_number integer array.
           
           if(recieved == 6){
               System.out.println("Numbers recieved from client");
               String recieved_confirm = ("Numbers Recieved :)");
              Output.println(recieved_confirm);
              Output.flush();
           }// Confirmation to check if 6 numbers have been recieved, also sends confirmation to client. 
           
          Random rand = new Random();// Creates random number using Random() Function. 
          int  n = rand.nextInt(50) + 1;
           
          System.out.println("Random Number : " +n); // Displays random number 
          System.out.println("Selected Numbers");// Displays selected numbers
          for(int selected = 0; selected !=6; selected++){
          System.out.println(selected +") "+ r_number[selected]);
            do{
                if((r_number[selected] >=1 && r_number[selected] <=50)){   //Checking each number in array to see if they are witing range of 1-50.
                   System.out.println("Number is Within range ");
                   } 
                else{
                    System.out.println("Number is not witin range !");
                    error_range= error_range + 1;
                   }
           
           for(int k = 0; k != 6; k++){                              //Checking if there are any repeating numbers in the array.
               if(r_number[selected] == r_number[k]){
                   System.out.println("No repeating numbers");
                   }
                else{
                   error_repeat++;
                   }
                } 
          }while(Your_errors = false);  
            
          if(n == r_number[selected]){
              Player_Status = true;                                  //Winning status
           }
           
          }
          
        if (error_range >= 1){
              String error1 = ("Error ! : One of your numbers are not within range ");  // Output to client to say if numbers are within the range.
              Output.println(error1);
              Output.flush();
              Player_Status = false;  
          }
        else{
              String no_error1 = ("Your numbers are within range ");
              Output.println(no_error1);
              Output.flush();
          }
          
        if(error_repeat == 30){         
              String no_error2 = ("You have no repetative numbers");                   // Output to client to say if you have any repeating numbers.
              Output.println(no_error2);
              Output.flush();
          }
        else{
              String error2 = ("Error ! : You have repeated numbers");
              Output.println(error2);
              Output.flush();
              Player_Status = false;
          }
        
         if (Player_Status == true){
              String win = ("Congratulations You Number Matches!");                   // Send the player status to client to say if client has won or lost. 
              //String exit = ("Do you wish to exit ? ") ;
              Output.println(win);
              Output.flush();
              //Output.println(exit);
              //Output.flush();
              System.out.println("Client Has Matched Random Number ");
              System.out.println("");
          }
          else{
              String loose = ("Sorry But You Have Lost, Selected Numbers DID NOT MATCH.  or   Please check above if you have any errors  ");
              //String try_again = ("Do you wish to try again ? :");
              Output.println(loose); 
              Output.flush();
              //Output.println(try_again);
              //Output.flush();
              System.out.println("Client Did Not Match Random Number");
              System.out.println("");
          }
         Client.close(); //Closes client connection.
         //r_number = new int[]{0, 0, 0, 0, 0, 0, 0};
         error_repeat = 0;
    }

  }
    
  }



   
    
