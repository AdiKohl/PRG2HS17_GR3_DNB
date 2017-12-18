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
import java.util.LinkedList;
import prg2hs17_gr3_dnb.model.Owner;

/**
 *
 * @author Daniel Ouwehand
 */
public class PlayPanel extends JPanel {

    //attribut sizeX und sizeY bruchts gar nid da sie via getter methode berrechnet wird
    //private final int sizeX = 380;
    //private final int sizeY = 380;
    private final int pointDist = 100;
    private final int pointDia = 20;
    private final int borderDist = 30;
    private final int pointsX = 4;
    private final int pointsY = 4;

    private static class Line {

        final int x1;
        final int y1;
        final int x2;
        final int y2;
        final Color color;

        public Line(int x1, int y1, int x2, int y2, Color color) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
        }
    }

    private final LinkedList<Line> lines = new LinkedList<Line>();


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);

        setSize(getSizeX(), getSizeY());

        g.setColor(Color.black);
        /*g.fillOval(30, 30, 20, 20);
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
        g.fillOval(330, 330, 20, 20);*/

        for (int y = 0; y <= pointsY; y++) {
            for (int x = 0; x <= pointsX; x++) {

                g.fillOval(borderDist + x * pointDist - pointDia / 2, borderDist + y * pointDist - pointDia / 2, pointDia, pointDia);

            }

        }

        for (Line line : lines) {
            g.setColor(line.color);
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }

    }

    public void drawBorder(int x, int y, int b, Owner o) {
        switch (o) {
            case GUEST:
                switch (b) {
                    case 1:
                        lines.add(new Line(borderDist + x * pointDist, borderDist + y * pointDist, borderDist + x * pointDist, borderDist + (y + 1) * pointDist, Color.RED));
                        break;
                    case 2:
                        lines.add(new Line(borderDist + x * pointDist, borderDist + y * pointDist, borderDist + (x + 1) * pointDist, borderDist + y * pointDist, Color.RED));
                        break;
                    case 3:
                        lines.add(new Line(borderDist + (x + 1) * pointDist, borderDist + y * pointDist, borderDist + (x + 1) * pointDist, borderDist + (y + 1) * pointDist, Color.RED));
                        break;
                    case 4:
                        lines.add(new Line(borderDist + x * pointDist, borderDist + (y + 1) * pointDist, borderDist + (x + 1) * pointDist, borderDist + (y + 1) * pointDist, Color.RED));
                        break;

                }
                break;

            case HOST:
                switch (b) {
                    case 1:
                        lines.add(new Line(borderDist + x * pointDist, borderDist + y * pointDist, borderDist + x * pointDist, borderDist + (y + 1) * pointDist, Color.BLUE));
                        break;
                    case 2:
                        lines.add(new Line(borderDist + x * pointDist, borderDist + y * pointDist, borderDist + (x + 1) * pointDist, borderDist + y * pointDist, Color.BLUE));
                        break;
                    case 3:
                        lines.add(new Line(borderDist + (x + 1) * pointDist, borderDist + y * pointDist, borderDist + (x + 1) * pointDist, borderDist + (y + 1) * pointDist, Color.BLUE));
                        break;
                    case 4:
                        lines.add(new Line(borderDist + x * pointDist, borderDist + (y + 1) * pointDist, borderDist + (x + 1) * pointDist, borderDist + (y + 1) * pointDist, Color.BLUE));
                        break;

                }
                break;
        }
        repaint();

    }

    /*
    public void drawLine(int x1, int y1, int x2, int y2,Owner o){
        
        switch (o){
            
            case GUEST: g.setColor(Color.red);
                        lines.add(new Line(x1,y2,x2,y2, color));        
                        repaint();
                        
                        break;
                        
            case HOST:  g.setColor(Color.blue);
                        
                        break;
                        
            default: g.setColor(Color.green);
            
            
        
        
        }
        
        g.drawLine(x1,y1,x2,y2);
        
    
    }
     */
    public int getSizeX() {

        return (pointsX - 1) * pointDist + 2 * borderDist;

    }

    public int getSizeY() {
        return (pointsY - 1) * pointDist + 2 * borderDist;
    }

    public int getPointDist() {
        return pointDist;
    }

    public int getPointDia() {
        return pointDia;
    }

    public int getBorderDist() {
        return borderDist;
    }

    public int getPointsX() {
        return pointsX;
    }

    public int getPointsY() {
        return pointsY;
    }

}
