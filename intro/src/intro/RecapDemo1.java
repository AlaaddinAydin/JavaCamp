package intro;

public class RecapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayı1 = 60 ,sayı2 = 20 , sayı3 = 40;
		int enb= 0;
		
		enb = sayı1;
		if(enb < sayı2) {
			enb = sayı2;
		}
		if(enb < sayı3) {
			enb = sayı3;
		}
		
		System.out.println(enb);
	}

}
