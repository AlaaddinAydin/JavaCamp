package abstractDemo;

public class SqlserverDatabaseMAnager extends BaseDatabaseManager{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("sql servera eklendi");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("sql serverdan silindi");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("sql serverdan getirildi");
	}

}
