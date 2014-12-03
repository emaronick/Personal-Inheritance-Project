
public class Snake extends NativeAmerican
	{
	public Snake()
		{
		name = "Snake";
		mainQuality = "spiritual and a little secretive";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("Most shamans are born under this Native American animal symbol. The Snake");
		System.out.println("is a natural in all matters of spirit. Easily attuned to the ethereal realm,");
		System.out.println("the Snake makes an excellent spiritual leader, and often excells in medical professions.");
		}
	}
