package ui;

import javax.swing.JOptionPane;
import domain.*;

import domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler = new Speler(naam);

		JOptionPane.showMessageDialog(null, "... zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Geef de X-coördinaat"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Geef de Y-coördinaat"));
		Punt punt1 = new Punt(x, y);
		JOptionPane.showMessageDialog(null, punt1);
	}

}
