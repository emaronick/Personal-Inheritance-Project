
public class Virgo extends Classic
	{
	public Virgo()
		{
		name = "Virgo";
		element = "Earth";
		planet = "Mercury";
		stone = "Sapphire";
		sign = "Virgin";
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
		System.out.println("Virgo (August 22- September 23): The sixth sign of the zodiac, Virgo is very");
		System.out.println("mind oriented. They are constantly analyzing and thinking. They enjoy bettering");
		System.out.println("themselves and those around them.");
		}
	}
