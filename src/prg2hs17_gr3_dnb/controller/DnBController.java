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

    public void addMenuListeners(){
        this.menu.setCreditsListener(new ButtonCreditsListener());
        this.menu.setSingleplayerListener(new ButtonSingleplayerListener());
        this.menu.setQuitListener(new ButtonQuitListener());
    }
    
    public void addMouseListener() {
        menu.getMainFrame().setMouseListener(new MousePFListener());
    }

    public void printMap() {
        this.map.printMap();
    }

    
// MAIN MENU ACTION LISTENER
    
    class ButtonSingleplayerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.setMainFrame(new MainFrame());
        menu.getMainFrame().setVisible(true);
        menu.setVisible(false);
        addMouseListener();
        }
    }
    
    class ButtonCreditsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.setCreditFrame(new Credits());
        menu.getCreditFrame().setVisible(true);
        menu.setVisible(false);
        }
    }
    
    class ButtonQuitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }
    }
    
// SINGLE PLAYER WINDOW LISTENER    
    
    class MousePFListener implements MouseListener {
        
        @Override
        public void mouseExited(MouseEvent e){}
        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseClicked(MouseEvent e){
            System.out.println("that was a click!");
        }
        
    }

    class ButtonBackToMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        menu.getMainFrame().setVisible(false);
        menu.setVisible(true);
        }
    }
    

}
