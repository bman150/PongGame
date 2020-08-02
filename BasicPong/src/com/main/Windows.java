package com.main;

import javax.swing.JFrame;

public class Windows {

	public Windows(String title, Game game) {
		JFrame frame = new JFrame(title);
		
		// Initialize variables
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit game when x button in frame is clicked on
		frame.setResizable(false); // prevents game window from being resized.
		frame.add(game);
		frame.pack();
		frame.setLocationRelativeTo(null); // orients the window to the center of the screen
		frame.setVisible(true);
		
		game.start();
	}

}
