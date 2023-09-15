package charpatterns;

public class Pattern3 {
//	a
//	bb
//	ccc
//	dddd
//	eeeee

	public static void main(String[] args) {

		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)('a'+i));
			}
			System.out.println();
		}
		

	}

}
