// 한영단어검색 프로그램

package August;
import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"이름", "과목", "등급", "점수", "장학금"};
	private static String[] eng = {"name", "subject", "grade", "score", "scholarship"};

	public static String korToEng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
//				if(i%2 == 0) {
//					System.out.print(word +"은(는) " );
//				}
//				else {
//					System.out.print(word +"는 ");	
//				}
				System.out.print(word +"은(는) " );
				
				return eng[i];
			}
			
		}
		return "false";		
	}

}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한영 단어 검색 프로그램입니다."); 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾을 한글 단어를 입력하세요 >> "); 
			String search = sc.next();
			
			if(search.equals("종료")) {
				System.out.print("프로그램을 종료합니다."); 
				break; 
			}
			
			
			String eng = Dictionary.korToEng(search);
			if(eng.equals("false")) System.out.println("해당 한글은 영단어로 찾을 수 없습니다. 다시 입력하세요.");
			else
				System.out.println(eng);
		}
		
		sc.close();

	}

}
