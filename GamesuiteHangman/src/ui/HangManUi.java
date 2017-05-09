package ui;

import javax.swing.JOptionPane;

import domain.DomainException;
import domain.HintWoord;
import domain.Speler;

public class HangManUi {
	public static void play(){
		String naam = JOptionPane.showInputDialog("Hallo, wat is jouw naam?");
		Speler speler;
		
		try{
			speler = new Speler(naam);
			//Hardcoded word
			HintWoord woord = new HintWoord("appel");
			String begin = "";
			String gelukt = "Super, doe zo voor!\n"+begin;
			String mislukt = "Helaas, volgende keer beter!\n";
			
			while(!woord.isGeraden()){
				char letter = JOptionPane.showInputDialog(null, begin+"Rarara, welk woord zoeken we\n"+woord.toString()+"\nGeef een letter:", "Hangman - "+speler.getNaam(), JOptionPane.INFORMATION_MESSAGE).toCharArray()[0];
				begin = (woord.raad(letter)?gelukt:mislukt);
			}
			
		}
		catch (DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
			
		}
		
		
	}
}
