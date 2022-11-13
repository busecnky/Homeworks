package hw.sept27;


public class GurayHocaOdev2 {
		
	public static void main(String[] args) {
		
		//String metin = "Bugün Java ile string konusunu işleyeceğiz"; 

		//Verilmiş olsun. 
		//Metin değişkeninin içinde “i” harfinin geçtiği yerlerin indeksini 
		//bir while loop ve indexOf metodlarını kullanarak bulup ekrana yazdıran bir program yazınız. 
		//Çıktı şu şekilde olmalı 

		//i harfinin geçtiği yerler: 11, 18, 31, 40
		
		
		String metin = "Bugün Java ile string konusunu işleyeceğiz"; 
		
		
			int	index = metin.indexOf('i');
			System.out.print(index);
			index++;
				while (index < metin.length()-1) {
					int newIndex = metin.indexOf(('i') , index) ;  
					if (index == newIndex) {
					System.out.print(", " + newIndex);
					index++;
					}
					else
						index++;
					}
					
		
	}
}
