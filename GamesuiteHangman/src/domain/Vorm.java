package domain;

import java.awt.Canvas;
import java.awt.Graphics;

public abstract class Vorm extends Canvas{
	private boolean zichtbaar;
	
	
	public Vorm(){
		zichtbaar = true;
	}
	
	public abstract Omhullende getOmhullende();

	@Override
	public abstract boolean equals(Object object);

	@Override
	public abstract String toString();
	
	
	public void teken(Graphics graphics){
		
	}
	
	public boolean isZichtbaar(){
		return zichtbaar;
	}
	
	public void setZichtbaar(boolean zichtbaar){
		this.zichtbaar = zichtbaar;
	}
}
