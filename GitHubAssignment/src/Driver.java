import java.util.Scanner;

public class Driver {

	public static void main(String[] args)
	{
		String userAnswer = "Y";
		Scanner scan = new Scanner(System.in);
		String manufacturer;
		String model;
		String price;
		String carrier;
		String text;
		String number;
		
		while (userAnswer.equals("Y") || userAnswer.equals("y"))
		{
			System.out.print("Enter the phone's manufacturer: ");
			manufacturer = scan.nextLine();
			
			System.out.print("Enter the phone's model: ");
			model = scan.nextLine();
			
			System.out.print("Enter the phone's price: ");
			price = scan.nextLine();
			
			System.out.print("Enter the phone's carrier: ");
			carrier = scan.nextLine();
			
			MobilePhone phone = new MobilePhone(manufacturer, model, price, carrier);
			
			System.out.println("What number would you like to call?");
			number = scan.nextLine();
			System.out.println(phone.call(number));
			
			System.out.println("What do you want your text to say?");
			text = scan.nextLine();
			System.out.println(phone.message(text));
			
			System.out.println(phone.toString());
			

			
			System.out.print("Would you like to enter in another phone? (Y/N): ");
			userAnswer = scan.nextLine();
			
			
		}
		

	}

}
