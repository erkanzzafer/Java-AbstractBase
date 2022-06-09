
public class Main {

	public static void main(String[] args) {
		
		//Farklı veritabanları için soyutlama
		
		CustomerManager customerManager=new CustomerManager();
		
		//customerManager ın database manager i ayarlanacak
		customerManager.databaseManager=new OracleDatabaseManager();//configurasyon değişebilir 
		customerManager.getCustomers();
		

	}

}
