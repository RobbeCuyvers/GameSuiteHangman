package ui;

import javax.swing.JOptionPane;
import domain.*;


public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler =null;
		boolean lus = true;
		do {
			
		try {
		 speler = new Speler(naam);
		 lus = false;
		}
		catch (DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage(),null, JOptionPane.ERROR_MESSAGE);
			
		}
		}
		while(lus);
		lus = true;
		
		JOptionPane.showMessageDialog(null, "... zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		
		Object[] shapes = {"Cirkel", "Rechthoek"};
		
		
		Object keuze = JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);;
		
		do {
			
			try {
		if (keuze.equals("Cirkel")){
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("x-coordinaat van het middelpunt:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("y-coordinaat van het middelpunt:"));
		int radius = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel:"));
		Punt punt = new Punt(x,y);
		Cirkel cirkel = new Cirkel(punt, radius);
		
		JOptionPane.showMessageDialog(null, "U heeft een correcte cirkel aangemaakt: "+cirkel.toString(), speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
	}
		if (keuze.equals("Rechthoek")){
			int x = Integer.parseInt(JOptionPane.showInputDialog("x-coordinaat van linkerbovenhoek:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("y-coordinaat van linkerbovenhoek:"));
			
			Punt punt = new Punt(x,y);
			int breedte = Integer.parseInt(JOptionPane.showInputDialog("x-coordinaat van breedte:"));
			int hoogte = Integer.parseInt(JOptionPane.showInputDialog("y-coordinaat van hoogte:"));
			Rechthoek rechthoek = new Rechthoek(punt, breedte, hoogte);
			
			JOptionPane.showMessageDialog(null, "U heeft een correcte rechthoek aangemaakt: "+ rechthoek.toString(), speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		lus = false;
			}
			catch (DomainException e){
				JOptionPane.showMessageDialog(null, e.getMessage(),null, JOptionPane.ERROR_MESSAGE);
				
			}
			catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Gelieve een geldig getal in te vullen.",null, JOptionPane.ERROR_MESSAGE);
			}
			}
			while(lus);
			lus = true;
			

}
}
