package intro;

public class MiniProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Asal sayı bulucu
		
		int nub = 9;
		boolean st = false;
		
		
		if(nub == 1) {
			System.out.println("sayı asal değildir");
		}
		if(nub < 1) {
			System.out.println("Geçerli sayı giriniz");
			return;
		}
			
			
		for(int i = 2 ; i < nub ;i++ ){
			if(nub % i == 0) {
				st = true;
			}
		}
		
	
		if(st) {
			System.out.println("sayı asal değildir");
		}
		else {
			System.out.println("sayı asaldır");  
		}

	}
}