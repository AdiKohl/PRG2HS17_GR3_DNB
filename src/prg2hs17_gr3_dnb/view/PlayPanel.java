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

/**
 *
 * @author Daniel Ouwehand
 */
public class PlayPanel extends JPanel {
    
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);

        setSize(380, 380);

        g.setColor(Color.black);
        g.fillOval(30, 30, 20, 20);
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
        g.fillOval(330, 330, 20, 20);
        
        

    }

    public void setMouseListener(MouseListener l){
        this.addMouseListener(l);
    }
    
    /*
    public void mouseClicked(MouseEvent arg0) {
        
        
        System.out.println("Hey, that was a click!");

    }

    public void mouseExited(MouseEvent arg0) {

    }

    public void mouseEntered(MouseEvent arg0) {

    }

    public void mousePressed(MouseEvent arg0) {

    }

    public void mouseReleased(MouseEvent arg0) {

        
    }*/

}
