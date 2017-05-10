package ui;

import javax.swing.JOptionPane;

import db.WoordenLezer;
import domain.*;

public class Launcher {

	public static void main(String[] args) {
		Punt punt1 = new Punt(10, 20);
		Punt punt2 = new Punt(190, 30);
		LijnStuk lijn = new LijnStuk(punt1, punt2);
		lijn.teken(null);
		
		
		String naam = JOptionPane.showInputDialog("Hallo, wat is jouw naam?");
		Speler speler = null;

		try {
			speler = new Speler(naam);
			;
		} catch (DomainException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
		}
		Object[] games = { "Hangman", "Pictionary" };
		Object keuze = JOptionPane.showInputDialog(null, "Welke game? ", "input", JOptionPane.INFORMATION_MESSAGE, null,
				games, null);

		if (keuze.equals("Pictionary")) {
			PictionaryUi.play();
		} else if (keuze.equals("Hangman")) {
			WoordenLezer woordenLezer = new WoordenLezer("hangman.txt");
			WoordenLijst woordenlijst = woordenLezer.lees();

			HangManUi hangman = new HangManUi(speler, woordenlijst);
			hangman.play();
		}
	}
}
