
public class Raven extends NativeAmerican implements SuperGood
	{
	public Raven()
		{
		name = "Raven";
		mainQuality = "idealistic, diplomatic, and quite ingenious";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("Highly enthusiastic, and a natural entrepreneur, the Raven is quite a charmer, even");
		System.out.println("though they don't have to work at being charming - it comes easily.");
		System.out.println("Everyone recognizes the Crow's easy energy and turns to the Raven for their ideas and opinions.");
		System.out.println();
		printPraise();
		}
	
	public void printPraise()
		{
		System.out.println("This is a really good sign!");
		}

	}
