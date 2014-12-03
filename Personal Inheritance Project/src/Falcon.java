
public class Falcon extends NativeAmerican
	{
	public Falcon()
		{
		name = "Falcon";
		mainQuality = "ever persistent and always taking the initiative";
		}
	
	@Override
	public void printSummary()
		{
		System.out.println();
		System.out.println("You are a " + name + "!");
		System.out.println("The main qualities of a " + name + " are that they are " + mainQuality + ".");
		System.out.println();
		System.out.println("A natural born leader, the Falcon can always be looked upon for clear judgment in sticky situations.");
		System.out.println("Furthermore, the characteristics for this Native American animal symbol never wastes time,");
		System.out.println("rather striking while the iron is hot, and takes action in what must be done.");
		}
	}
