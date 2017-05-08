package ui;

import javax.swing.JOptionPane;

import domain.*;

public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler = new Speler(naam);

		JOptionPane.showMessageDialog(null, "... zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("x-coordinaat van het middelpunt:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("y-coordinaat van het middelpunt:"));
		int radius = Integer.parseInt(JOptionPane.showInputDialog("Radius van de cirkel:"));
		Punt punt = new Punt(x,y);
		Cirkel cirkel = new Cirkel(punt, radius);
		JOptionPane.showMessageDialog(null, "U heeft een correcte cirkel aangemaakt: "+cirkel.toString(), speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		
	}

}
