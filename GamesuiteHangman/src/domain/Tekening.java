package domain;

import java.awt.Graphics;
import java.util.*;

public class Tekening implements Drawable {
	private String naam;
	private static final int MIN_X = 0, MIN_Y = 0, MAX_X = 399, MAX_Y = 399;
	private List<Vorm> vormen;
	
	public void Teken(Graphics g){
		
	}
	
	public Tekening(String naam){
		this.naam = naam;
		vormen = new ArrayList<>();	
	}

	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		if (naam == null || naam.trim().isEmpty()) {
			throw new DomainException("naam mag niet leeg zijn.");
		}
		this.naam = naam;
	}

	public int getVorm(int vorm) {
		return vorm;
	}
	
	public void voegToe(Vorm vorm){
		if (vorm == null) {
			throw new DomainException("Geen geldige vorm");
		}
		else if (vorm.getOmhullende().getMaximumX() > MAX_X && vorm.getOmhullende().getMaximumY() > MAX_Y &&
				vorm.getOmhullende().getMinimumX() < MIN_X && vorm.getOmhullende().getMinimumY() < MIN_Y) {
			throw new DomainException("De vorm past niet in de tekening");
		}
		vormen.add(vorm);	
	}
	
	public int getAantalVormen(){	
		return vormen.size();
		
	}
	
	public void verwijder(Vorm vormTeVerwijderen){
		for (int i = 0; i < vormen.size(); i++) {
			if (vormen.get(i).equals(vormTeVerwijderen)) {
				vormen.remove(i);
			}
		}
	}
	
	public boolean bevat(Vorm vorm2){
		if (vorm2 == null) {
			throw new DomainException("Ongeldige vorm");
		}
		for (Vorm vorm : vormen) {
			if (vorm.equals(vorm2)) {
				return true;
			}
		}
		return false;	
	}
	
	public String toString(){
		String res = "Tekening met naam " + getNaam() + " bestaat uit " + getAantalVormen() + " vormen: \n";
		for (Vorm vorm : vormen) {
			res += vorm;
		}
		return res;
	}
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Tekening){
			Tekening s = (Tekening) object;
			if (this.getNaam().equals(s.getNaam())) {
				return true;
			}
		}
		return false;
	}
}
