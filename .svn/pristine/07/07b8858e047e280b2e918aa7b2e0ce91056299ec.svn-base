/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package action;

import gui.GUIPanel;
import javax.swing.Action;
import tool.Ellipse;
import tool.Line;
import tool.Pencil;
import tool.Rectangle;

/**
 * An Array to collect the shape actions.
 *
 * @author Tzu-Chien Lu
 * @version Nov 20 2015
 */
public class ToolsActions {
    
    /** An array contains all actions we need in ToolsActions class. */
    private Action[] myActions;
    
    /**
     * Constructor for  ToolsActions class.
     * 
     * @param thePanel a GUIPanel is used for drawing.
     */
    public ToolsActions(final GUIPanel thePanel) {
        
        /** Call the setup method for initialize the private field.*/
        setup(thePanel);
    }
    
    /**
     * A private method add 4 actions in an array then send to constructor.
     * 
     * @param thePanel a panel is used to draw all shapes.
     */
    private void setup(final GUIPanel thePanel) {
        myActions = new Action[] {new Pencil(thePanel),
                                  new Line(thePanel),
                                  new Rectangle(thePanel),
                                  new Ellipse(thePanel)};
    }
    
    /**
     * A getter method for other classes access the Action array copy.
     * 
     * @return a clone of myActions.
     */
    public Action[] getActions() {
        
        /** A shallow copy. */
        return myActions.clone();
    }
}
