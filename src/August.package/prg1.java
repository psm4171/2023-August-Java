package August;

public class programmers1 {

	public static int solution(String[] babb) {
		// TODO Auto-generated method stub
		
		int answer = 0; 
		for(int i=0; i< babb.length; i++) {
			babb[i] = babb[i].replaceFirst("aya", "0");
			babb[i] = babb[i].replaceFirst("woo", "0");
			babb[i] = babb[i].replaceFirst("ye", "0");
			babb[i] = babb[i].replaceFirst("ma", "0");
			babb[i] = babb[i].replaceFirst("0", "");
			
			if(babb[i].equals("")) answer++;
		}
		
		return answer;

	}

}
