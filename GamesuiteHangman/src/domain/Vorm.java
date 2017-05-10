package domain;

public abstract class Vorm {
	
	public abstract Omhullende getOmhullende();
	
	@Override
	public abstract boolean equals(Object object);
	@Override
	public abstract String toString();
}
