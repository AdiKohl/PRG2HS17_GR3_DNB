/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.view;

/**
 *
 * @author Daniel Ouwehand
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.*;
import prg2hs17_gr3_dnb.model.Owner;

/**
 *
 * @author Daniel Ouwehand
 */
public class PlayPanel extends JPanel {
    
    //attribut sizeX und sizeY bruchts gar nid da sie via getter methode berrechnet wird
    //private final int sizeX = 380;
    //private final int sizeY = 380;
    private final int pointDist = 100;
    private final int pointDia = 20;
    private final int borderDist = 30;
    private final int pointsX = 4;
    private final int pointsY = 4;
            
    
    
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);

        setSize(getSizeX(), getSizeY());

        g.setColor(Color.black);
        /*g.fillOval(30, 30, 20, 20);
        g.fillOval(130, 30, 20, 20);
        g.fillOval(230, 30, 20, 20);
        g.fillOval(330, 30, 20, 20);
        g.fillOval(30, 130, 20, 20);
        g.fillOval(130, 130, 20, 20);
        g.fillOval(230, 130, 20, 20);
        g.fillOval(330, 130, 20, 20);
        g.fillOval(30, 230, 20, 20);
        g.fillOval(130, 230, 20, 20);
        g.fillOval(230, 230, 20, 20);
        g.fillOval(330, 230, 20, 20);
        g.fillOval(30, 330, 20, 20);
        g.fillOval(130, 330, 20, 20);
        g.fillOval(230, 330, 20, 20);
        g.fillOval(330, 330, 20, 20);*/
        
        for(int y = 0; y <= pointsY;y++){
            for(int x = 0; x <= pointsX;x++){
                
                g.fillOval(borderDist + x*pointDist-pointDia/2, borderDist+y*pointDist-pointDia/2, pointDia, pointDia);
            
            }
        
        }
        
        

    }
    
    
    public void drawLine(int x1, int y1, int x2, int y2,Owner o){
        
        Graphics g = null;
        
        super.paintComponent(g);
        
        switch (o){
            
            case GUEST: g.setColor(Color.red);
                        
                        break;
                        
            case HOST:  g.setColor(Color.blue);
                        
                        break;
                        
            default: g.setColor(Color.green);
            
            
        
        
        }
        
        g.drawLine(x1,y1,x2,y2);
    
    }
    
    public int getSizeX(){
        
        return (pointsX-1)*pointDist + 2*borderDist;
    
    }

    public int getSizeY() {
        return (pointsY-1)*pointDist + 2*borderDist;
    }

    public int getPointDist() {
        return pointDist;
    }

    public int getPointDia() {
        return pointDia;
    }

    public int getBorderDist() {
        return borderDist;
    }

    public int getPointsX() {
        return pointsX;
    }

    public int getPointsY() {
        return pointsY;
    }
    
    
    
    

    

}
