
public class Cancer extends Classic
	{
	public Cancer()
		{
		name = "Cancer";
		element = "Water";
		planet = "the Moon";
		stone = "Moonstone";
		sign = "Crab";
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
		System.out.println("Cancer (June 22- July 22): Cancer is the fourth sign of the zodiac. This sign is");
		System.out.println("marked by inconsistency. They enjoy security but also seek adventure. A Cancer is");
		System.out.println("not very predictable and always keep others guessing.");
		}
	}
