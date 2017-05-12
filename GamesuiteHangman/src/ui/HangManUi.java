package ui;

import javax.swing.JOptionPane;

import domain.DomainException;
import domain.HangMan;
import domain.HintWoord;
import domain.Speler;
import domain.TekeningHangMan;
import domain.WoordenLijst;

public class HangManUi {
	private Speler speler;
	private WoordenLijst woordenlijst;
	private String titel;

	public HangManUi(Speler speler, WoordenLijst woordenlijst) {
		if (speler == null || woordenlijst == null) {
			throw new UiException("Ongeldige speler of woordenlijst.");
		}

		this.speler = speler;
		this.woordenlijst = woordenlijst;
		titel = speler.getNaam()+" - Hangman";
	}

	public void play() {		
		int n =JOptionPane.YES_OPTION;
		
		while(n == JOptionPane.YES_OPTION){
			
			
			HangMan spel = new HangMan(speler, woordenlijst);
			HangmanPaneel spelpaneel = new HangmanPaneel(spel);
			HangManHoofdScherm hangman = new HangManHoofdScherm(spel, spelpaneel);
			
			hangman.start();
			//Another game?
			n = JOptionPane.showConfirmDialog(null, "Wilt u nog eens spelen?", titel, JOptionPane.YES_NO_OPTION);
		}
		System.exit(0);
		
		
		

	}

}
