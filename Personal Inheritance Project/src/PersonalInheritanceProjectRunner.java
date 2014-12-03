import java.util.Scanner;
public class PersonalInheritanceProjectRunner
	{
	protected static int choice = 0;
	
	public static void main(String[] args)
		{
		System.out.println("Would you like to recieve you Classic or Native American Zodiac sign? (Corresponding number please)");
		System.out.println();
		System.out.println("1)	Classic");
		System.out.println("2)	Native American");
		System.out.println();
		Scanner keyboard = new Scanner(System.in);
		choice = keyboard.nextInt();
		switch(choice)
			{
			case 1:
				{
				Zodiac a = new Classic();
				a.predictPersonality();
				break;
				}
			case 2:
				{
				Zodiac b = new NativeAmerican();
				b.predictPersonality();
				break;
				}
			default:
				{
				System.out.println();
				System.out.println("That is not a valid entry.");
				}
			}
		}

	}
