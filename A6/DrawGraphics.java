package A6;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Bouncer> movingSprite = new ArrayList<>();
    ArrayList<StraightMover> straightSprite = new ArrayList<>();
    ArrayList<Mover> objects = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Rectangle box1 = new Rectangle(40,40, Color.GREEN);
        
        Oval oval = new Oval (30,30, Color.BLUE);
        Oval oval1 = new Oval(20,50, Color.CYAN);
        
        objects.add(new Bouncer(100, 170, box));
        objects.add(new StraightMover(100,70, box1));
        objects.add(new Bouncer(200, 50, oval));
        objects.add(new StraightMover(100,70, oval1));
        
        objects.get(0).setMovementVector(3, 1);
        objects.get(1).setMovementVector(-1, 1);
        objects.get(2).setMovementVector(1, 3);
        objects.get(3).setMovementVector(-2, 3);
        
//        movingSprite.add(new Bouncer(100, 170, box));
//        movingSprite.add(new Bouncer(200, 50, oval));
//        
//        straightSprite.add(new StraightMover(100,70, box1));
//        straightSprite.add(new StraightMover(100,70, oval1));
//        
//        movingSprite.get(0).setMovementVector(3, 1);
//        movingSprite.get(1).setMovementVector(1, 3);
//        
//        straightSprite.get(0).setMovementVector(-1, 1);
//        straightSprite.get(1).setMovementVector(-2, 3);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        //for(Bouncer b : movingSprite) b.draw(surface);
        //for(StraightMover sm : straightSprite) sm.draw(surface);
        for(Mover o : objects) o.draw(surface);
    }
}
