package domain;

import java.util.List;

public class Tekening {
	private String naam;
	private int MIN_X, MIN_Y,MAX_X,MAX_Y;
	private List vormen;
	
	public Tekening(String naam){
		if (naam == null || naam.trim().isEmpty()) throw new DomainException("naam mag niet leeg zijn.");
		this.naam = naam;
	}
	

}
