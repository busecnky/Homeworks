package hw.november2;

public class BerkinHocaSoru5 {

	public static void main(String[] args) {
		// 1- verilen sehirler arrayinde ";" dan öncesini ayırıyoruz(split())
		// ayırdğımız bu veriyi yeni bir arraye atıyoruz ve yeni arrayı ekrana
		// bastırıyoruz,

		// 2- daha sonra
		// “Adananın plaka kodu 01” örnek çıktışı gibi ekrana tekrar bastırıyoruz
		// Sehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra

		// split()
		// indexOf()
		// substring()

		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] sehirler2 = sehirler.split(";");

		for (int i = 0; i < sehirler2.length; i++) {
			//System.out.println(sehirler2[i]);
			
			String[] plakalar = new String[sehirler2.length];
			String[] iller = new String[sehirler2.length];
			
			plakalar[i] = sehirler2[i].substring(0,sehirler2[i].indexOf('-')); 
			iller[i] = sehirler2[i].substring(sehirler2[i].indexOf('-')+1 , sehirler2[i].length()) ;
			
			System.out.println(iller[i] + " adlı şehirin plaka kodu: "+ plakalar[i]);
			
		}
			

	}

}
