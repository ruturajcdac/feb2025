import java.util.Scanner;

class AreaOfSq{
	public static void main(String args[]){
	
	int side, area;
	Scanner inpt = new Scanner(System.in);

	System.out.println("Enter the length of the side: ");
	side = inpt.nextInt();

	area = side * side;


	System.out.println("Area of the square with side "+ side +" is "+ area);
	
	
	
	
	}




}