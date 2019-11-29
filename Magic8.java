import java.util.Random;
import java.util.Scanner;

public class Magic8
{
	static Random r = new Random();
    	public String getAnswer()
	{
		int numChoice = r.nextInt(8) + 1;
    
		switch (numChoice)
		{

		case 1:
			return("It is certain");
		case 2:
			return("It is decidedly so");
		case 3:
			return("Most likely");
		case 4:
			return("Signs point to yes");
		case 5:
			return("Reply hazy, try again");
		case 6:
			return("Ask again later");
		case 7:						
			return("Don't count on it");
		case 8:
			return("My sources say no");
		default:
			return("Good-bye!");
		}
	}
	public static void main(String args[])
	{
		
		Magic8 magic = new Magic8();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Think of a question and the magic 8 ball will respond...");	
		String ball = keyboard.nextLine();

		System.out.println(magic.getAnswer());

		System.out.println(magic.getAnswer());

		System.out.println(magic.getAnswer());

		System.out.println(magic.getAnswer());

			
    	}
}

	
 