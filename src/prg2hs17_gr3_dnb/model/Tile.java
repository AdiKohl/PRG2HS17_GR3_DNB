/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.model;

/**
 *
 * @author Adi
 */



public class Tile {
    
    
    private Owner borderN;
    private Owner borderE;
    private Owner borderS;
    private Owner borderW;
    private Owner area;

    public Tile() {
        this.area = Owner.VOID;
        this.borderN = Owner.VOID;
        this.borderE = Owner.VOID;
        this.borderS = Owner.VOID;
        this.borderW = Owner.VOID;
        
        
    }
    
    
    
    
    
}