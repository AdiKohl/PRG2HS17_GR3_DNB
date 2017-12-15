/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import prg2hs17_gr3_dnb.controller.DnBController;

/**
 *
 * @author Daniel Ouwehand
 */
public class MenuFrame extends JFrame{
    
    private final JButton singleplayer = new JButton ("Singleplayer");
    private final JButton multiplayer = new JButton ("Multiplayer");
    private final JButton credits = new JButton ("Credits");
    private final JButton quit = new JButton ("Quit");
    private final JPanel panel = new JPanel();
    private final JLabel label = new JLabel("Mainmenu");
    private MainFrame mainFrame;
    private Credits2 creditFrame;

    public MenuFrame() {
        
        super("Dots and Boxes");
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 600);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        
        add(label, BorderLayout.NORTH);
        
        label.setFont(new Font("Serif",Font.BOLD ,50));       
        
        
        setResizable(false);       
        
        
        panel.setLayout(new GridLayout(4, 1,0,40));
        panel.setBorder(BorderFactory.createEmptyBorder(80, 200, 40, 200));
        label.setBorder(BorderFactory.createEmptyBorder(80, 220, 0, 0));
        
        
        panel.add(singleplayer);
        panel.add(multiplayer);
        panel.add(credits);
        panel.add(quit);  
        
        credits.addActionListener((ActionEvent e) -> {
            creditsPressed();
        });
        
        
        
        singleplayer.addActionListener((ActionEvent e) -> {
            singelplayerPressed();
        });
        
        quit.addActionListener((ActionEvent e) -> {
            quitPressed();
        });
        
        
        
        setVisible(true);
        
    }
    
    public void setCreditsListener(ActionListener l){
        this.credits.addActionListener(l);
    }
    
    
   public void creditsPressed() {
        this.creditFrame = new Credits2();
        this.creditFrame.setVisible(true);
        this.setVisible(false);

    }
   
   public void singelplayerPressed() {
        this.mainFrame = new MainFrame();
        this.mainFrame.setVisible(true);
        
        this.setVisible(false);

    }
   
   public void quitPressed() {
        System.exit(0);

    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public Credits2 getCreditFrame() {
        return creditFrame;
    }
   
   
   
   
    
    
    
    
    
    
}
