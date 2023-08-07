package August;
import java.util.Scanner; 

public class Grade {
	
	private int math;
	private int scn;
	private int eng;
	
	public Grade(int math, int scn, int eng) {
		this.math=math;
		this.scn=scn;
		this.eng=eng;
	}
	
	public int avg() {
		return (math+scn+eng)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int scn = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade st = new Grade(math,scn,eng);
		
		System.out.println("평균은 " + st.avg());

	}

}
