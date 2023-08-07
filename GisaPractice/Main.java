package GisaPractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0, j=0,k; 
		for(; i<3; i++) {
			for(j=0; j<=i; j+=2) {
				for(k='A'; k<='A'+i+j; k++) {
					
					int num = i+j+k;
					char s = (char)num;
					System.out.print(s);
				}
			}
			System.out.println();
		}
	}

}
