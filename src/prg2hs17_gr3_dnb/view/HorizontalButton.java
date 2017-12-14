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
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author Daniel Ouwehand
 */
public class HorizontalButton extends JButton{
    
    private final Dimension HORIZONTALSIZE = new Dimension(80, 20);
    
    public HorizontalButton(){
        
        this.setPreferredSize(HORIZONTALSIZE);
        
        this.setEnabled(true);
    
    }
    
}