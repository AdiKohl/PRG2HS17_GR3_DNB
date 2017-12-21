/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.controller;

import java.net.*;
import java.io.*;

/**
 *
 * @author PETERZ
 */
public class Server{

    public Server(int port){
        try{
            ServerSocket s = new ServerSocket(port);
            System.out.println("Warten auf Verbindung ...");
            Socket client = s.accept();
            System.out.println(client + " akzeptiert...");
            PrintWriter outStream = new PrintWriter(client.getOutputStream());
            BufferedReader inStream = new BufferedReader(new InputStreamReader(client.getInputStream()));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


