import java.util.Scanner;


public class NativeAmerican extends Zodiac
	{
	protected String name, mainQuality, superVar;
	
	@Override
	public void printSummary()
		{
		System.out.println("You chose Native American. Many Native American cultures have the belief that a person is assigned an animal upon the time of birth.");
		}
	
	@Override
	public void predictPersonality()
		{
		System.out.println();
		printSummary();
		System.out.println("What month were you born in? (Corresponding number please)");
		System.out.println();
		System.out.println("1)	January");
		System.out.println("2)	February");
		System.out.println("3)	March");
		System.out.println("4)	April");
		System.out.println("5)	May");
		System.out.println("6)	June");
		System.out.println("7)	July");
		System.out.println("8)	August");
		System.out.println("9)	September");
		System.out.println("10)	October");
		System.out.println("11)	November");
		System.out.println("12)	December");
		Scanner keyboard = new Scanner(System.in);
		month = keyboard.nextInt();
		switch(month)
			{
			case 1:
				{
				monthName = "January";
				break;
				}
			case 2:
				{
				monthName = "February";
				break;
				}
			case 3:
				{
				monthName = "March";
				break;
				}
			case 4:
				{
				monthName = "April";
				break;
				}
			case 5:
				{
				monthName = "May";
				break;
				}
			case 6:
				{
				monthName = "June";
				break;
				}
			case 7:
				{
				monthName = "July";
				break;
				}
			case 8:
				{
				monthName = "August";
				break;
				}
			case 9:
				{
				monthName = "September";
				break;
				}
			case 10:
				{
				monthName = "October";
				break;
				}
			case 11:
				{
				monthName = "November";
				break;
				}
			case 12:
				{
				monthName = "December";
				break;
				}
			default:
				{
				System.out.println("Sorry, there was an error. It's probably your fault.");
				break;
				}
			}
		System.out.println();
		System.out.println("What day of " + monthName + " were you born on? (please enter a whole number)");
		day = keyboard.nextInt();
		if(month == 1)
			{
			if((day >= 1) && (day <= 19))
				{
				NativeAmerican bb = new Goose();
				bb.printSummary();
				}
			if((day >= 20) && (day <= 31))
				{
				NativeAmerican bb = new Otter();
				bb.printSummary();
				}
			}
		if(month == 2)
			{
			if((day >= 1) && (day <= 18))
				{
				NativeAmerican bb = new Otter();
				bb.printSummary();
				}
			if((day >= 19) && (day <= 28))
				{
				NativeAmerican bb = new Wolf();
				bb.printSummary();
				}
			}
		if(month == 3)
			{
			if((day >= 1) && (day <= 20))
				{
				NativeAmerican bb = new Wolf();
				bb.printSummary();
				}
			if((day >= 21) && (day <= 31))
				{
				NativeAmerican bb = new Falcon();
				bb.printSummary();
				}
			}
		if(month == 4)
			{
			if((day >= 1) && (day <= 19))
				{
				NativeAmerican bb = new Falcon();
				bb.printSummary();
				}
			if((day >= 20) && (day <= 30))
				{
				NativeAmerican bb = new Beaver();
				bb.printSummary();
				}
			}
		if(month == 5)
			{
			if((day >= 1) && (day <= 20))
				{
				NativeAmerican bb = new Beaver();
				bb.printSummary();
				}
			if((day >= 21) && (day <= 31))
				{
				NativeAmerican bb = new Deer();
				bb.printSummary();
				}
			}
		if(month == 6)
			{
			if((day >= 1) && (day <= 20))
				{
				NativeAmerican bb = new Deer();
				bb.printSummary();
				}
			if((day >= 21) && (day <= 30))
				{
				NativeAmerican bb = new Woodpecker();
				bb.printSummary();
				}
			}
		if(month == 7)
			{
			if((day >= 1) && (day <= 22))
				{
				NativeAmerican bb = new Woodpecker();
				bb.printSummary();
				}
			if((day >= 23) && (day <= 31))
				{
				NativeAmerican bb = new Salmon();
				bb.printSummary();
				}
			}
		if(month == 8)
			{
			if((day >= 1) && (day <= 22))
				{
				NativeAmerican bb = new Salmon();
				bb.printSummary();
				}
			if((day >= 23) && (day <= 31))
				{
				NativeAmerican bb = new Bear();
				bb.printSummary();
				}
			}
		if(month == 9)
			{
			if((day >= 1) && (day <= 22))
				{
				NativeAmerican bb = new Bear();
				bb.printSummary();
				}
			if((day >= 23) && (day <= 30))
				{
				NativeAmerican bb = new Raven();
				bb.printSummary();
				}
			}
		if(month == 10)
			{
			if((day >= 1) && (day <= 22))
				{
				NativeAmerican bb = new Raven();
				bb.printSummary();
				}
			if((day >= 23) && (day <= 31))
				{
				NativeAmerican bb = new Snake();
				bb.printSummary();
				}
			}
		if(month == 11)
			{
			if((day >= 1) && (day <= 21))
				{
				NativeAmerican bb = new Snake();
				bb.printSummary();
				}
			if((day >= 22) && (day <= 30))
				{
				NativeAmerican bb = new Owl();
				bb.printSummary();
				}
			}
		if(month == 12)
			{
			if((day >= 1) && (day <= 21))
				{
				NativeAmerican bb = new Owl();
				bb.printSummary();
				}
			if((day >= 22) && (day <= 31))
				{
				NativeAmerican bb = new Goose();
				bb.printSummary();
				}
			}
		}

	}