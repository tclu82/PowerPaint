/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

/**
 * The GUIIcon class is a class used for JMenuItem icon display.
 * 
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public class GUIIcon implements Icon {
    
    /** Square icon length constant for color selection. */
    private static final int MY_LENGTH = 20;
    
    /** Icon color field. */
    private Color myColor;
    
    /**
     * The constructor of GUIIcon.
     * 
     * @param theColor a color is used for icon.
     */
    public GUIIcon(final Color theColor) {
        myColor = theColor;
    }

    /* (non-Javadoc)
     * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
     * 
     * This method I use for JMenuItem "Color" to show the color icon "square".
     */
    @Override
    public void paintIcon(final Component theComponent, final Graphics theGraphics, 
                          final int theX, final int theY) {
        theGraphics.setColor(myColor);
        
        /** Fill and draw the rectangle, actually it's a square. */
        theGraphics.fillRect(theX, theY, MY_LENGTH - 1, MY_LENGTH - 1);
        //theGraphics.drawRect(theX, theY, MY_LENGTH - 1, MY_LENGTH - 1);
    }

    /* (non-Javadoc)
     * @see javax.swing.Icon#getIconWidth()
     * 
     * Return image width for color icon.
     */
    @Override
    public int getIconWidth() {
        return MY_LENGTH;
    }

    /* (non-Javadoc)
     * @see javax.swing.Icon#getIconHeight()
     * 
     * Return image height for color icon.
     */
    @Override
    public int getIconHeight() {
        return MY_LENGTH;
    }
    
    /**
     *  Setter method for paint icon color for JMenuBarItem.
     *
     *  @param theColor color for setting.
     */
    public void setColor(final Color theColor) {
        myColor = theColor;
    }
}
