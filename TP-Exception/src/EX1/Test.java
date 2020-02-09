package EX1;

public class Test {
	public static void main(String[] args) {
		try {
			EntNat var1 = new EntNat(8);
			System.out.println("La valeur qui est dans var1 est : " + var1.getN());
			EntNat var2 = new EntNat(-1);
			System.out.println("La valeur qui est dans var2 est : " + var2.getN());

		} catch (ErrConst e) {
			System.out.println(e.getMessage());
		}
	}
}
