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
public class MapModel {
    
    int xsize;
    int ysize;
    Tile[][] tiles;

    public MapModel() {
        this(3,3);        
    }

    public MapModel(int xsize, int ysize) {
        this.xsize = xsize;
        this.ysize = ysize;
        // Erstelle 2D-Array
        tiles = new Tile[xsize][ysize];
        // Erstelle Tiles innerhalb des Arrays
        for(int i=0; i < xsize; i++){
            for(int j = 0; j < ysize; j++){
                tiles[i][j] = new Tile();
                tiles[i][j].setID("X" + i + "Y" + j);
                tiles[i][j].setNeighborN((i-1<0) ? null : tiles[i-1][j]);
                tiles[i][j].setNeighborE((j+1>=ysize) ? null : tiles[i][j+1]);
                tiles[i][j].setNeighborS((i+1>=xsize) ? null : tiles[i+1][j]);
                tiles[i][j].setNeighborW((j-1<0) ? null : tiles[i][j-1]);
                
                
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
    
    public void printTile(int x, int y){
        
        System.out.print(this.tiles[x][y].getID() + " ");
        /*
        System.out.print("Area: " + tiles[x][y].getArea());
        System.out.print(" | NN: " + tiles[x][y].getNeighborN());
        */   
    }
    
    public void printMap(){
        for(int i=0; i < xsize; i++){
            
            for(int j = 0; j < ysize; j++){
                
                printTile(i,j);
                //System.out.println("");
            }
            System.out.println("");
                    
        }
    }
    
    
    
    
    
    
    
    
}
