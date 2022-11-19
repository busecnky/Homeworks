package hw.november17;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static Televizyon tv = new Televizyon();
	
	

	public static void menuGoster() {
		System.out.println("***MENU****");
		System.out.println("0- Çıkış \n" + 
						"1-- Televizyon Kur\n" +
						"2-- Televizyonu Aç\n" + 
						"3-- Sesini Artır\n" +
						"4--Sesi Azalt\n" +
						"5-- Kanal Değiştir\n" +
						"6-- Kanal Arttır\n" +
						"7-- Kanal Azalt\n" +
						"8-- Kanal Bilgisi Göster\n" +
						"9-- Televizyonu Kapat\n" +
						"10-- Menüyü Goster\n");
	}
	
	public static void tvManager() {
		menuGoster();
		boolean check = true;
		while (check) {
			System.out.println("Seçiminiz (Menüyü Görmek için 10)");
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				 tv.tvKur();
				break;
			case 2:
				tv.tvAc();
				break;
			case 3:
				tv.sesiniAc();
				break;
			case 4:
				tv.sesiniKis();
				break;
			case 5:
				tv.kanalDegistir();
				break;
			case 6:
				tv.kanalArttır();
				break;
			case 7:
				tv.kanalAzalt();
				break;
			case 8:
				tv.kanalBilgisiGoster();
				break;
			case 9:
				tv.tvKapat();
				break;
			case 10:
				menuGoster();
				break;
			case 0:
				check = false;
				System.out.println("Sistemden çıktınız");
				break;
			default:
				System.out.println("Hatalı tuşlama yaptınız.");
				break;
			}
		}
	}

	

	
	public static void main(String[] args) {
		
		tvManager();
		
		
		
	}
	
	
}
