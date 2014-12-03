
public class Bear extends NativeAmerican
	{
	public Bear()
		{
		name = "Bear";
		mainQuality = "pragmatic and methodical";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("The Bear's practicality and level-headedness makes them an excellent business partner.");
		System.out.println("The Bear is also gifted with an enormous heart, and a penchant for generosity.");
		System.out.println("However, one might not know it as the Bear tends to be very modest, and a bit shy.");
		}
	}
