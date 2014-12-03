
public class Salmon extends NativeAmerican
	{
	public Salmon()
		{
		name = "Salmon";
		mainQuality = "electric, focused, intuitive, and wholly creative";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("A natural motivator, the Salmon's confidence and enthusiasm is easily infectious.");
		System.out.println("Soon, everybody is onboard with the Salmon - even if the idea seems too hair-brained to work.");
		System.out.println("It's no wonder why the Salmon has no shortage of friends.");
		}
	}
