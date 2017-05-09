package ui;

import javax.swing.JOptionPane;
import domain.*;

public class Launcher {

	public static void main(String[] args) {
			

		
		Object[] games = { "Hangman", "Pictionary" };
		Object keuze = JOptionPane.showInputDialog(null, "Welke game? ", "input", JOptionPane.INFORMATION_MESSAGE, null, games, null);

		if (keuze.equals("Pictionary")) {
			PictionaryUi.toonMenu();
		}

		else if (keuze.equals("Hangman")) {
			HangManUi.play();
		}

	}
}
