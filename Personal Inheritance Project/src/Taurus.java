
public class Taurus extends Classic
	{
	public Taurus()
		{
		name = "Taurus";
		element = "Earth";
		planet = "Venus";
		stone = "Emerald";
		sign = "Bull";
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
		System.out.println("Taurus (April 21- May 21): The second sign of the zodiac, those who are a ");
		System.out.println("Taurus are solid and fight for what they want. A Taurus is very easy going but can");
		System.out.println("also be stubborn. A Taurus can be procrastinators but also have a good-work ethic. ");
		}
	}
