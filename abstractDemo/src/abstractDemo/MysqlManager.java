package abstractDemo;

public class MysqlManager extends BaseDatabaseManager{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("My sql veritabanın eklendi");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("My sql veritabanından silindi");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("My sql veritabanından getirildi");
	}
	
}
