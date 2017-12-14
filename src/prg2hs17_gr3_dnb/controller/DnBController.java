/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.controller;
import prg2hs17_gr3_dnb.model.MapModel;
import prg2hs17_gr3_dnb.model.Owner;
//import prg2hs17_gr3_dnb.view;

/**
 *
 * @author Adi
 */
public class DnBController {
    
    private MapModel map;
    
    

    public DnBController() {
        this.map = new MapModel();
        //this.map.setArea(2,1,Owner.GUEST);
    }
    
    
    
    public void printMap(){
        this.map.printMap();
    }
    
    
    
    
}
