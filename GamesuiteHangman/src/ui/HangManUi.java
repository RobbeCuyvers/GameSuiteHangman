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
		
		/**TekeningHangMan tekening = new TekeningHangMan("Hangman");
		
		
		GameHoofdScherm view = new GameHoofdScherm(speler.getNaam(), tekening);
		view.setVisible(true);
		
		view.teken();
		 
		try {
			HintWoord woord = new HintWoord(woordenlijst.getRandomWoord());
			String begin = "";
			String gelukt = "Super, doe zo voor!\n" + begin;
			String mislukt = "Helaas, volgende keer beter!\n";

			while (!woord.isGeraden()) {
				String raad = "";
				
				do {
					raad = JOptionPane.showInputDialog(null,
							begin + "Rarara, welk woord zoeken we\n" + woord.toString() + "\nGeef een letter:",
							"Hangman - " + speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
				} while (raad.trim().isEmpty());

				char letter = raad.toCharArray()[0];
				begin = (woord.raad(letter) ? gelukt : mislukt);
				if(begin.equals(mislukt)){
					tekening.zetVolgendeZichtbaar();
				}
				view.repaint();
				view.teken();
			}
			
			
		} catch (DomainException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);

		} catch (NullPointerException e){
			
		}
		*/
		
		

	}

}
