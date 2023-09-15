package charpatterns;

public class Pattern2 {
//	a
//	ab
//	abc
//	abcd
//	abcde


	public static void main(String[] args) {

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('a' + j));
			}
			System.out.println();
		}

	}

}
