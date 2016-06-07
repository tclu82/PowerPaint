/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package tool;

import gui.GUIPanel;

import java.awt.Point;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Path2D;

import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * This Pencil class.
 *
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public class Pencil extends AbstractTool {

    /** A generated serialization ID. */
    private static final long serialVersionUID = -4307175200322205310L;
    
    /** A string is used for image icon. */
    private static final String ICON_LOCATION = "pencil_bw.gif";
    
    /** A GUIPanel is used for paint components. */
    private final GUIPanel myPanel;
    
    /** A shape represents pencil class. */
    private Path2D.Double myPath;
    
    /** An end point. */
    private Point myEndPoint;
    
    /**
     * The constructor creates Pencil with String and relative icon.
     * Initial private fields with reasonable values.
     * 
     * @param thePanel the GUIPanel is used to draw Pencil instances.
     */
    public Pencil(final GUIPanel thePanel) {   
        super("Pencil", new ImageIcon(ICON_FOLDER + ICON_LOCATION));
      
        /** Set mnemonic key for underline. */
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P); 
        myPanel = thePanel;
        myPath = new Path2D.Double();
        
        /** Set Pencil to current shape. */
        myPanel.setShape(myPath);
        myPanel.setTool(this);
    }
    
    /* (non-Javadoc)
     * @see model.Tool#setStartPoint(java.awt.Point)
     */
    @Override
    public void setStartPoint(final Point thePoint) {
       
        if (myEndPoint != null) {
            myPath = new Path2D.Double();
            myPanel.setShape(myPath);
        }
        myPath.moveTo(thePoint.getX(), thePoint.getY());
    }
    
    /* (non-Javadoc)
     * @see model.Tool#setEndPoint(java.awt.Point)
     */
    @Override
    public void setEndPoint(final Point thePoint) {
        
        /** Defensive copy. */
        myEndPoint = (Point) thePoint.clone();
        myPath.lineTo(myEndPoint.getX(), myEndPoint.getY());
    }
    
    /* (non-Javadoc)
     * @see model.Tool#getShape()
     */
    @Override
    public Shape getShape() {
        return (Path2D.Double) myPath.clone();
    }
    
    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setTool(this);
        myPanel.setShape(myPath);
    }
}
