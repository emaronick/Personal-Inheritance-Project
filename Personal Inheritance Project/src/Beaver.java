
public class Beaver extends NativeAmerican
	{
	public Beaver()
		{
		name = "Beaver";
		mainQuality = "strategic and cunning";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("Take charge, adapt, overcome - this is the Beaver motto. Mostly business, the Beaver");
		System.out.println("gets the job at hand done with maximum efficiency and aplomb. One might also think twice");
		System.out.println("about engaging the Beaver in a match of wits - as their mental acuity is razor sharp.");
		}
	}
