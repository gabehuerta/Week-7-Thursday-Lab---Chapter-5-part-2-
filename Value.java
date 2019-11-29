import java.util.Scanner;

public class Value
{
	private int MinAcceptedValue;
	private int MaxAcceptedValue;
	private String output;
	public Value(int min, int max)
	
	{
		MinAcceptedValue = min;
		MaxAcceptedValue = max;
		min = 10;
		max = 100;
		
	}

	public int getValue()

	{

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter an integer value: ");

	int n = keyboard.nextInt();

	while(n < MinAcceptedValue && n > MaxAcceptedValue)

	{
		System.out.println("WRONG: This number is not in the range");
		System.out.println("Enter an integer value:  ");
		n = keyboard.nextInt();

	}
	
	keyboard.close();
		return n;
	}
	
	public static void main(String[] args)
	
	{
	
	Value v = new Value(10,000);
		System.out.println("The number entered by the user is: " + v.getValue());
	}
}
