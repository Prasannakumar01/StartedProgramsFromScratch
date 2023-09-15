package charpatterns;

public class Pattern4 {
//	a
//	bc
//	def
//	ghij
//	klmno

	public static void main(String[] args) {
		int n=5;
		char ch='a';
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

}
