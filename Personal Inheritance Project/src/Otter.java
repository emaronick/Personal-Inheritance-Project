
public class Otter extends NativeAmerican
	{
	public Otter()
		{
		name = "Otter";
		mainQuality = "a little quirky and unorthodox";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("Perceived as unconventional, the Otter methods aren't the first ones");
		System.out.println("chosen to get the job done. This is a big mistake on the part of others - because");
		System.out.println("although unconventional, the Otter's methods are usually quite effective.");
		}
	}
