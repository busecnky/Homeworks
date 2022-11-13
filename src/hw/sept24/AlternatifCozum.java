package hw.sept24;

import java.util.Scanner;

public class AlternatifCozum {

	public static void main(String[] args) {
		// BMI Hesaplama

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cinyetiniz erkek mi?: (Erkekseniz \"true\" kadınsanız \"false\" yazmanız gerekmektedir");
		boolean cinsiyet = scanner.nextBoolean();
		System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
		float boy = scanner.nextInt();
		System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
		float agirlik = scanner.nextInt();
		
		float BMI = ((agirlik*10000)/(boy*boy));
		
		System.out.println("Sizin vücut kitle endeksiniz: " + BMI);
				
		if (cinsiyet == true && BMI<20){
		System.out.println("Zayıf");
		}
		else if (cinsiyet == true && BMI>=20 && BMI<=25) {
		System.out.println("Normal");
		}
		else if (cinsiyet == true && BMI>=26 && BMI<=30) {
		System.out.println("Şişman");
		}
		else if (cinsiyet == true && BMI>30) {
		System.out.println("Obez");
		}
		else if (cinsiyet == false && BMI<19){
		System.out.println("Zayıf");
		}
		else if (cinsiyet == false && BMI>=19 && BMI<=24) {
		System.out.println("Normal");
		}
		else if (cinsiyet == false && BMI>=25 && BMI<=30) {
		System.out.println("Şişman");
		}
		else if (cinsiyet == false && BMI>30) {
		System.out.println("Obez");
		}
		
		scanner.close();
		
	}
	
}
