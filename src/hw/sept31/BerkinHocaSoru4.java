package hw.sept31;

public class BerkinHocaSoru4 {

	public static void main(String[] args) {

		// Bir dizide 13 var ise 13 ve bir sonraki elemanı toplama eklemeden toplam
		// sonucu bulan kod

		int nums[] = {13, 1, 13, 13, 13, 2, 5, 13, 1, 13, 5, 12, 2 ,13, 2, 4, 13};

		int toplam = 0;

		for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                if (i != nums.length - 1) {
                    i++;
                    if(nums[i]==nums[i-1]) {
                        i--;
                    }
                }
			} else {
				toplam += nums[i];
				System.out.println(nums[i] + " eklerse toplam = " + toplam); //kodu denemek için olan satır
			}
		}

		System.out.println("Toplam = " + toplam);


	}

}
