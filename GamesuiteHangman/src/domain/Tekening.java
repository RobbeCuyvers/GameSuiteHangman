package domain;

import java.util.*;
import domain.Omhullende;

public class Tekening {
	private String naam;
	private static final int MIN_X = 0, MIN_Y = 0,MAX_X = 399 ,MAX_Y = 399;
	private List vormen;
	
	public Tekening(String naam){
		if (naam == null || naam.trim().isEmpty()) throw new IllegalArgumentException("naam mag niet leeg zijn.");
		this.naam = naam;
		vormen = new ArrayList();
		
	}

	public String getNaam() {
		return naam;
	}

	public int getVorm(int vorm) {
		return vorm;
	}
	
	public void voegToe(Vorm vorm){
		Tekening tekening1 = new Tekening("vorm");
		//if (MAX_X - MIN_X == Omhullende)
		
	}
	
	public int getAantalVormen(){
		int aantalvormen = 0;
		for (int i = 0; vormen.size() > i; i++ ){
			aantalvormen =+ 1;
			
		}
			
		return aantalvormen;
	}
	
	public void verwijder(Vorm vorm){
		
	}
	
	public boolean bevat(Vorm vorm){
		return true;
		
	}
	
	public String toString(){
		return null;
	}
	
	
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Tekening){
			Tekening s = (Tekening) object;
			if ()
				return true;
		}
		return false;
	}
	
	
	
	

}
