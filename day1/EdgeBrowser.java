package week2.day1;

public class EdgeBrowser {

 public static void main(String args[])
 {
	 Browser cite1 = new Browser();
	 String launchBrowser = cite1.LaunchBrowser("chrome");
	 System.out.println(launchBrowser);
	 cite1.loadUrl();
 }
}
