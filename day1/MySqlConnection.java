package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection 
{

     public void connect()
     {
    	 System.out.println("connect");
     }
	
	public void disconnect()
	{
	   System.out.println("disconnect");	
	}
	
	public void executeUpdate()
	{
		System.out.println("executeUpdate");
		
	}
	
	public abstract void executeQuery();


	
}
