package EX2;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("La Somme Est :" + EntNat.somme(15, 33));
			System.out.println(EntNat.somme(Integer.MAX_VALUE , 55));

		} catch (ErrSom error) {
			System.out.println(error.getMessage());
			try {
				System.out.println("Difference :" + EntNat.diff(87, 18));
				System.out.println(EntNat.diff(Integer.MAX_VALUE +6, 12));

			} catch (ErrDiff error1) {
				System.out.println(error1.getMessage());
				try {
					System.out.println("produit :" + EntNat.prod(60, 7));
					System.out.println(EntNat.prod(Integer.MAX_VALUE +5, 8));
				} catch (ErrProd error2) {
					System.out.println(error2.getMessage());
				}
			}
		}
	}
}