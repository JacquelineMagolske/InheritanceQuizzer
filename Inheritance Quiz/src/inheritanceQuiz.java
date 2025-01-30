import java.util.Scanner;



public class inheritanceQuiz
	{
		public static int userScore = 0;
		
		public static void main(String[] args)
			{
				
				
				questionOne();
				
				return userScore();
				

			}
		
		public static void questionOne()
		{
			System.out.println("If the code runs: ");
			System.out.println("		CrazyPerson x = new CrazyPerson();");
			System.out.println("		x.runCrazyPersonMethod1()");
			System.out.println("What will the result be?");
			
			System.out.println("A. I LOVE LOVE LOVE LOVE LOVE AHHH");
			System.out.println("B. I know everything about them");
			System.out.println("C. Hold on tight spider monkey");
			System.out.println("D. Did you know Robert Pattinson is getting married to Suki Waterhouse instead of me????");
			
			Scanner userInput = new Scanner (System.in);
			
			String answer = userInput.nextLine();
			
			if(answer == "A") 
			{
				userScore++;
			}
			
			
		}
		
		
			

	}
