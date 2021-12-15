import java.util.Scanner;
//This is the first java program
public class MyFirstProgram  {

	//main method here
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		System.out.println("The Area Will Be Shown Here:");

		System.out.println("Enter Length");
		 double length =get.nextDouble();


		 System.out.println("Enter Width");
		 double width =get.nextDouble();
		 

		Area area1 = new Area();
		area1.setLength(length);
		area1.setWidth(width);

		System.out.println("The Area Will Be Shown Here:" + area1.getArea());
 
	}
	
}