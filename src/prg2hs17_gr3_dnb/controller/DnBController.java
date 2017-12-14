/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.controller;
import java.awt.EventQueue;
import prg2hs17_gr3_dnb.model.MapModel;
import prg2hs17_gr3_dnb.model.Owner;
import prg2hs17_gr3_dnb.view.*;
//import prg2hs17_gr3_dnb.view;

/**
 *
 * @author Adi
 */
public class DnBController implements MouseListener{
    
    private MapModel map;
    private MenuFrame menu;
    
    

    public DnBController() {
        this.map = new MapModel();
        EventQueue.invokeLater(() -> new MenuFrame());
        
        addListeners();
        //this.map.setArea(2,1,Owner.GUEST);
    }
    
    public void addListeners(){
        menu.getPlayPanel().setMouseListener(new MouseListener());
    }
    
    public void printMap(){
        this.map.printMap();
    }
    
    
    
    
}
