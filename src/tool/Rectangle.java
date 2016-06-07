/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package tool;

import gui.GUIPanel;

import java.awt.Point;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * This Rectangle class.
 *
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public class Rectangle extends AbstractTool {
    
    /** A generated serialization ID. */
    private static final long serialVersionUID = -7502296614290365916L;
    
    /** A string is used for image icon. */
    private static final String ICON_LOCATION = "rectangle_bw.gif";

    /** A GUIPanel is used for paint components. */
    private final GUIPanel myPanel;
    
    /** A shape represents rectangle class. */
    private final Rectangle2D.Double myShape;
    
    /**
     * The constructor creates Rectangle with String and relative icon.
     * Initial private fields with reasonable values.
     * 
     * @param thePanel the GUIPanel is used to draw Rectangle instances.
     */
    public Rectangle(final GUIPanel thePanel) {
        super("Rectangle", new ImageIcon(ICON_FOLDER + ICON_LOCATION));
        
        /** Set mnemonic key for underline. */
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
        myPanel = thePanel;
        myShape = new Rectangle2D.Double();
    }

    /* (non-Javadoc)
     * @see model.Tool#setEndPoint(java.awt.Point)
     */
    @Override
    public void setEndPoint(final Point thePoint) {
        myShape.setFrameFromDiagonal(myStartPoint, (Point) thePoint.clone());
    }

    /* (non-Javadoc)
     * @see model.Tool#getShape()
     */
    @Override
    public Shape getShape() {
        return (Rectangle2D.Double) myShape.clone();
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setTool(this);
        myPanel.setShape(myShape);
    }
}
