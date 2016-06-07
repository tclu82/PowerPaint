/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package tool;

import gui.GUIPanel;

import java.awt.Point;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;

import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * This Line class.
 *
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public class Line extends AbstractTool {
    
    /** A generated serialization ID. */
    private static final long serialVersionUID = 3356800814526470927L;
    
    /** A string is used for image icon. */
    private static final String ICON_LOCATION = "line_bw.gif";

    /** A GUIPanel is used for paint components. */
    private final GUIPanel myPanel;
    
    /** A shape represents line class. */
    private final Line2D.Double myLine;
    
    /**
     * The constructor creates Line with String and relative icon.
     * Initial private fields with reasonable values.
     * 
     * @param thePanel the GUIPanel is used to draw Line instances.
     */
    public Line(final GUIPanel thePanel) {
        super("Line", new ImageIcon(ICON_FOLDER + ICON_LOCATION));
        
        /** Set mnemonic key for underline. */
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_L); 
        myPanel = thePanel;
        myLine = new Line2D.Double();
    }

    /* (non-Javadoc)
     * @see model.Tool#setStartPoint(java.awt.Point)
     */
    @Override
    public void setStartPoint(final Point thePoint) {
        
        /**Defensive copy.*/
        final Point copy = (Point) thePoint.clone();
        myLine.x1 = copy.getX();
        myLine.y1 = copy.getY();
    }

    /* (non-Javadoc)
     * @see model.Tool#setEndPoint(java.awt.Point)
     */
    @Override
    public void setEndPoint(final Point thePoint) {
        /**Defensive copy.*/
        final Point copy = (Point) thePoint.clone();
        
        myLine.x2 = copy.getX();
        myLine.y2 = copy.getY();
    }

    /* (non-Javadoc)
     * @see model.Tool#getShape()
     */
    @Override
    public Shape getShape() {
        return (Line2D.Double) myLine.clone();
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setTool(this);
        myPanel.setShape(myLine);
    }
}
