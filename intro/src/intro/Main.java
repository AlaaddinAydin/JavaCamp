package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//don't repeat yourself
		String internetSubeButonu = "İnternet Şubesi";
		int vade = 36;
		double dolarBugun = 8.15;
		double dolarDun = 8.15;
		boolean dustuMu = false ;
		
		
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar dustu resmi");
		}else if(dolarBugun > dolarDun) {
			System.out.println("Dolar yukseldi resmi");
		}else {
			System.out.println("dolar eşitir resmi");
		}
		
		
		
		String[] krediler = {
				"hızlı kredi" , 
				"mutlu emekli kredisi",
				"çiftçi kredisi",
				"msb kredisi",
				"meb kredisi",
				"konut kredisi",
				"kültür bakanlığı kredisi"
				};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
			
		}
		
		for (int i = 0 ; i < krediler.length ; i++) {
			System.out.println(krediler[i]);
		}
	}

}
