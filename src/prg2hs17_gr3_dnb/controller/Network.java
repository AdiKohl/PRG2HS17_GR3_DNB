/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.controller;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import java.io.IOException;
import javax.swing.JTextField;

/**
 * @author Peter Zuercher
 */
public class Network{

    //Attribute
    private BufferedReader netIn;
    private PrintWriter netOut;
    private Socket socket;
    private String line = null;
    private short data;
    private final int port;
    private String hostname;
    private short function = WAIT;
    private static final byte WRITE = 0;
    private static final byte READ = 1;
    private static final byte WAIT = 2;
    private static final byte STOP = 3;
    private boolean isConnected = false;
    
    // Enum
    public enum TCPState {
        Write(WRITE),
        Read(READ),
        Wait(WAIT), 
        Stop(STOP);
        
        private final byte value;
        TCPState(byte v) { value = v; }
        
        public final byte getStateValue() { return value; }
    }
    
    // Konstruktor
    public Network(String hostname, int port) throws IOException {
        this.hostname = hostname;
        this.port = port;
        if (!isConnected) { // erlaubt nur einen Client zu verbinden& ist der Player der Server?
            ServerSocket server = new ServerSocket(port);
            System.out.println("Is Server. Waiting for connection...");
            socket = server.accept(); //Bocking
            isConnected = true;
            System.out.println(socket + " accepted...");
        } else {
            System.out.println("Is Client");
            socket = new Socket(this.hostname, this.port);
        }
        try{
        netIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        netOut = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        }catch(IOException e){
         e.printStackTrace();
        }
    }
    
    // Methoden
    public void setFunction(short v) {
        function = v;
    }

    public short readData() {
        return data;
    }
}

