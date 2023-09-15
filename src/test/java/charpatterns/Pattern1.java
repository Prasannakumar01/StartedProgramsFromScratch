package charpatterns;

public class Pattern1 {
//	abc
//	def
//	ghi
	

	public static void main(String[] args) {
		char ch='a';
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}

	}

}
