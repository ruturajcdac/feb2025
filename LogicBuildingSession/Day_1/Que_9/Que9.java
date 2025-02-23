import java.util.Scanner;

class AofC {
	public static void main(String args[]){
	
	Scanner inp1 = new Scanner(System.in);
	

	System.out.println("Enter the number: ");
	
	int radius = inp1.nextInt();

	double area = 3.14 * radius * radius;

	System.out.println("Area of the Circle: "+ area);

	
	}


}