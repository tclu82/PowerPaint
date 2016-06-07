/*
 * TCSS 305 Assignment 5 - PowerPaint
 */

package gui;

import java.awt.EventQueue;

/**
 * The GUIMain class, calls the GUI class in main method.
 * 
 * @author Tzu-Chien Lu tclu82@uw.edu
 * @version Nov 20 2015
 */
public final class GUIMain {
    
    /**
     * Private constructor to inhibit external instantiation.
     */
    private GUIMain() {
        throw new IllegalStateException();
    }
    
    /**
     * The start point of the PowerPaint program.
     *
     * @param theArgs command line arguments - ignored.
     */
    public static void main(final String... theArgs) {
        
        /** An anonymous inner class. */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                /** Create a GUI instance. */
                new GUI();
            }
        });
    }
}
