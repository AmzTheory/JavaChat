package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.security.ntlm.Server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    private ServerSocket myserver;
    public static void main(String[] args) {
        while (true) {
            try {

                ServerSocket myServer = new ServerSocket(1500);
                Socket clientSocket ;
                clientSocket = myServer.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                String wasSentByClient ="";

                while ((wasSentByClient=in.readLine()) !=null ) {


                        System.out.println("Client: " + wasSentByClient);

                    if(wasSentByClient.equals("bye")){
                        break;
                   }


                }
                clientSocket.close();
                myServer.close();
            } catch (Exception EX) {
               EX.getMessage();
            }
        }


    }
    //will send message to the Client
    public void sendMessage(){

    }
}
