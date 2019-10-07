import java.util.*;


public class GuessCounter {
	public static void main(String[] args) {
		
			//declare variables
		int number = (int)(Math.random() * 10000 + 1);
		int numberOfGuesses = 1;
		int min = 0;
		int max = 10000;
		int guess;
		
		//create Scanner for input
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome! Please enter a number between 0-10000.");
		guess = input.nextInt();

		//math
		while (number != guess)
		{
			numberOfGuesses += 1;
			if(guess > number)
			{
				max = guess - 1;
				System.out.println("Too High! Guess a number between " + min + " and " + max + ".");
				guess = input.nextInt();
			}
			else
			{
				min = guess + 1;
				System.out.println("Too low! Guess a number between " + min + " and " + max + ".");
				guess = input.nextInt();
			}
		}
		if (numberOfGuesses != 1)
		{
			System.out.println("You won after " + numberOfGuesses + " guesses!");
			
		}
		else
		{
			System.out.println("You won on the first try!");
		}
}

}
