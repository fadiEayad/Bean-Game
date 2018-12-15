//BeanGame
//Boach Co!!!
//Boach Coagni!!!!

public class BeanGame
{
	
	static int human=0;
	static int computer=0;
	
	public static void main(String args[])
	{
		System.out.println("Welcome to the Bean Game!");
		System.out.println("Each player must take 1-3 beans per turn. The player who gets the last bean wins.");
		System.out.println("Let the games BEGIN!!");
		System.out.println();
		
		char makeChoice=' ';
		char again=' ';
		
		do
		{
			System.out.println("Choose one>>>		1: Beatable Mode		2: Unbeatable Mode");
			while (makeChoice!='1' || makeChoice!='2')
			{
				makeChoice=Expo.enterChar();
				if (makeChoice=='1') {playBeatableMode(); break;}
				if (makeChoice=='2') {playUnbeatableMode(); break;}
				System.out.println("Please enter either 1 or 2");
			}
			System.out.println("Would you like to play again?	y=yes	n=no");
			again=Expo.enterChar();
			while (again!='y' && again!='n')
			{
				System.out.println("Please enter either y or n");
				again=Expo.enterChar();
			}
			System.out.println();
		}
		while (again=='y');	
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void playBeatableMode()
	{
		System.out.println();
		String beans="00000000000000000000";
	
		while(beans.length()!=0)
		{
			System.out.println(beans.length()+" Beans:  "+beans);
			System.out.println();
			
			if (beans.length()>=3) 
			{
				System.out.println("Choose a number between 1 and 3>>>");
				System.out.print("Your choice:  ");
				human=Expo.enterInt();
				while (human<1 || human>3)
				{
					System.out.println("Please choose a number between 1 and 3");
					System.out.print("Your choice:  ");
					human=Expo.enterInt();
				}
			}
     ///////////////////////////////////////////////////////////////////////////////////////////////////			 
			if (beans.length()==2)
			{		
				System.out.println("Choose a number between 1 and 2>>>");
				System.out.print("Your choice:  ");
				human=Expo.enterInt();
				while (human<1 || human>2)
				{
					System.out.println("Please choose a number between 1 and 2");
					System.out.print("Your choice:  ");
					human=Expo.enterInt();
				}
			}
     ///////////////////////////////////////////////////////////////////////////////////////////////////			 			 						 			
			if (beans.length()==1)
			{
				System.out.println("You can only choose 1>>>");
				System.out.print("Your choice:  ");
				human=Expo.enterInt();
				while (human!=1)
				{
					System.out.println("Please enter 1");
					System.out.print("Your choice:  ");
					human=Expo.enterInt();
				}	
			}
     ///////////////////////////////////////////////////////////////////////////////////////////////////			
			System.out.println();
			beans=beans.substring(0,beans.length()-human);
			System.out.println(beans.length()+" Beans:  "+beans);
			System.out.println();
			
			if (beans.length()==0)
			{
				System.out.println("You WIN!");
				break;
			}
			
			if (beans.length()>=3) computer=Expo.random(1,3);
			if (beans.length()==2) computer=Expo.random(1,2);
			if (beans.length()==1) computer=1;
			
			System.out.println("Computer's choice:  "+computer);
			System.out.println();
			beans=beans.substring(0,beans.length()-computer);
			if (beans.length()==0) 
			{
				System.out.println(beans.length()+" Beans:  "+beans);
				System.out.println();
				System.out.println("Computer WINS!");
			}
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public static void playUnbeatableMode()
	{
		System.out.println();
		String beans="00000000000000000000";
	
		while(beans.length()>=1)
		{
			System.out.println(beans.length()+" Beans:  "+beans);
			System.out.println();	
			System.out.println("Choose a number between 1 and 3>>>");
			System.out.print("Your choice:  ");
			human=Expo.enterInt();
			while (human<1 || human>3)
				{
					System.out.println("Please choose a number between 1 and 3");
					System.out.print("Your choice:  ");
					human=Expo.enterInt();
				}
	
			System.out.println();
			beans=beans.substring(0,beans.length()-human);
			System.out.println(beans.length()+" Beans:  "+beans);
			System.out.println();
			computer=4-human;
			System.out.println("Computer's choice:  "+computer);
			beans=beans.substring(0,beans.length()-computer);
			System.out.println();
		}
		
		System.out.println(beans.length()+" Beans:  "+beans);
		System.out.println();
		System.out.println("Comuter WINS!");
	}
	
}