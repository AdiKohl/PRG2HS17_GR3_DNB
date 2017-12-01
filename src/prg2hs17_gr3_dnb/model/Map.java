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
public class Map {
    
    int xsize;
    int ysize;
    Tile[][] tiles;

    public Map() {
        this(3,3);        
    }

    public Map(int xsize, int ysize) {
        this.xsize = xsize;
        this.ysize = ysize;
        tiles = new Tile[xsize][ysize];
        //this.map[2][1].setBorderN(Owner.HOST);
    }
    
    public void setBorderN(int x, int y, Owner owner){
        this.tiles[x][y].setBorderN(owner);
    }
    
    public void setBorderE(int x, int y, Owner owner){
        this.tiles[x][y].setBorderE(owner);
    }
    
    public void setBorderS(int x, int y, Owner owner){
        this.tiles[x][y].setBorderS(owner);
    }
    
    public void setBorderW(int x, int y, Owner owner){
        this.tiles[x][y].setBorderW(owner);
    }
    
    public void setArea(int x, int y, Owner owner){
        this.tiles[x][y].setArea(owner);
    }
    
    
    public void printMap(){
        for(int i=0; i < xsize; i++){
            
            for(int j = 0; j < ysize; j++){
                System.out.print(this.tiles[i][j].getArea() + " ");
            }
            System.out.println("");
                    
        }
    }
    
    
    
    
    
    
    
    
}
