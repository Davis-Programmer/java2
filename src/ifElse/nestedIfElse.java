package ifElse;

public class nestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nested IF Else
		//multiple conditions use nested if else
		
		int day = 6;
		
		if (day == 1)
		
		{
			
			System.out.println("Sunday");
			
		}
		
		else if(day == 2)
		
		{
			
			System.out.println("Monday");
			
		}
		
		else if(day == 3)
		
		{
			System.out.println("Tuesday");
			
		}
		
		else if (day == 4)
			
		{
			
			System.out.println("Wednesday");
		}
		
		else if (day == 5)
			
		{
			System.out.println("Thursday");
		}
		
		else if (day == 6)
			
		{
			System.out.println("Friday");
		}
		
		else if (day == 7)
	
		{
			System.out.println("Saturday");
		}
		
		else
	
		{
			System.out.println("Invalid week number");
		}
	}

}