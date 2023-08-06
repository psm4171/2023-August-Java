package August;

public class prg2 {

	public int prg2(int[] com) {
		// TODO Auto-generated method stub
		
		int anw = 0;
		
		if((com[1] - com[0]) == (com[2] - com[1])) {
			anw = com[com.length-1] + (com[1] - com[0]); 
		}
		else 
			anw = com[com.length-1] * (com[1] / com[0]); 
		
		return anw;
			
	}

}
