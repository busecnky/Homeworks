package hw.sept27;

import java.util.Scanner;

public class BerkinHocaSoru2 {

	public static void main(String[] args) {
		
		
		// Swtich case ile 
		//input --> mehmet
		//input--> hangisi işlemi yapmak istiyosunuz
		/*
		System.out.println("1- Kelimeleri Büyük Harf Yap");
	    System.out.println("2- kelimenin harflerini Küçük yap");
	    System.out.println("3- kelimenin harflerinin arasına ? koy");
	    //mehmet m?h?m?e?t
	    System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
	    //     mehmet   
	    System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin");
	    //replace replaceAll("a", ?")
	    System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
	    // mehmet
	    //meh...
	    //substring()
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen işlem yapmak istediğiniz kelimeyi giriniz: ");
		String kelime = scanner.nextLine();
		System.out.println("Hangi işlemi yapmak istersiniz?");
		System.out.println("Kelimenin bütün harflerini büyük harf yapmak için 1'i tuşlayınız.");
		System.out.println("Kelimenin bütün harflerini küçük harf yapmak için 2'yi tuşlayınız.");
		System.out.println("kelimenin harflerinin arasına ? koymak için 3'ü tuşlayınız.");
		System.out.println("kelimenin başındaki ve sonundaki boşlukları silmek için 4'ü tuşlayınız.");
		System.out.println("Kelimenin içindeki bütün a harflerini ? ile değiştirmek için 5'i tuşlayınız.");
		System.out.println("Kelimenin ilk üç indexinin alıp sonuna ... koymak için 6'yı tuşlayınız.");
		
		
	boolean check = false;
		while (check == false) {
			int islem = scanner.nextInt();
			if (!(islem >=1 && islem<=6)) {
				System.out.println("Yanlış seçim lütfen 1-6 arasında bir değer giriniz.");
				
			}else
				check = true;
			
		
		switch (islem) {
		case 1:
			String yeni1 = kelime.toUpperCase();
			System.out.println(yeni1);
			break;
		case 2:
			String yeni2 = kelime.toLowerCase();
			System.out.println(yeni2);			
			break;
		case 3:
			for (int i = 0; i < kelime.length()-1; i++) {
				System.out.print(kelime.charAt(i) + "?");
			}System.out.print(kelime.charAt((kelime.length() - 1)));
			break;
		case 4:
			System.out.println(kelime.trim());
			break;
		case 5:
			System.out.println(kelime.replace('a', '?'));
			break;
		case 6:
			String yeni3 = kelime.substring(0,3);
			System.out.println(yeni3 + "...");
			break;
		default:
		
			break;
		}
		
		}
		
		
		
		
		scanner.close();
		
		
		
		
	}
}
