
public class Main {

	public static void main(String[] args) {
		
		//Farkl� veritabanlar� i�in soyutlama
		
		CustomerManager customerManager=new CustomerManager();
		
		//customerManager �n database manager i ayarlanacak
		customerManager.databaseManager=new OracleDatabaseManager();//configurasyon de�i�ebilir 
		customerManager.getCustomers();
		

	}

}
