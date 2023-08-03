// 자리 예약 시스템 
package August;
import java.util.Scanner;

class Reservation{
	private String s[];
	private String a[];
	private String b[];
	private Scanner sc; 
	
	Reservation(){
		sc = new Scanner(System.in);
		s = new String[10];
		a = new String[10];
		b = new String[10];
		
		for(int i=0; i<s.length; i++) {
			s[i] = "___";
			a[i] = "___";
			b[i] = "___";
		}
		
	}
	
	
	

public void chooseSeat() {
	while(true) {
		System.out.println("좌석 구분 S(1), A(2), B(3)");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.print("S >> " );
			printSeat(s);
			newSeat((s));
			return;
		case 2:
			System.out.print("A >> " );
			printSeat(a);
			newSeat((a));
			return;
		case 3:
			System.out.print("B >> " );
			printSeat(b);
			newSeat((b));
			return;
		default:
			System.out.print("다시 입력하세요");
		}
	}
}

public void newSeat(String seat[]) {
	System.out.print("이름 >> " );
	String name = sc.next(); 
	System.out.print("번호 >> ");
	int select = sc.nextInt();
	seat[select] = name;
			
}



public void printSeat() {

	System.out.print("S >>");
	for(int i=0; i<s.length; i++) {
		System.out.print(s[i] + " ");
	}
	
	System.out.println(); 
	
	System.out.print("A >>");
	for(int i=0; i<s.length; i++) {
		System.out.print(a[i] + " ");
	}
	
System.out.println(); 
	
	System.out.print("B >>");
	for(int i=0; i<s.length; i++) {
		System.out.print(b[i] + " ");
	}
	
	System.out.println(); 
	System.out.println(" << 조회를 완료했습니다. >>"); 

}

public void printSeat(String seat[]) {
	for(int i=0; i<s.length; i++) {
		System.out.print(seat[i] + " "); 
	}
	System.out.println();
	
}
public void deleteSeat() {
	
	
	
}

}
public class Main3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Reservation r = new Reservation();
		

		System.out.println("콘서트홀 예약 시스템입니다."); 
		
		while(true) {
			System.out.println("예약:1, 조회:2, 취소:3, 종료:4 >>");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				r.chooseSeat();
				break;
			case 2:
				r.printSeat();
				break;
			case 3:
				r.deleteSeat();
				break;
			case 4:
			
				System.out.println("프로그램을 종료.");
				return; 
				//sc.close();
			}
		}
	}

	
	
}
