package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connection made successfully");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Connection is get discoonected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("the execution is get updated");
		
	}
	
	public static void main(String[] args) 
	{
		JavaConnection methods = new JavaConnection();
		methods.connect();
		methods.disconnect();
		methods.executeUpdate();

	}

}
