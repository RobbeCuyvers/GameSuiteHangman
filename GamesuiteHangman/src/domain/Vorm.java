package domain;

import java.awt.Canvas;

public abstract class Vorm extends Canvas {

	public abstract Omhullende getOmhullende();

	@Override
	public abstract boolean equals(Object object);

	@Override
	public abstract String toString();
}
