/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.controller;

import java.io.*;
import java.net.*;



/**
 *
 * @author PETERZ
 */
public class Client{
    public Client (int port, String host){
        try{
            BufferedReader keyStream = new BufferedReader(new InputStreamReader(System.in));
            Socket client = new Socket(host,port);
            PrintWriter outStream = new PrintWriter(client.getOutputStream());
            BufferedReader inStream = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line = inStream.readLine();
            System.out.println(line);
            line = keyStream.readLine();
            outStream.println(line);
            outStream.flush();
            line = inStream.readLine();
            System.out.println(line);
        }catch(IOException e){
            e.printStackTrace();}      
    }
}
