package GisaPractice;

class EducationFactory{
	public Book getShape(String bookType) {
		if(bookType == null) {
			return null;
		}
		if(bookType =="필기") {
			return new Gisa1();
		}
		
		else if (bookType =="실기") {
			return new Gisa2();
		}
		
		return null;
	}
}

public class Education {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EducationFactory ef = new EducationFactory();
		System.out.print("정보처리기사");
		Book b1 = ef.getShape("필기"); 
		b1.make();
		Book b2 = ef.getShape("실기"); 
		b2.make();
	}

}
