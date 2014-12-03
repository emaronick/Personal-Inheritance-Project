
public class Gemini extends Classic
	{
	public Gemini()
		{
		name = "Gemini";
		element = "Air";
		planet = "Mercury";
		stone = "Aquamarine";
		sign = "Twins";
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
		System.out.println("Gemini (May 22- June 21): Gemini is the third sign of the zodiac. Geminis have");
		System.out.println("many sides and are known for their energy. They are very talkative and are");
		System.out.println("considered social butterflies. A Gemini will always take their lives in the direction");
		System.out.println("they want to go.");
		}
	}
