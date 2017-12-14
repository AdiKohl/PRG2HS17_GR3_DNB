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

/**
 *
 * @author Daniel Ouwehand
 */
public class PlayPanel extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        
        setSize(340,340);
        
        g.setColor(Color.black);
        g.fillOval(10, 10, 20, 20);
        g.fillOval(110, 10, 20, 20);
        g.fillOval(210, 10, 20, 20);
        g.fillOval(310, 10, 20, 20);
        g.fillOval(10, 110, 20, 20);
        g.fillOval(110, 110, 20, 20);
        g.fillOval(210, 110, 20, 20);
        g.fillOval(310, 110, 20, 20);
        g.fillOval(10, 210, 20, 20);
        g.fillOval(110, 210, 20, 20);
        g.fillOval(210, 210, 20, 20);
        g.fillOval(310, 210, 20, 20);
        g.fillOval(10, 310, 20, 20);
        g.fillOval(110, 310, 20, 20);
        g.fillOval(210, 310, 20, 20);
        g.fillOval(310, 310, 20, 20);
        
        
        
        
    }
    
    
    
}