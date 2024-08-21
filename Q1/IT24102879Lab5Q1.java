import java.util.Scanner;
public class IT24102879Lab5Q1 {
    public static void main(String[]args) {
	        Scanner reader = new Scanner(System.in);
			System.out.print("Enter the first integer: ");
			int num1 = reader.nextInt();
			System.out.print("Enter the second integer: ");
			int num2 = reader.nextInt();
			System.out.print("Enter the third integer: ");
			int num3 = reader.nextInt();
			int smallest = num1;
			if(num2 < smallest) {
			   smallest = num2;
			}
			if(num3 < smallest) {
			   smallest = num3;
			}
			int largest = num1;
			if(num2 > largest) {
			   largest = num2;
			}
			if(num3 > largest) {
			   largest = num3;
			}
			System.out.println("User entered numbers are: " + num1 + " " + num2 +" " + num3);
			System.out.println("The smallest number is: " + smallest);
			System.out.println("The largest number is: " + largest);
	}
}
		