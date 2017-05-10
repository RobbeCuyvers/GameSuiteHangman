package ui;

import javax.swing.JOptionPane;

import domain.DomainException;
import domain.HintWoord;
import domain.Speler;
import domain.WoordenLijst;

public class HangManUi {
	private Speler speler;
	private WoordenLijst woordenlijst;
	
	public HangManUi(Speler speler, WoordenLijst woordenlijst){
		if(speler==null||woordenlijst==null){
			throw new UiException("Ongeldige speler of woordenlijst.");
		}
		
		this.speler = speler;
		this.woordenlijst = woordenlijst;
	}
	
	
	public void play(){
		
		
		try{
			
			//Hardcoded word
			HintWoord woord = new HintWoord(woordenlijst.getRandomWoord());
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