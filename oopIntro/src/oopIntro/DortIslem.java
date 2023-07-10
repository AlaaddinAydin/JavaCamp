package oopIntro;

public class DortIslem {
	public int topla(int... sayılar) {
		int tot = 0;
		
		for (int i : sayılar) {
			tot += i;
		}
		
		return tot;
	}
	
	public int cıkar(int... sayılar) {
		int tot = 0;
		
		for (int i : sayılar) {
			tot -= i;
		}
		
		return tot;
	}
	
	public int bolme(int sayı1 , int sayı2) {
		return sayı1 / sayı2 ;
	}
	
	public int carp(int... sayılar) {
		int tot = 0;
		
		for (int i : sayılar) {
			tot *= i;
		}
		
		return tot;
	}
}	