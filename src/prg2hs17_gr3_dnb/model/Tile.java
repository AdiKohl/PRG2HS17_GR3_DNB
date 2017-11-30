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
    
    public enum Owner{
    VOID, HOST, GUEST
    }
    
    private Owner borderN;
    private Owner borderE;
    private Owner borderS;
    private Owner borderW;
    private Owner area;
    
    
    
}
