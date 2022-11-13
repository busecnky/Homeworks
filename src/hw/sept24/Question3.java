package hw.sept24;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// //2- bu sefer hem kilo hem gezegen girdisi alıyoruz girdiğimiz gezegen değerine göre ekrana yazdırıyo
		
		// 1- ay
		// 2- Saturn
		// 3- Mart
		// 4- Venüs
		
		//input --> kg girin, (75)
		//input --> gezegen adı girin (ay)
		//output--> aydaki kilonuz 85

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
		float kilo = scanner.nextInt();
		System.out.println("Gezegen numarası giriniz: \n 1-Ay \n 2-Güneş \n 3-Merkür \n 4-Venüs \n 5-Mars \n 6-Jüpiter \n 7-Satürn \n 8-Uranüs \n 9-Neptün \n 10-Plüton");
		int gezegen = scanner.nextInt();
		
		
		
		if (gezegen == 1) {
		float ay1 = (float) ((kilo/9.81)*1.62);
		System.out.println("Aydaki kilonuz: " + ay1);
		}
		
		if (gezegen == 2) {
		float gunes = (float) ((kilo/9.81)*247.2);
		System.out.println("Güneşteki kilonuz: " + gunes);
		}
		
		if (gezegen == 3) {
		float merkur = (float) ((kilo/9.81)*3.71);
		System.out.println("Merkürdeki kilonuz: " + merkur);
		}
		
		if (gezegen == 4) {
		float venus = (float) ((kilo/9.81)*8.87);
		System.out.println("Venüsteki kilonuz: " + venus);
		}
		
		if (gezegen == 5) {
		float mars = (float) ((kilo/9.81)*1.62);
		System.out.println("Marstaki kilonuz: " + mars);
		}
		
		if (gezegen == 6) {
		float jupiter = (float) ((kilo/9.81)*23.30);
		System.out.println("Jüpiterdeki kilonuz: " + jupiter);
		}
		
		if (gezegen == 7) {
		float saturn = (float) ((kilo/9.81)*9.2);
		System.out.println("Satürndeki kilonuz: " + saturn);
		}
		
		if (gezegen == 8) {
		float uranus = (float) ((kilo/9.81)*8.69);
		System.out.println("Uranüsteki kilonuz: " + uranus);
		}
		
		if (gezegen == 9) {
		float neptun = (float) ((kilo/9.81)*11);
		System.out.println("Neptündeki kilonuz: " + neptun);
		}
		
		if (gezegen == 10) {
		float pluton = (float) ((kilo/9.81)*0.06);
		System.out.println("Plütondaki kilonuz: " + pluton);
		}
		
		scanner.close();
		
		
		
		
	}

}
