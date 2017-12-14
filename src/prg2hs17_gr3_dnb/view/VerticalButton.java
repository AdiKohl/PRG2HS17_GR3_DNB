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
public class VerticalButton extends JButton{
    
    private final Dimension VERTICALSIZE = new Dimension(20, 80);
    
    
    public VerticalButton(){
        
        this.setPreferredSize(VERTICALSIZE);
        
        this.setEnabled(true);
    
    }
    
}
