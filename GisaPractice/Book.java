package GisaPractice;

public interface Book {
	void make();
}

class Gisa1 implements Book{
	public void make() {
		System.out.print("필기");
	}
}
	
class Gisa2 implements Book{
	public void make() {
		System.out.print("실기");
	}
}



