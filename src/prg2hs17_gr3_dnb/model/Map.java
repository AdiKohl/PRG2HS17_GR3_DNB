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
        // Erstelle 2D-Array
        tiles = new Tile[xsize][ysize];
        // Erstelle Tiles innerhalb des Arrays
        for(int i=0; i < xsize; i++){
            for(int j = 0; j < ysize; j++){
                tiles[i][j] = new Tile();
                tiles[i][j].setNeighborN(tiles[i-1][j]);
                tiles[i][j].setNeighborE(tiles[i][j+1]);
                tiles[i][j].setNeighborS(tiles[i+1][j]);
                tiles[i][j].setNeighborW(tiles[i][j-1]);
                
                
            }
        }
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
                System.out.print(this.tiles[i][j].getArea());
            }
            System.out.println("");
                    
        }
    }
    
    
    
    
    
    
    
    
}
