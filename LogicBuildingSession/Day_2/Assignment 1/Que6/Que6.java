import java.util.Scanner;

class AreaOfRect{
	public static void main(String args[]){
	
	int l, w, area;
	Scanner inpt = new Scanner(System.in);

	System.out.println("Enter length : ");
	l = inpt.nextInt();

	System.out.println("Enter width : ");
	w = inpt.nextInt();

	area = l * w;


	System.out.println("Area of the rectangle with length "+ l +" and width "+ w + " is " + area);
	
	
	
	
	}




}