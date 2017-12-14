/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Daniel Ouwehand
 */
public class MainFrame extends JFrame{
    
    private PlayPanel playField = new PlayPanel();
    private JLabel ownPoints = new JLabel();
    
    
    
    
    public MainFrame(){
        
        super("Dots and Boxes");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(new BorderLayout());
        setResizable(false);
        
        add(playField, BorderLayout.CENTER);
        
        setVisible(true);
    
    
    }
    
    
    
    
}
