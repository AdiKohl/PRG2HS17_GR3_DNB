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
        
        g.setColor(Color.black);
        g.fillOval(0, 0, 20, 20);
        g.fillOval(100, 0, 20, 20);
        g.fillOval(200, 0, 20, 20);
        g.fillOval(300, 0, 20, 20);
        g.fillOval(0, 100, 20, 20);
        g.fillOval(100, 100, 20, 20);
        g.fillOval(200, 100, 20, 20);
        g.fillOval(300, 100, 20, 20);
        g.fillOval(0, 200, 20, 20);
        g.fillOval(100, 200, 20, 20);
        g.fillOval(200, 200, 20, 20);
        g.fillOval(300, 200, 20, 20);
        g.fillOval(0, 300, 20, 20);
        g.fillOval(100, 300, 20, 20);
        g.fillOval(200, 300, 20, 20);
        g.fillOval(300, 300, 20, 20);
        
        
        
        
    }
    
    
    
}