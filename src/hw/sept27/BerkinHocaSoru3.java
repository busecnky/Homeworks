package hw.sept27;

import java.util.Scanner;

public class BerkinHocaSoru3 {

	public static void main(String[] args) {

		// Tahmin oyunu
		// rastGele bir sayı oluşturcaz
		// rastgele sayı oluşturma--> int rastGeleSayi = (int) (Math.random() * 100);
		// o sayıyı tahmin etmeye çalışcaz
		// tahmin ettiğimiz sayı bulcağımız sayıdan fazla ise tahmini azalt yazdırın
		// az ise tahmini artır yazalım
		// sayıyı bulduğumuzda kaçıncı seferde bulduğumuzu yazdıralım
		// Her yanlış tahminde döngüden çıkmadan bize tekrar tahminimizi sorsun .

		// while ile çözüm

		Scanner scanner = new Scanner(System.in);

		int rastGeleSayi = (int) (Math.random() * 100);

		//System.out.println(rastGeleSayi); //Kodu denemek için yazılmış satır.
		System.out.println("Bir ile yüz arasında bir sayı tahmin ediniz. ");
		int k = 1;

		boolean kontrol = false;
		
		while (kontrol == false) {

			int tahmin = scanner.nextInt();
			if (tahmin < rastGeleSayi) {
				System.out.println("Sayıyı büyütüp tekrar deneyiniz.");
				k++;
			} else if (tahmin > rastGeleSayi) {
				System.out.println("Sayıyı küçültüp tekrar deneyiniz.");
				k++;
			} else if (tahmin == rastGeleSayi) {
				kontrol = true;
				System.out.println("Tebrikler " + k + ". tahminde buldunuz!");
			}
		}

		scanner.close();

	}

}
