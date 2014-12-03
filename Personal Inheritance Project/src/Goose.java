
public class Goose extends NativeAmerican
	{
	
	public Goose()
		{
		name = "Goose";
		mainQuality = "persevering, dogged, and ambitious to a fault";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("Driven is the watchword for the Goose's dominating personality trait - which ");
		System.out.println("makes them excellent in business and competitive sports. When tempered with");
		System.out.println("supportive, nurturing family and friends, the Goose excels in all things he/she attempts.");
		}
	}
