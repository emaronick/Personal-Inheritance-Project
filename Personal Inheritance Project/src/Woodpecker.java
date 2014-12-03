
public class Woodpecker extends NativeAmerican
	{
	public Woodpecker()
		{
		name = "Woodpecker";
		mainQuality = "totally empathic and understanding";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("The Woodpecker is the one to have on your side when you need support.");
		System.out.println("They make wonderful parents, and equally wonderful friends and partners.");
		System.out.println("Woodpeckers also have a tendency to be naturally frugal, resourceful, and organized.");
		}
	}
