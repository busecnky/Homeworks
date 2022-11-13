package hw.sept27;

import java.util.Scanner;


public class BerkinHocaSoru1 {

	
	
	public static void main(String[] args) {

		//kullanıcıdan bir kelime alın
        // eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın
        
        // eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin
        
        //eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın
        
        //replace metodu
        //charAt()
        //kelime.startsWith("a")
        //length()

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		
		if (kelime.startsWith("a")) {
			System.out.println("Son harfi: " + kelime.substring(kelime.length()-1));
		}
		
		else if ((kelime.startsWith("b"))) {
			int index = 0;
			char character = '@';
			kelime = kelime.substring(0, index) + character + kelime.substring(index + 1);
			System.out.println("Düzenlenmiş kelime = " + kelime);
		}
		else  {
			System.out.println("Kelimenin ilk harfi " + kelime.charAt(0));
		}
		
	

		
	
	scanner.close();
	
	
	
	}
	
	
}
