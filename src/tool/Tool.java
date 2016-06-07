/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package tool;

import java.awt.Point;
import java.awt.Shape;

/**
 * The interface class.
 * 
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public interface Tool {
    
    /**
     * setStartPoint method sets the start point.
     * 
     * @param thePoint is the starting point.
     */
    void setStartPoint(final Point thePoint);
    
    /**
     * setEndPoint method sets the end point.
     * 
     * @param thePoint is the ending point.
     */
    void setEndPoint(final Point thePoint);
    
    /**
     * Return the Shape type.
     * 
     * @return the Shape type of model we choose.
     */
    Shape getShape();
}
