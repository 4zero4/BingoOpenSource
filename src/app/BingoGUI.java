package app;

import java.awt.*;
import javax.swing.*;

public class BingoGUI extends JFrame {

private static final long serialVersionUID = 1L;
MovingTextPanel drawing;

public BingoGUI() {
	
	//Setting up a fullscreen window
	super();
    this.setTitle("Bingo");
    this.setUndecorated(true);
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setVisible(true);
    
    
    drawing = new MovingTextPanel();
 
     this.getContentPane().setLayout(new BorderLayout());
     this.getContentPane().add(drawing, BorderLayout.CENTER);

     drawing.requestFocus(); // Give the panel focus.
 }
 
}
