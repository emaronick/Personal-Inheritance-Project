
public class Capricorn extends Classic
	{
	
	public Capricorn()
		{
		name = "Capricorn";
		element = "Earth";
		planet = "Saturn";
		stone = "Garnet";
		sign = "Goat";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The element of a " + name + " is " + element + ".");
		System.out.println("The ruling planet of a " + name + " is " + planet + ".");
		System.out.println("The stone (gemstone) of a " + name + " is " + stone + ".");
		System.out.println("The sign of a " + name + " is the " + sign + ".");
		System.out.println();
		System.out.println("Capricorn (December 23- January 20): The 10th sign of the zodiac, those");
		System.out.println("who are Capricorns are marked by their ambitious nature. They have very active");
		System.out.println("minds and always have to be in control of their lives.");
		}
	}
