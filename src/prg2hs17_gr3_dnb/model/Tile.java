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

    public Owner getBorderN() {
        return borderN;
    }

    public void setBorderN(Owner borderN) {
        this.borderN = borderN;
    }

    public Owner getBorderE() {
        return borderE;
    }

    public void setBorderE(Owner borderE) {
        this.borderE = borderE;
    }

    public Owner getBorderS() {
        return borderS;
    }

    public void setBorderS(Owner borderS) {
        this.borderS = borderS;
    }

    public Owner getBorderW() {
        return borderW;
    }

    public void setBorderW(Owner borderW) {
        this.borderW = borderW;
    }

    public Owner getArea() {
        return area;
    }

    public void setArea(Owner area) {
        this.area = area;
    }
    
    
    
    
    
    
    
}
