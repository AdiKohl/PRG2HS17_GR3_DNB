/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Daniel Ouwehand
 */
public class MainFrame extends JFrame{
    
    private PlayPanel playField = new PlayPanel();
    private JLabel ownPoints = new JLabel();
    private JPanel panelNorth = new JPanel();
    private JPanel panelEast = new JPanel();
    private JPanel panelSouth = new JPanel();
    private JPanel panelWest = new JPanel();
    
    
    
    
    public MainFrame(){
        
        super("Dots and Boxes");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(new BorderLayout());
        setResizable(false);
        
        add(playField, BorderLayout.CENTER);
        add(panelNorth, BorderLayout.NORTH);
        add(panelEast, BorderLayout.EAST);
        add(panelSouth, BorderLayout.SOUTH);
        add(panelWest, BorderLayout.WEST);
        
        panelNorth.setBorder(BorderFactory.createEmptyBorder(0, 0, 200, 0));
        panelWest.setBorder(BorderFactory.createEmptyBorder(0, 200, 0, 0));
        playField.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.black));
        
        setVisible(true);
    
    
    }
    
    
    
    
}
