
public class Wolf extends NativeAmerican
	{
	public Wolf()
		{
		name = "Wolf";
		mainQuality = "need their freedom, yet are still quite gentle and compassionate";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they " + mainQuality + ".");
		System.out.println();
		System.out.println("Deeply emotional, and wholly passionate, the Wolf is the lover of ");
		System.out.println("the zodiac in both the physical and philosophical sense of the word.");
		System.out.println("The Wolf understands that all we need is love, and is fully capable of providing it.");
		}
	}
