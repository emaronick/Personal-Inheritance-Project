
public class Pisces extends Classic
	{
	public Pisces()
		{
		name = "Pisces";
		element = "Water";
		planet = "Neptune";
		stone = "Bloodstone";
		sign = "Fish";
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
		System.out.println("Pisces (February 20- March 20): Pisces is the 12th and last sign of the zodiac.");
		System.out.println("Those who are Pisces are extremely sensitive and reserved. They like to escape from");
		System.out.println("reality. A Pisces is a very good listener and friend.");
		}
	}
