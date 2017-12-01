/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Daniel Ouwehand
 */
public class Credits extends JFrame{
    
    private final JLabel lucien = new JLabel("Lucien Egloff");
    private final JLabel adrian = new JLabel("Adrian Kohler");
    private final JLabel daniel = new JLabel("Daniel Ouwehand");
    private final JLabel peter = new JLabel("Peter Zürcher");
    private final JLabel top = new JLabel("Credits");
    private JPanel panel = new JPanel();

    public Credits() {
        
        super("Dots and Boxes");
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLayout(new BorderLayout());
        
        add(top, BorderLayout.NORTH);
        top.setBorder(BorderFactory.createEmptyBorder(20, 40, 0, 0));
        top.setFont(new Font("Serif",Font.BOLD ,50));
        
        
        
        
        add(panel,BorderLayout.CENTER);
        panel.setLayout(new GridLayout(4,1));
        panel.setBorder(BorderFactory.createEmptyBorder(60, 40, 140, 0));
        panel.add(lucien);
        panel.add(adrian);
        panel.add(daniel);
        panel.add(peter);
        
        
        lucien.setFont(new Font("Serif",Font.BOLD ,20));
        adrian.setFont(new Font("Serif",Font.BOLD ,20));
        daniel.setFont(new Font("Serif",Font.BOLD ,20));
        peter.setFont(new Font("Serif",Font.BOLD ,20));
        
                
        
        
        
        setVisible(true);
        
    }
    
    
    
}
