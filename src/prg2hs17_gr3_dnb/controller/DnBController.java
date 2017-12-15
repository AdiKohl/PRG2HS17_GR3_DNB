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
import prg2hs17_gr3_dnb.view.*;
//import prg2hs17_gr3_dnb.view;

/**
 *
 * @author Adi
 */
public class DnBController {

    private MapModel map;
    private MenuFrame menu;

    public DnBController() {
        this.map = new MapModel();
        //EventQueue.invokeLater(() -> new MenuFrame());
        this.menu = new MenuFrame();
        addMenuListeners();
        //this.map.setArea(2,1,Owner.GUEST);
    }
    
    public void calculateElement(int x, int y){
        
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
            calculateElement(e.getX(),e.getY());
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
