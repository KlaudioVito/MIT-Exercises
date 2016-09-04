/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A6;

import java.awt.Graphics;

/**
 *
 * @author Klaudio Vito © 2016
 */
public interface Mover {
   public void setMovementVector(int xIncrement, int yIncrement);
    public void draw(Graphics surface);
}
