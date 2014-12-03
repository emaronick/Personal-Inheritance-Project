
public class Owl extends NativeAmerican
	{
	public Owl()
		{
		name = "Owl";
		mainQuality = "Warm, natural, with an easy-going nature";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("Changeable and mutable as the wind, the Owl is a tough one to pin down.");
		System.out.println("The bearer of this Native American animal symbol is notorious for engaging in");
		System.out.println("life at full speed, for and whole-heartedly loving adventure. The Owl is a friend to the world.");
		}
	}
