
public class Libra extends Classic implements SuperGood
	{
	public Libra()
		{
		name = "Libra";
		element = "Air";
		planet = "Venus";
		stone = "Opal";
		sign = "Scales";
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
		System.out.println("Libra (September 24- October 23): The seventh sign of the zodiac, Libras are ");
		System.out.println("known for their diplomatic nature. They get along well with everyone and are");
		System.out.println("ambitious. They have very expensive taste and work hard to make money.");
		System.out.println();
		printPraise();
		}
	
	public void printPraise()
		{
		System.out.println("This is a really good sign!");
		}
	}
