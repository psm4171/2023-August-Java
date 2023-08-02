// 일정관리프로그램 

package August;
import java.util.Scanner;

class Day{
	private String work; 
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work == null) {
			System.out.println("일이 없습니다.");
		}
		else {
			System.out.println(work + "입니다.");
		}
	}
	
}

class MonthSchedule{
	private Scanner sc;
	private Day days[];
	
	MonthSchedule(int a){
		this.days = new Day[a];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
		
		sc = new Scanner(System.in);
	}
	
	private void input() {
		System.out.print("날짜(1~30)를 입력하세요 >>");
		int arrCnt = sc.nextInt(); // 날짜 입력을 받는 arrCnt
		
		System.out.print("할일(빈칸없이입력) >> ");
		// String work = sc.nextLine(); 
		String work = sc.next();
		days[arrCnt].set(work);
	}
	
	public void view() {
		System.out.print("확인할 스케줄 날짜(1~30)를 입력 >> ");
		int arrCnt = sc.nextInt(); 
		//days[arrCnt]
		System.out.print(arrCnt + "일의 할일은 ");
		days[arrCnt].show();
		
	}
	
	public void finish() {
		System.out.print("프로그램을 종료합니다. ");
		sc.close();
	}
	
	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램입니다."); 
		
		Scanner sc = new Scanner(System.in);
		
		// int num = sc.nextInt();
		// System.out.println("할일(입력:1, 보기:2, 끝내기:3) >> ");
		while(true) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				input();
			}
			else if (num == 2) {
				view();
			}
			else if (num == 3) {
			finish();
			return;
			}
		}
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonthSchedule m = new MonthSchedule(30);
		m.run();
	}
	

}
