package charpatterns;

public class Pattern5 {
//	
//	a
//	bc
//	cde
//	defg
//	efghi

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)('a'+i+j));
			}
			System.out.println();
		}
		
	
	}

}
