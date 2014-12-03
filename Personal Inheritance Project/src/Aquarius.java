
public class Aquarius extends Classic
	{
	public Aquarius()
		{
		name = "Aquarius";
		element = "Air";
		planet = "Uranus";
		stone = "Amethyst";
		sign = "Water Bearer";
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
		System.out.println("Aquarius (January 21- February 19): Aquarius is the 11th sign of the zodiac. ");
		System.out.println("Aquarians don't always care what others think about them. They take each");
		System.out.println("opportunity they have and work towards formulating new ideas.");
		}
	}
