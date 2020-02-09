package EX1;

public class EntNat {
	private int nbr;
	public EntNat(int nbr) throws ErrConst{
		if(nbr < 0)  throw new ErrConst("le nombre entré n'est pas un nombre entier naturel");
		this.nbr=nbr;
	}
	public int getN() {
		return nbr;
	}
}




