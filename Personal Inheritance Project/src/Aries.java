
public class Aries extends Classic
	{
	public Aries()
		{
		name = "Aries";
		element = "Fire";
		planet = "Mars";
		stone = "Diamond";
		sign = "Ram";
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
		System.out.println("Aries (March 21- April 20): Aries is the first sign of the zodiac. Those who are ");
		System.out.println("Aries are independent and courageous. They enjoy leading others and bringing");
		System.out.println("excitement into the lives of others. An Aries is enthusiastic and very goal-oriented.");
		}
	}
