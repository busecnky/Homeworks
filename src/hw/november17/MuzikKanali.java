package hw.november17;

import java.util.ArrayList;

public class MuzikKanali extends Kanal {
	
	private String muzikTuru;
	

	public MuzikKanali(String kanalAdi, int kanalNo, String muzikTuru) {
		super(kanalAdi, kanalNo);
		this.setMuzikTuru(muzikTuru);
	}


	


	public String getmuzikTuru() {
		return muzikTuru;
	}
	public void setMuzikTuru(String muzikTuru) {
		this.muzikTuru = muzikTuru;
	}
	
	


	
	
	
	
	
	
}
