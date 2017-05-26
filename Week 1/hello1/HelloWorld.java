import edu.duke.*;

public class HelloWorld {
	public void runHello () {
		URLResource webpage = new URLResource("http://www.dukelearntoprogram.com/java/somefile.txt");
		for (String line : webpage.words()) {
			System.out.println(line);
		}
	}
}
