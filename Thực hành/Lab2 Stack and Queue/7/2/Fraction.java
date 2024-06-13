public class Fraction {
	private int numer = 0;
	private int denom = 1;

	Fraction() {

	}

	Fraction(int x, int y) {
		numer = x;
		denom = y;

	}

	Fraction(Fraction f) {
		numer = f.getNumer();
		denom = f.getDenom();
	}

	@Override
	public String toString() {
		return numer + "/" + denom;
	}

	public boolean equals(Object f) {
		if (f instanceof Fraction) {
			Fraction temp = (Fraction) f;
			if (temp.getNumer() / temp.getDenom() == numer / denom) {
				return true;
			}
		}
		return false;
	}

	// getter setter
	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

}
