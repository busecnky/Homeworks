package hw.sept27;

import java.util.Scanner;

public class GurayHocaOdev1 {

	public static void main(String[] args) {

		//Kullanıcının girdiği pozitif bir tamsayıyı (int) ters çeviren ve görüntüleyen bir uygulama yazın. 
		//(Not: String ve char kullanarak yapınız) 
		
		//Örn. 2345 => 5432 


		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		String sayi = scanner.nextLine();

		for(int i = (sayi.length()-1); i >= 0 ; i--) {
			char yeniChar = sayi.charAt(i);
			System.out.print(yeniChar);
		}
			
		
		
	}

}
