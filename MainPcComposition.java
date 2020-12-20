public class MainPcComposition
{

	public static void main(String[] args)
	{
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase =  new Case("220B", "Dell", "240", dimensions);


		Monitor theMonitor = new Monitor("29inch Beast", "LG", 29, new Resolution(2540, 1440));

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		
		//to access the method "drawPixelAt" from Monitor.java
		thePC.getMonitor().drawPixelAt(1500, 1200, "red");

		//to access the method "loadProgram" from Motherboard.java
		thePC.getMotherboard().loadProgram("Windows 10");

		//to access the method "pressPowerButton" from Case.java
		thePC.getTheCase().pressPowerButton();
/*
		thePC.powerUp();
*/
	}
}