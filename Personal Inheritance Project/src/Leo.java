
public class Leo extends Classic
	{
	public Leo()
		{
		name = "Leo";
		element = "Fire";
		planet = "the Sun";
		stone = "Peridot";
		sign = "Lion";
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
		System.out.println("Leo (July 23- August 21): Leo is the fifth sign in the zodiac. Leos have high self");
		System.out.println("esteem and are very devoted. They are also very kind and generous. A Leo is known");
		System.out.println("for being hot tempered yet forgiving.");
		}
	}
