package intro;

public class MiniProj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nub = 27, tot = 0;
		
		for(int i = 1 ; i < nub ; i++) {
			if(nub % i == 0) {
				tot += i;
			}
		}
		
		if(tot == nub) {
			System.out.println("mükemel sayı");
		}else {
			System.out.println("sayı mükemmel değil");
		}
	}

}
