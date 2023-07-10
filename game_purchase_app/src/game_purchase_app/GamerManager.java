package game_purchase_app;

public class GamerManager implements GamerGrudService{

	PersonCheckService personCheckService ;
	
	public GamerManager(PersonCheckService personCheckService) {
		// TODO Auto-generated constructor stub
		this.personCheckService = personCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		if(personCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu başarılı bir şekilde eklendi");
		}else
		{
			System.out.println("mal mal konuşma");
		}
	}


	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		if(personCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu başarılı bir şekilde eklendi");
		}else
		{
			System.out.println("mal mal konuşma");
		}
	}


	@Override
	public void updata(Gamer gamer) {
		// TODO Auto-generated method stub
		if(personCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu başarılı bir şekilde eklendi");
		}else
		{
			System.out.println("mal mal konuşma");
		}
	}

	

	
	
}
