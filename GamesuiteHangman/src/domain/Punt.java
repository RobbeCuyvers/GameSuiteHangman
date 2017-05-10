package domain;

public class Punt {
	private int x;
	private int y;
	
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	private void setX(int x) {
//		if (x < 0) {
//			throw new DomainException("Het punt X moet een positief geheel getal zijn");
//		}
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	
	private void setY(int y) {
//		if (y < 0) {
//			throw new DomainException("Het punt Y moet een positief geheel getal zijn");
//		}
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Punt) {
			Punt punt = (Punt) o;
			if (this.getX() == punt.getX() && this.getY() == punt.getY()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
}