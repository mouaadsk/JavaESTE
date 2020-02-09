package EX2;

public class ErrConst extends Exception {
	private int nb;
	public ErrConst(int nb) {
		this.nb=nb;
	}
	public int getnb() {
		return nb;
	}
}
