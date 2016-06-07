/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package tool;

import gui.GUIPanel;

import java.awt.Point;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * This Ellipse class.
 *
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public class Ellipse extends AbstractTool {
    
    /** A generated serialization ID. */
    private static final long serialVersionUID = 3526768047092507092L;
    
    /** A string is used for image icon. */
    private static final String ICON_LOCATION = "ellipse_bw.gif";
    
    /** A GUIPanel is used for paint components. */
    private final GUIPanel myPanel;
    
    /** A shape represents ellipse class. */
    private final Ellipse2D.Double myShape;

    /**
     * The constructor creates Ellipse with String and relative icon.
     * Initial private fields with reasonable values.
     * 
     * @param thePanel the GUIPanel is used to draw Ellipse instances.
     */
    public Ellipse(final GUIPanel thePanel) {
        super("Ellipse", new ImageIcon(ICON_FOLDER + ICON_LOCATION));
        
        /** Set mnemonic key for underline. */
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_E);       
        myPanel = thePanel;
        myShape = new Ellipse2D.Double();
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
        return (Ellipse2D.Double) myShape.clone();
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
