package EX2;

public class EntNat {
	public static int  somme(int i,int y) throws ErrSom {
		if(i+y<0) throw new ErrSom("Additon Impossible (supérieure à MAX_VALUE des entiers)");
		return i+y;
	}
	public static int diff(int i,int y) throws ErrDiff {
		if(i-y<0) throw new ErrDiff("Soustraction Impossible (supérieure à MAX_VALUE des entiers)");
		return i-y;
	}
	public static int prod(int i,int y) throws ErrProd {
		if(i*y<0) throw new ErrProd("Produit Impossible (supérieure à MAX_VALUE des entiers)");
		return i*y;
	}
}
