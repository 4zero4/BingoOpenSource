package app;

import javax.swing.*;

public class Bingo extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
    	JFrame window = new BingoGUI();
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}