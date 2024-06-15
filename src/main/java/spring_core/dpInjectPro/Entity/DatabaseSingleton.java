package spring_core.dpInjectPro.Entity;

public class DatabaseSingleton {
	
	private DatabaseSingleton() {}
	
	private static DatabaseSingleton obj = new DatabaseSingleton();
	
	public static DatabaseSingleton getInstance() {
		System.out.println("DatabaseSingleton.getInstance()");
		return obj;
	}
	
	

}
