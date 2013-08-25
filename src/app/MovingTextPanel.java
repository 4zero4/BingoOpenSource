package app;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MovingTextPanel extends JPanel implements KeyListener {

	private static final long serialVersionUID = 1L;
	
    String display = "";
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    private int x = screenSize.width/2-200;  // Initial coordinates of the string
    private int y = 3*(screenSize.height/4);
    
    private JLabel hist = new JLabel(""); //History for what is typed
    
    private Font b = new Font("sansserif", Font.PLAIN, 350);
    private Font s = new Font("sansserif", Font.PLAIN, 40);
    
    public String temp = "";
    
    public MovingTextPanel() {
    	hist.setFont(s);
        this.setBackground(Color.white);
        this.add(hist, BorderLayout.NORTH);
        this.setFont(b);
        this.addKeyListener(this);
        this.setFocusable(true);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(display, x, y); //Draw string
        hist.setText("<html><div style=\'width:"+(5*screenSize.width/8)+"px;\'>"+ temp +"</div></html>"); //Draw history

    }

    //==================================================== keyTyped listener
    public void keyTyped(KeyEvent kevt) {
        //System.out.println("keyTyped");
        char c = kevt.getKeyChar();
        if (c == '\b') { // if this is a backspace, remove last character
            if (display.length() > 0) {
                display = display.substring(0, display.length()-1);
            }
        } else {
            display += c;
        }
        this.repaint();
    }

    //================================================== keyPressed listener
    
    public void keyPressed(KeyEvent e) { 
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER : 
            	temp += (display+" ");
            	display = "";
            	break;
            	
            case KeyEvent.VK_CONTROL :
            		temp="";
         }
      
        this.repaint();  // Display the changes.
    }
    
    public void keyReleased(KeyEvent ke) {} // Ignore.
}
