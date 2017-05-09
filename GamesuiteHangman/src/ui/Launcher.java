package ui;

import javax.swing.JOptionPane;
import domain.*;

public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Hallo, wat is jouw naam?");
		Speler speler = null;
		
		try{	
			 speler = new Speler(naam);;
		}
		catch (DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
			
		}
		Object[] games = { "Hangman", "Pictionary" };
		Object keuze = JOptionPane.showInputDialog(null, "Welke game? ", "input", JOptionPane.INFORMATION_MESSAGE, null, games, null);

		if (keuze.equals("Pictionary")) {
			PictionaryUi.toonMenu();
		}

		else if (keuze.equals("Hangman")) {
			WoordenLijst woordenlijst = null;
			HangManUi hangman = new HangManUi(speler, woordenlijst);
			hangman.play();
		}

	}
}
