package hw.sept24;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// BMI Hesaplama

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cinsiyetiniz?: (Erkekseniz 1'i kadınsanız 2'yi tuşlayınız)");
		int cinsiyet = scanner.nextInt();
		System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
		float boy = scanner.nextInt();
		System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
		float agirlik = scanner.nextInt();
		
		float BMI = ((agirlik*10000)/(boy*boy));
		
		System.out.println("Hesaplanan vücut kitle endeksi değeriniz: " + BMI);
				
	
		if (cinsiyet == 1) { 
				if (BMI<20){
					System.out.println("Zayıf");
				}
				else if (BMI>=20 && BMI<=25) {
					System.out.println("Normal");
				}
				else if (BMI>=26 && BMI<=30) {
					System.out.println("Şişman");
				}
				else if (BMI>30) {
					System.out.println("Obez");
				}
		
		}
		
		if (cinsiyet == 2) { 
			if (BMI<19){
				System.out.println("Zayıf");
			}
			else if (BMI>=19 && BMI<=24) {
				System.out.println("Normal");
			}
			else if (BMI>=25 && BMI<=30) {
				System.out.println("Şişman");
			}
			else if (BMI>30) {
				System.out.println("Obez");
		
			}
		}
		scanner.close();
	}
}
