
public class Scorpio extends Classic
	{
	public Scorpio()
		{
		name = "Scorpio";
		element = "Water";
		planet = "Pluto";
		stone = "Topaz";
		sign = "Scorpion";
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
		System.out.println("Scorpio (October 24- November 22): The eight sign of the zodiac, Scorpios are ");
		System.out.println("very intense. They like to question everything and work hard at making sense of ");
		System.out.println("things. Scorpios treat others with kindness and loyalty.");
		}
	}
