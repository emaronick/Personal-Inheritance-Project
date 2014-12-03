
public class Sagittarius extends Classic
	{
	public Sagittarius()
		{
		name = "Sagittarius";
		element = "Fire";
		planet = "Jupiter";
		stone = "Turquoise";
		sign = "Archer";
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
		System.out.println("Sagittarius (November 23- December 22): The ninth sign of the zodiac, a ");
		System.out.println("Sagittarius has a very positive outlook on life. They have vibrant personalities and ");
		System.out.println("enjoy meeting new people. They can also be reckless. ");
		}
	}
