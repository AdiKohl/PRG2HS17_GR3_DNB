/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2hs17_gr3_dnb.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



/**
 *
 * @author Daniel Ouwehand
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createBevelBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.WindowConstants;


/**
 *
 * @author Daniel Ouwehand
 */
public class MainFrame extends JFrame {
    
    /* panel represents the play grid */
    private final JPanel mainPanel = new JPanel();
    //private final JPanel panel_Opponend = new JPanel();
    
    /** Jbutton array representing the 64 possible guesses*/
    private final HorizontalButton H1 = new HorizontalButton();
    private final HorizontalButton H2 = new HorizontalButton();
    private final HorizontalButton H3 = new HorizontalButton();
    private final HorizontalButton H4 = new HorizontalButton();
    private final HorizontalButton H5 = new HorizontalButton();
    private final HorizontalButton H6 = new HorizontalButton();
    private final HorizontalButton H7 = new HorizontalButton();
    private final HorizontalButton H8 = new HorizontalButton();
    private final HorizontalButton H9 = new HorizontalButton();
    private final HorizontalButton H10 = new HorizontalButton();
    private final HorizontalButton H11 = new HorizontalButton();
    private final HorizontalButton H12 = new HorizontalButton();
    private final VerticalButton V1 = new VerticalButton();
private final VerticalButton V2 = new VerticalButton();
private final VerticalButton V3 = new VerticalButton();
private final VerticalButton V4 = new VerticalButton();
private final VerticalButton V5 = new VerticalButton();
private final VerticalButton V6 = new VerticalButton();
private final VerticalButton V7 = new VerticalButton();
private final VerticalButton V8 = new VerticalButton();
private final VerticalButton V9 = new VerticalButton();
private final VerticalButton V10 = new VerticalButton();
private final VerticalButton V11 = new VerticalButton();
private final VerticalButton V12 = new VerticalButton();
private JPanel panel1 = new JPanel();
private JPanel panel2 = new JPanel();
private JPanel panel3 = new JPanel();
private JPanel panel4 = new JPanel();
private JPanel panel5 = new JPanel();
private JPanel panel6 = new JPanel();
private JPanel panel7 = new JPanel();
private JPanel panel8 = new JPanel();
private JPanel panel9 = new JPanel();
private JPanel space1 = new JPanel();
private JPanel space2 = new JPanel();
private JPanel space3 = new JPanel();
private JPanel space4 = new JPanel();
private JPanel space5 = new JPanel();
private JPanel space6 = new JPanel();
private JPanel space7 = new JPanel();
private JPanel space8 = new JPanel();
private JPanel space9 = new JPanel();
private JPanel space10 = new JPanel();
private JPanel space11 = new JPanel();
private JPanel space12 = new JPanel();
private JPanel space13 = new JPanel();
private JPanel space14 = new JPanel();
private JPanel space15 = new JPanel();
private JPanel space16 = new JPanel();
private final JPanel dummy1 = new JPanel();
private final JPanel dummy2 = new JPanel();
private final JPanel dummy3 = new JPanel();
private final JPanel dummy4 = new JPanel();




    
    
    
    
    
    
    
    
    
    
      
    
public MainFrame (){

    super ("Dots and Boxes");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(500,500);
             setLayout(new BorderLayout());
             setResizable(false);
             
             mainPanel.setSize(320, 320);
             mainPanel.setLayout(new GridBagLayout());
             GridBagConstraints c = new GridBagConstraints();
             mainPanel.setBorder(BorderFactory.createMatteBorder(10,10,10,10,Color.BLACK));
             
             
        add(mainPanel, BorderLayout.CENTER);
        add(dummy1,BorderLayout.NORTH);
        add(dummy2,BorderLayout.EAST);
        add(dummy3,BorderLayout.SOUTH);
        add(dummy4,BorderLayout.WEST);
        dummy1.setBorder(BorderFactory.createEmptyBorder(0, 0, 50, 0));
        dummy2.setBorder(BorderFactory.createEmptyBorder(0, 60, 0, 0));
        dummy3.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
        dummy4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 60));
       
        
       
             
             
        
        
        
       space1.setSize(10, 10);
       space2.setSize(10, 10);
       space3.setSize(10, 10);
       space4.setSize(10, 10);
       space5.setSize(10, 10);
       space6.setSize(10, 10);
       space7.setSize(10, 10);
       space8.setSize(10, 10);
       space9.setSize(10, 10);
       space10.setSize(10, 10);
       space11.setSize(10, 10);
       space13.setSize(10, 10);
       space12.setSize(10, 10);
       space14.setSize(10, 10);
       space15.setSize(10, 10);
       space16.setSize(10, 10);
       
       
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        mainPanel.add(H1,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 0;
        mainPanel.add(H2,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 0;
        mainPanel.add(H3,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(V1,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
       // c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(panel1,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        mainPanel.add(V2,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
       // c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 1;
        mainPanel.add(panel2,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
       // c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 1;
        mainPanel.add(V3,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 5;
        c.gridy = 1;
        mainPanel.add(panel3,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 6;
        c.gridy = 1;
        mainPanel.add(V4,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(H4,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 2;
        mainPanel.add(H5,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 2;
        mainPanel.add(H6,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        mainPanel.add(V5,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(panel4,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 3;
        mainPanel.add(V6,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 3;
        mainPanel.add(panel5,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 3;
        mainPanel.add(V7,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 3;
        mainPanel.add(panel6,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 3;
        mainPanel.add(V8,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 4;
        mainPanel.add(H7,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 4;
        mainPanel.add(H8,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 4;
        mainPanel.add(H9,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        mainPanel.add(V9,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 5;
        mainPanel.add(panel7,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 5;
        mainPanel.add(V10,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 5;
        mainPanel.add(panel8,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 5;
        mainPanel.add(V11,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 5;
        mainPanel.add(panel9,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 5;
        mainPanel.add(V12,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 6;
        mainPanel.add(H10,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 6;
        mainPanel.add(H11,c);
        
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 6;
        mainPanel.add(H12,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(space1, c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        mainPanel.add(space2,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 0;
        mainPanel.add(space3,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 0;
        mainPanel.add(space4,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(space5,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 2;
        mainPanel.add(space6,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 2;
        mainPanel.add(space7,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 2;
        mainPanel.add(space8,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        mainPanel.add(space9,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 4;
        mainPanel.add(space10,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 4;
        mainPanel.add(space11,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 6;
        c.gridy = 4;
        mainPanel.add(space12,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        mainPanel.add(space13,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 6;
        mainPanel.add(space14,c);
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 6;
        mainPanel.add(space15,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 6;
        c.gridy = 6;
        mainPanel.add(space16,c);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        setVisible(true);


}}
