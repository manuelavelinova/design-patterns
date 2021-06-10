package MediatorAndSingleton;

public class Singleton {
	field dialog: MediatorAndSingleton
	
	private static Singleton bott;

	private Singleton() {
		
	}
	
	public static Singleton getInstance() {

		if(bott == null) {
			bott = new Singleton();
			
		}
		
		return bott;
	}
	
	public void consumeMessage(String message) {
			
		//if (message.contains("cat")) {
			//users.removeUsers()
			
		System.out.println("Message from singleton instance : " + message);
		
	}

	
	}
	

}
