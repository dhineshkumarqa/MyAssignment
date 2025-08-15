package week4.day1;

public class JavaConnections extends MySqlConnection
{

	@Override
	public void executeQuery()
	{
		System.out.println("execute the query");	
	}

	public static void main(String[] args) {
		JavaConnections connect = new JavaConnections();
		connect.connect();
		connect.disconnect();
		connect.executeQuery();
		connect.executeUpdate();
	}
	
}
