package August;
import java.util.Scanner; 

public class Circle {
	private double x;
	private double y;
	private double r;
	
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	public void show() {
		System.out.println("(" + x +"," + y + ")" + r); 
	}
	
	public double getRadius() {
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >> "); 
			double x = sc.nextDouble(); 
			double y = sc.nextDouble(); 
			double r = sc.nextDouble();
			
			c[i] = new Circle(x,y,r);
			
		}
		
		for(int i=0; i<c.length; i++) {
			c[i].show();
		}
		
		double max = 0;
		int index = 1;
		for(int i=0; i<c.length; i++) {
			if(max < c[i].getRadius()) {
				index = i;
				max = c[i].getRadius();			
				}
		}
		
		System.out.print("면적이 가장 큰 원은? "); 
		c[index].show();
		sc.close(); 

	}

}
