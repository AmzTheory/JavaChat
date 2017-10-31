package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.sampled.Port;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
      String hostName="localhost";
      int PortNumber=1500;
      /*String hostName=args[0];
      int PortNumber=Integer.parseInt(args[1]);*/
      try{
//            GreetClient myClient=new GreetClient();
//            myClient.startConnection("localhost",1500);
//            myClient.sendMessage("hello server");
//            myClient.stopConnection();
          Scanner  myScanner=new Scanner(System.in);
          String Name=myScanner.nextLine();



          while(true){
              Socket mySocket=new Socket(hostName, PortNumber);
              PrintWriter out = new PrintWriter(mySocket.getOutputStream(), true);
              BufferedReader in = new BufferedReader(
                      new InputStreamReader(mySocket.getInputStream()));


              String toBeSent=myScanner.nextLine();
              out.write(toBeSent);
              System.out.println(Name+": "+toBeSent);

              if(toBeSent.equals("bye")) {

                  break;
              }
              out.close();
              in.close();
              mySocket.close();
          }




//


      }catch (Exception EX){
            //EX.printStackTrace();
          System.out.println(EX.getMessage());

      }
    }
}
