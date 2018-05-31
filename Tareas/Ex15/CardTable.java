package control4;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CardTable extends Canvas {

    private Image[][] images;
    private int cardWidth, cardHeight;


    public CardTable(String cardset) {
        setBackground(Color.GREEN);
        images = new Image[14][4];
        String suits = "cdhs";
        for (int suit = 0; suit <= 3; suit++) {
            char c = suits.charAt(suit);
            for (int rank = 1; rank <= 13; rank++) {
                String s = String.format("%s/%02d%c.gif", cardset, rank, c);
                images[rank][suit] = new ImageIcon(s).getImage();
            }
        }
        cardWidth = images[1][1].getWidth(null);
        cardHeight = images[1][1].getHeight(null);
        setTableSize(14, 4);
    }

    public void setTableSize(double x, double y) {
        setSize((int) (x * cardWidth),  (int) (y * cardHeight));
    }
    public void drawCard(Graphics g, int rank, int suit, int x, int y) {
        Image image = images[rank][suit];
        g.drawImage(image, x * cardWidth,y * cardHeight,  null);
    }
    public void paint(Graphics g) {
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 0; suit <= 3; suit++) {
                int x = rank - 1 + suit / 5;
                int y = suit / 2;
                drawCard(g, rank, suit, x, y);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String cardset = "cardset-oxymoron";
        Canvas canvas = new CardTable(cardset);
        frame.getContentPane().add(canvas);

        frame.pack();
        frame.setVisible(true);
    }

}
