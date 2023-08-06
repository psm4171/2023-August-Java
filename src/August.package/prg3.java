package August;

public class prg3 {

	public int[] prg3(int num, int total) {
		// TODO Auto-generated method stub

		int[] anw = new int[num]; 
		int start = (total/num) - ((num-1) / 2); 
		
		for(int i=0; i<num; i++) {
			anw[i] = start; 
			start++;
		}
		
		return anw;
	}

}
