package week2.day1;

public class Browser 
{
	
	public String LaunchBrowser(String browserName)
	{
		System.out.println("Broswer Launched  Succesfully");
		return browserName;
	}
	
	public void loadUrl()
	{
		System.out.println("Application Url Loaded Succesfully");
	}
    
	public static void main(String args[])
	{
		Browser cite = new Browser();
		String launchBrowser = cite.LaunchBrowser("Java Browser");
		System.out.println(launchBrowser);
		cite.loadUrl();
		
	}
	
}
