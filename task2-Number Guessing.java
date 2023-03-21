import java.util.*;
class Guessing
{
	public void Number()
	{
		Random ra=new Random();
		Scanner sc=new Scanner(System.in);
		int systemval=ra.nextInt(10);
		System.out.println("System has generated a Number .....!!It's time to playyy...");
		System.out.println("Chances that you take to guess the number");
		
		int chances=sc.nextInt();
		System.out.println();
		while(chances>10)
		{
		    
			System.out.println("okay!!Enter a number less than 10");
			
			chances=sc.nextInt();
		}
	
		System.out.println("so you have "+chances+"chances to guess");

		int totalscore=100;
		int i=0;
		for(i=0;i<chances;i++)
		{
		   
			System.out.println("Enter your's number - Chance no "+(i+1));
			int userVal=sc.nextInt();
			if(userVal== systemval)
			{
			   
				System.out.println("It's correct!!you've won the game");
			
				System.out.println("Your score is \'"+totalscore+"\'");
		
				break;
			}
			else if(userVal>systemval)
			{
			   
				System.out.println("oh no!!Your number is greater than system number");
				
			}
			else
			{
			   
				System.out.println("oopss!!Your number is less than System  number");
				
			}
			totalscore-=10;
		} 
		if(i>=chances)
		{
		  
			System.out.println("And Finally system number is "+ systemval);
            System.out.println("you have lost the game..Better Luck Next Time ");
	        System.out.println("Your score is \'0\' ");
		
		}
	}
}
class Task
{
public static void main(String args[])
{
 System.out.println("Let's start guessing!!!");
	
	Scanner sc=new Scanner(System.in);
	Guessing guess=new Guessing();
	System.out.println("Are You Ready to guess: Yes/No");
	
	String s=sc.nextLine();
	while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
	{
		guess.Number();
		
		System.out.println("Still you want to continue the Game Yes/No");
		s=sc.nextLine();
	
	}
}
}
