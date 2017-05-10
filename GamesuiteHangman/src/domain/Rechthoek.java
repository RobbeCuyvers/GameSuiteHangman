package domain;

import java.awt.Graphics;

public class Rechthoek extends Vorm implements Drawable{
	
	private int breedte, hoogte;
	private Punt linkerbovenhoek;

	public Rechthoek(Punt linkerbovenhoek, int breedte, int hoogte) {
		this.setLinkerbovenhoek(linkerbovenhoek);
		this.setBreedte(breedte);
		this.setHoogte(hoogte);
	}
	
	public void Teken(Graphics g){
		
	}

	public int getBreedte() {
		return breedte;
	}

	private void setBreedte(int breedte) {
		if (breedte <= 0) throw new DomainException("hoogte mag niet 0 zijn");
		this.breedte = breedte;
	}

	public int getHoogte() {
		return hoogte;
	}

	private void setHoogte(int hoogte) {
		if (hoogte <= 0) throw new DomainException("hoogte mag niet 0 zijn");
		this.hoogte = hoogte;
	}

	public Punt getLinkerBovenhoek() {
		return linkerbovenhoek;
	}

	private void setLinkerbovenhoek(Punt linkerbovenhoek) {
		if (linkerbovenhoek == null) throw new DomainException("mag niet null zijn");
		this.linkerbovenhoek = linkerbovenhoek;
	}
	
	public Omhullende getOmhullende(){
		return new Omhullende(this.linkerbovenhoek, this.breedte, this.hoogte);
	}

	@Override
	public String toString() {
		return "Rechthoek: positie: (" + linkerbovenhoek.getX() + ", " + linkerbovenhoek.getY() + ") -breedte:" + breedte;
	}
	
	@Override
	public boolean equals(Object object){
		if (object instanceof Rechthoek){
			Rechthoek s = (Rechthoek) object;
			if (s.getLinkerBovenhoek().equals(this.getLinkerBovenhoek()) && s.getBreedte() == this.getBreedte() && s.getHoogte() == this.getHoogte())
				return true;
		}
		return false;
	}
	
	
	
	
}
