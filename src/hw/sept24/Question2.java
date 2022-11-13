package hw.sept24;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Girilen kilo değerinni diğer gezegenlerde kaç kilo olduğunu bulan program
		// Ağırlık = kütle * yerçekimi
		//örnk input --> kilo girin 70
		//output --> ayda 80kg, marsta 95kg, saturnde 88kg....
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu kg cinsinden giriniz: ");
		float kilo = scanner.nextInt();
		
		float ay = (float) ((kilo/9.81)*1.62);
		System.out.println("Aydaki kilonuz: " + ay);
		
		float gunes = (float) ((kilo/9.81)*247.2);
		System.out.println("Güneşteki kilonuz: " + gunes);

		float merkur = (float) ((kilo/9.81)*3.71);
		System.out.println("Merkürdeki kilonuz: " + merkur);
		
		float venus = (float) ((kilo/9.81)*8.87);
		System.out.println("Venüsteki kilonuz: " + venus);
		
		float mars = (float) ((kilo/9.81)*1.62);
		System.out.println("Marstaki kilonuz: " + mars);
		
		float jupiter = (float) ((kilo/9.81)*23.30);
		System.out.println("Jüpiterdeki kilonuz: " + jupiter);
		
		float saturn = (float) ((kilo/9.81)*9.2);
		System.out.println("Satürndeki kilonuz: " + saturn);
		
		float uranus = (float) ((kilo/9.81)*8.69);
		System.out.println("Uranüsteki kilonuz: " + uranus);
		
		float neptun = (float) ((kilo/9.81)*11);
		System.out.println("Neptündeki kilonuz: " + neptun);
		
		float pluton = (float) ((kilo/9.81)*0.06);
		System.out.println("Plütondaki kilonuz: " + pluton);
		
		scanner.close();
	}

}
