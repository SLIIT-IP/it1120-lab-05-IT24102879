import java.util.Scanner;
public class IT24102879Lab5Q3 {
    public static void main(String[]args) {
	        final double ROOM_CHARGE_PER_DAY = 48000.00;
			final int DISCOUNT_NONE = 0;
			final int DISCOUNT_3_TO_4_DAYS = 10;
			final int DISCOUNT_5_OR_MORE_DAYS = 20;
			Scanner reader = new Scanner (System.in);
			System.out.print("Enter start date (1-31): ");
			int startDate = reader.nextInt();
			System.out.print("Enter end date (1-31): ");
			int endDate = reader.nextInt();
			if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31)
			{
			   System.out.println("Error:Days must be between 1 and 31");
			   return;
			}
			if(startDate >= endDate)
			{
			   System.out.println("Error:Start date should be less than end date");
			   return;
			}
			int numberOfDaysReserved = endDate - startDate;
			int discountRate;
			if(numberOfDaysReserved < 3) {
			   discountRate = DISCOUNT_NONE;
			} else if
			  (numberOfDaysReserved <= 4) {
			  discountRate = DISCOUNT_3_TO_4_DAYS;
			} else {
			  discountRate = DISCOUNT_5_OR_MORE_DAYS;
			}
			double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
			double discountAmount = totalAmount * discountRate / 100;
			double amountToBePaid = totalAmount - discountAmount;
			System.out.println("Room Charge Per Day: RS. " + ROOM_CHARGE_PER_DAY);
			System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
			System.out.println("Total Amount to be Paid: " + amountToBePaid);
	}
}
			