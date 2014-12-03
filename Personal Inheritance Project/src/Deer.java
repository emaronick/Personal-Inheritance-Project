
public class Deer extends NativeAmerican
	{
	public Deer()
		{
		name = "Deer";
		mainQuality = "inspiring, lively, and quick-witted";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("With a tailor-made humor, the Deer has a tendency to get a laugh out of anyone.");
		System.out.println("With an excellent ability for vocalizing, the Deer is a consummate conversationalist.");
		System.out.println("This combined with their natural intelligence make the Deer a must-have guest at dinner parties.");
		}
	}
