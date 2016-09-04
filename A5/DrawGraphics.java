/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Klaudio Vito © 2016
 */
public class DrawGraphics {
    BouncingBox box1, box2, box3;
    ArrayList<BouncingBox> boxes = new ArrayList<>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(200, 50, Color.RED);
        box2 = new BouncingBox(30, 150, Color.GREEN);
        box3 = new BouncingBox(300, 30, Color.BLUE);
        box1.setMovementVector(2, 1);
        box2.setMovementVector(-1, 1);
        box3.setMovementVector(3, -1);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        //surface.drawLine(50, 50, 250, 250);
        //surface.drawOval(10, 50, 250, 150);
        for(BouncingBox bb : boxes) bb.draw(surface);
    }
}
