/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.controller;
//import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import prg2hs17_gr3_dnb.model.MapModel;
import prg2hs17_gr3_dnb.model.Owner;
import prg2hs17_gr3_dnb.view.*;
//import prg2hs17_gr3_dnb.view;

/**
 *
 * @author Adi
 */
public class DnBController {

    private MapModel map;
    private MenuFrame menu;
    
    //private int sizeX;
    //private int sizeY;
    private int row;
    private int col;
    private int xCell;
    private int yCell;
    private final int tol = 10;
    private int bor;
    private Owner playerPlaying = Owner.HOST;
    

    public DnBController() {
        this.map = new MapModel();
        //EventQueue.invokeLater(() -> new MenuFrame());
        this.menu = new MenuFrame();
        addMenuListeners();
        //this.map.setArea(2,1,Owner.GUEST);
    }
    
    public void evaluateClick(int x, int y){
        // Berechnung der Zelle
        this.col = (x-this.menu.getMainFrame().getPlayField().getBorderDist())/this.menu.getMainFrame().getPlayField().getPointDist();
        if(col==3) col=2;
        //System.out.println("Column:" + col);
        this.row = (y-this.menu.getMainFrame().getPlayField().getBorderDist())/this.menu.getMainFrame().getPlayField().getPointDist();
        if(row==3) row=2;
        //System.out.println("Row:" + row);
        System.out.print("Cell: [" + col + "/" + row + "]");
        
        //Berechnung der Koordinaten innerhalb der Zelle
        this.xCell = x-this.menu.getMainFrame().getPlayField().getBorderDist()-col*this.menu.getMainFrame().getPlayField().getPointDist();
        //System.out.println("xCell: " + xCell);
        this.yCell = y-this.menu.getMainFrame().getPlayField().getBorderDist()-row*this.menu.getMainFrame().getPlayField().getPointDist();
        //System.out.println("yCell: " + yCell);
        System.out.print("Coords: " + this.xCell + "/" + this.yCell);
        
        //Enstprechende Border-Wahl: W=1,N=2,E=3,S=4, Keine = 0;
        if(xCell<=tol) bor = 1;
        else if (yCell<=tol) bor = 2;
        else if (xCell >= this.menu.getMainFrame().getPlayField().getPointDist()-tol) bor = 3;
        else if (yCell >= this.menu.getMainFrame().getPlayField().getPointDist()-tol) bor = 4;
        else bor = 0;
        
        System.out.println("Border: " + this.bor);
        
        
        
        
        whosTurn(col,row,bor);
        manipulateModel(col,row,bor);
        drawView(col,row,bor);
        
        
    }
    
    public void manipulateModel(int x, int y, int b){
        if(b==1){
            this.map.setBorderW(x,y,playerPlaying);
            if(this.map.checkArea(x, y)) this.map.setArea(x, y, playerPlaying);
            if(x>0){
                this.map.setBorderE(x-1,y,playerPlaying);
                if(this.map.checkArea(x-1, y)) this.map.setArea(x-1, y, playerPlaying);
            }
        }
        
        else if (b==2){
            this.map.setBorderN(x,y,playerPlaying);
            if(this.map.checkArea(x, y)) this.map.setArea(x, y, playerPlaying);
            if(y>0){
                this.map.setBorderS(x,y-1,playerPlaying);
                if(this.map.checkArea(x, y-1)) this.map.setArea(x, y-1, playerPlaying);
            }   
        }
        
        else if (b==3){
            this.map.setBorderE(x,y,playerPlaying);
            if(this.map.checkArea(x, y)) this.map.setArea(x, y, playerPlaying);
            if(x<2){
                this.map.setBorderW(x+1,y,playerPlaying);
                if(this.map.checkArea(x+1, y))this.map.setArea(x+1, y, playerPlaying);
            }    
        }
        
        else if (b==4){
            this.map.setBorderS(x,y,playerPlaying);
            if(this.map.checkArea(x, y)) this.map.setArea(x, y, playerPlaying);
            if(y<2){
                this.map.setBorderN(x,y+1,playerPlaying);
                if(this.map.checkArea(x, y+1)) this.map.setArea(x, y+1, playerPlaying);
            }
             
        }
        
        this.map.printMap();
    }

    public void drawView(int x, int y, int b){
        // Draw Borders
        this.menu.getMainFrame().getPlayField().drawBorder(x,y,b, this.map.getBorder(x,y,b));
        // Draw Boxes
        for (int i = 0; i < this.menu.getMainFrame().getPlayField().getPointsX()-1; i++) {
            for (int j = 0; j < this.menu.getMainFrame().getPlayField().getPointsY()-1; j++) {
                this.menu.getMainFrame().getPlayField().drawBox(i,j,this.map.getArea(i,j));
            }
        }
    }
    
    public void whosTurn(int x, int y, int b){
        if(this.map.getBorder(x,y,b)==Owner.VOID && this.playerPlaying == Owner.GUEST) this.playerPlaying = Owner.HOST;
        if(this.map.getBorder(x,y,b)==Owner.VOID && this.playerPlaying == Owner.HOST) this.playerPlaying = Owner.GUEST;
        
        
    }
    
    
    public void addMenuListeners(){
        this.menu.setCreditsListener(new ButtonCreditsListener());
        this.menu.setSingleplayerListener(new ButtonSingleplayerListener());
        this.menu.setQuitListener(new ButtonQuitListener());
    }
    
    public void addSingleListener() {
        menu.getMainFrame().setMouseListener(new MousePFListener());
        menu.getMainFrame().setBackToMenuListener(new ButtonSingleToMenuListener());
    }
    
    public void addCreditListener(){
        menu.getCreditFrame().setBackToMenuListener(new ButtonCreditToMenuListener());
        
    }

    public void printMap() {
        this.map.printMap();
    }

    
/* MAIN MENU ACTION LISTENERS */
    
    class ButtonSingleplayerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.setMainFrame(new MainFrame());
        menu.getMainFrame().setVisible(true);
        menu.setVisible(false);
        addSingleListener();
        }
    }
    
    class ButtonCreditsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.setCreditFrame(new Credits());
        menu.getCreditFrame().setVisible(true);
        //menu.setVisible(false);
        addCreditListener();
        }
    }
    
    class ButtonQuitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }
    }
    
/* SINGLE PLAYER ACTION LISTENERS  */
    
    class MousePFListener implements MouseListener {
        
        @Override
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseClicked(MouseEvent e){
            System.out.println("that was a click! at x: " + e.getX() + " and y: " + e.getY());
            evaluateClick(e.getX(),e.getY());
        }
        
    }

    class ButtonSingleToMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.getMainFrame().setVisible(false);
        menu.setVisible(true);
        }
    }
    
/* CREDITS ACTION LISTENER */

    class ButtonCreditToMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.getCreditFrame().setVisible(false);
        menu.setVisible(true);
        }
    }
    

}
